/*
    Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles:
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Digite um número inteiro:");
        int n1 = scanner.nextInt();

        System.out.println("\n Digite outro número inteiro:");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("O resultado da soma entre os números é de: " + soma);

        scanner.close();
    }
}