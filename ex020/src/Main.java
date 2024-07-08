/*
    Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
    ÍMPAR.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme um número inteiro:");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println("\nPAR");
        } else {
            System.out.println("\nÍMPAR");
        }

        scanner.close();
    }
}