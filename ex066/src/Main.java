/*
    Escreva um programa que leia um número qualquer e mostre a tabuada desse
    número, usando a estrutura “for”.

    Ex: Digite um valor: 5
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15 ...
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro para saber sua tabuada");
        int num = scanner.nextInt();

        int valorAtual = 0;

        for(var i = 1; i <= 10; i++){
            valorAtual = num * i;

            System.out.println(num + " x " + i + " = " + valorAtual);
        }

        scanner.close();
    }
}