/*
    Crie um programa usando a estrutura “faça enquanto” que leia vários números.
    A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
    tela:

    a) O somatório entre todos os valores
    b) Qual foi o menor valor digitado
    c) A média entre todos os valores
    d) Quantos valores são pares
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int flag = 0;
        int soma = 0;
        int menorValor = 0;
        int media = 0;
        int qtdPares = 0;
        int qtdPessoas = 0;

        do {

            System.out.println("\nDigite algum número inteiro positivo: ");
            num = scanner.nextInt();

            qtdPessoas++;
            soma += num;

            // Lógica da primeira iteração para capturar o menor valor
            if(flag == 0) {
                menorValor = num;
            }

            if(num < menorValor) {
                menorValor = num;
            }

            if(num % 2 == 0) {
                qtdPares++;
            }

            System.out.println("\nQuer continuar o programa?");
            System.out.println("1 - SIM");
            System.out.println("0 - NÃO");
            flag = scanner.nextInt();
        } while(flag == 1);

        media = soma / qtdPessoas;

        System.out.println("Soma entre todos os valores: " + soma);
        System.out.println("Menor valor digitado: " + menorValor);
        System.out.println("Média dos valores: " + media);
        System.out.println("Quantidade de valores pares: " + qtdPares);

        scanner.close();
    }
}