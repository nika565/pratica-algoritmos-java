/*
    Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
    dela e depois mostre se ela pode ou não votar.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        if(idade >= 16) {
            System.out.println("\nPode Votar");
        } else {
            System.out.println("Não pode votar");
        }

        scanner.close();
    }
}