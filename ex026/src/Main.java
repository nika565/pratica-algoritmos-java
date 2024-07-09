/*
    Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
    na tela uma das mensagens abaixo:
    - O primeiro valor é o maior
    - O segundo valor é o maior
    - Não existe valor maior, os dois são iguais
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("\nDigite outro número inteiro:");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("\nO primeiro valor é o maior");
        } else if(num2 > num1) {
            System.out.println("\nO segundo valor é maior");
        } else {
            System.out.println("\nOs valores são iguais");
        }

        scanner.close();
    }
}