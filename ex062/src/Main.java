/*
    Faça um programa usando a estrutura “faça enquanto” que leia a idade de
    várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
    não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
    na tela:

    a) Quantas idades foram digitadas
    b) Qual é a média entre as idades digitadas
    c) Quantas pessoas tem 21 anos ou mais.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        int flag = 1;
        int contadorIdades = 0;
        int somaIdade = 0;
        int mediaIdade = 0;
        int qtdPessoasComMaisDe21Anos = 0;

        do {

            System.out.println("\nInforme a idade do usuário:");
            idade = scanner.nextInt();

            contadorIdades++;
            somaIdade += idade;

            if(idade >= 21) {
                qtdPessoasComMaisDe21Anos++;
            }

            System.out.println("\nDeseja para o programa? ");
            flag = scanner.nextInt();

        } while(flag == 1);

        mediaIdade = somaIdade / contadorIdades;

        System.out.println("\nQuantidade de idades digitadas: " + contadorIdades);
        System.out.println("Média das idades digitadas: " + mediaIdade);
        System.out.println("Qunatidade de pessoas com 21 anos ou mais: " + qtdPessoasComMaisDe21Anos);
        scanner.close();
    }
}