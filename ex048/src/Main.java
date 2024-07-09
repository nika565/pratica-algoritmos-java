/*
    Faça um programa que leia 7 números inteiros e no final mostre o somatório
    entre eles.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDIGITE 7 NÚMEROS PARA REALIZAR A SOMA ENTRE ELES");

        byte contador = 1;
        int acumulador = 0;

        while(contador <= 7) {

            System.out.print("\n" + contador + ": ");
            acumulador += scanner.nextInt();

            contador++;
        }

        System.out.println("\nResultado da soma entre os 7 números: " + acumulador);

        scanner.close();
    }
}