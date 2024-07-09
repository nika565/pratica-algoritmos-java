/*
    Faça um programa usando a estrutura “for” que leia um número inteiro
    positivo e mostre na tela uma contagem de 0 até o valor digitado:

    Ex: Digite um valor: 9
    Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro positivo:");
        int num = scanner.nextInt();

        System.out.print("\n");
        for(var i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.print("FIM!");

        scanner.close();
    }
}