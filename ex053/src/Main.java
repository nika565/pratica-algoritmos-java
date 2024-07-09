/*
    Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:

    a) Quantos homens foram cadastrados
    b) Quantas mulheres foram cadastradas
    c) A média de idade do grupo
    d) A média de idade dos homens
    e) Quantas mulheres tem mais de 20 anos
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int idade = 0;
        int sexo = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;
        int somaIdade = 0;
        double mediaIdade = 0;
        int somaIdadeHomens = 0;
        double mediaIdadeHomens = 0;
        int mulheresMaioresDe20 = 0;

        while(contador <= 5) {

            System.out.println("\nInforme a idade da pessoa " + contador + ": ");
            idade = scanner.nextInt();

            System.out.println("\nInforme o sexo da pessoa " + contador + ": ");
            System.out.println("Digite 1 para Feminino.");
            System.out.println("Digite 2 para Masculino.");
            sexo = scanner.nextInt();

            if(sexo != 1 && sexo != 2) {
                System.out.println("\nOpção inválida...\nTente novamente...\n");
                continue;
            }

            // Somando a idade do grupo para fazer a média
            somaIdade += idade;

            // Verificando quantos homens tem no grupo
            if(sexo == 2) {
                qtdHomens++;

                // Somando a idade dos homens para fazer a média
                somaIdadeHomens += idade;
            }

            // Verificando quantas mulheres tem no grupo
            if(sexo == 1){
                qtdMulheres++;

                // Verificando quantas mulheres são maiores de 20 anos
                if(idade > 20) {
                    mulheresMaioresDe20++;
                }
            }

            contador++;
        }

        // Veriicando a média de idade do grupo
        mediaIdade = somaIdade / 5;
        mediaIdadeHomens = somaIdadeHomens / qtdHomens;

        System.out.println("\nQuantidade de homens cadastrados: " + qtdHomens);
        System.out.println("Quantidade de mulheres cadastradas: " + qtdMulheres);
        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Mulheres maiores de vinte anos: " + mulheresMaioresDe20);

        scanner.close();
    }
}