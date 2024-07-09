/*
    Desenvolva um programa que leia o primeiro termo e a razão de uma
    PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
    a soma entre todos os valores da sequência.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o primeiro termo da PA: ");
        int termo = scanner.nextInt();

        System.out.println("\nInforme a razão da PA: ");
        int razao = scanner.nextInt();

        int contador = 1;

        for(var i = termo; i < razao * 10; i += razao) {
            System.out.println("Indice: " + contador + " Valor: " + i);
            contador++;
        }

        scanner.close();
    }
}