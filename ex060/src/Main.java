/*
    Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
    O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:

    a) O nome da pessoa mais velha
    b) O nome da mulher mais jovem
    c) A média de idade do grupo
    d) Quantos homens tem mais de 30 anos
    e) Quantas mulheres tem menos de 18 anos
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        String nomePessoaMaisVelha = "";
        String nomeMulherMaisJovem = "";
        double idade = 0;
        double idadePessoaMaisVelha = 0;
        double idadeMulherMaisJovem = 0;
        double sexo = 0;
        double somaIdadeGrupo = 0;
        double mediaIdadeGrupo = 0;
        int qtdHomensQueTemMaisDe30Anos = 0;
        int qtdMulheresQueTemMenosDe18Anos = 0;
        int flag = 1;
        int qtdPessoas = 0;

        while(true) {

            System.out.println("\nInforme o nome do usuário: ");
            nome = scanner.nextLine();

            System.out.println("\nInforme a idade do usuário: ");
            idade = scanner.nextDouble();

            System.out.println("\nInforme o sexo do usuário, sendo 0 para feminino e 1 para masculino");
            sexo = scanner.nextDouble();

            qtdPessoas++;

            // soma das idades
            somaIdadeGrupo += idade;

            // O nome da pessoa mais velha - pegando a idade
            if(idade > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idade;
                nomePessoaMaisVelha = nome;
            }

            if(sexo == 0) {

                // Executado na primeira iteração
                if(idadeMulherMaisJovem == 0) {
                    idadeMulherMaisJovem = idade;
                }

                // Pegando a idade da mulher mais jovem
                if(idade < idadeMulherMaisJovem) {
                    idadeMulherMaisJovem = idade;
                    nomeMulherMaisJovem = nome;
                }

                if(idade < 18) {
                    qtdMulheresQueTemMenosDe18Anos++;
                }

            }

            if(sexo == 1 && idade > 30) {
                qtdHomensQueTemMaisDe30Anos++;
            }

            // Continuar executando o programa
            System.out.println("\nDeseja continuar executando o programa?");
            flag = scanner.nextInt();

            if(flag == 0){
                break;
            }

            scanner.nextLine();

        }

        mediaIdadeGrupo = somaIdadeGrupo / qtdPessoas;

        System.out.println("\nNome da pessoa mais velha: " + nomePessoaMaisVelha);
        System.out.println("Nome da mulher mais jovem: " + nomeMulherMaisJovem);
        System.out.println("Média idade do grupo: " + mediaIdadeGrupo);
        System.out.println("Quantidade de homens que tem mais de 30 anos: " + qtdHomensQueTemMaisDe30Anos);
        System.out.println("Quantiade de mulheres que tem menos de 18 anos: " + qtdMulheresQueTemMenosDe18Anos);

        scanner.close();
    }
}