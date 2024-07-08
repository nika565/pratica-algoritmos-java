/*
    Faça uma programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um objetos scanner para leitura de input
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");

        scanner.close();
    }
}