/*
    Crie um programa que leia 6 números inteiros e no final mostre quantos deles
    são pares e quantos são ímpares.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDIGITE 6 NÚMEROS INTEIROS...");

        int contador = 1;
        int qtdPar = 0;
        int qtdImpar = 0;

        while(contador <= 6) {

            System.out.print("\n" + contador + ": ");
            int num = scanner.nextInt();

            if(num % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }

            contador++;
        }

        System.out.println("\nQuantidade de números pares digitados: " + qtdPar);
        System.out.println("Quantidade de números ímpares digitados: " + qtdImpar);

        scanner.close();
    }
}