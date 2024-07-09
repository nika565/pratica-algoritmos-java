/*
    Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
    perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:

    a) qual é a maior idade lida
    b) quantos homens foram cadastrados
    c) qual é a idade da mulher mais jovem
    d) qual é a média de idade entre os homens
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade = 0;
        int sexo = 0;
        byte flag = 0;
        double maiorIdade = 0;
        int qtdHomens = 0;
        double idadeMulherMaisJovem = 0;
        double somaIdadeHomens = 0;
        double mediaIdadeHomens = 0;


        while(true) {

            System.out.println("\nInforme a idade do usuário: ");
            idade = scanner.nextInt();

            System.out.println("\nInforme o sexo do usuário: ");
            System.out.println("Digite 0 para Feminino.");
            System.out.println("Digite 1 para Masculino.");
            sexo = scanner.nextInt();

            // maior idade lida
            if(idade > maiorIdade) {
                maiorIdade = idade;
            }

            // quantos homens foram cadastrados
            // qual é a média de idade entre os homens
            if(sexo == 1) {
                qtdHomens++;
                somaIdadeHomens += idade;
            }

            if(sexo == 0 && idadeMulherMaisJovem == 0) {
                idadeMulherMaisJovem = idade;
            }

            // qual é a idade da mulher mais jovem
            if(sexo == 0 && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade;
            }

            System.out.println("\nDeseja continuar o programa?");
            System.out.println("1 para continuar.");
            System.out.println("0 para parar o programa.");
            flag = scanner.nextByte();

            if(flag == 0) {
                break;
            }

        }

        mediaIdadeHomens = somaIdadeHomens / qtdHomens;

        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Qunatidade de homens cadastrados: " + qtdHomens);
        System.out.println("Idade da mulher mais jovem: " + idadeMulherMaisJovem);
        System.out.println("Média de idade entre os homens: " + mediaIdadeHomens);

        scanner.close();
    }
}