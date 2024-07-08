/*
    Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
    situação em relação ao alistamento militar.
    - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
    alistamento.
    - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
    alistamento.
*/
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a data atual
        LocalDate data = LocalDate.now();

        // Pegar ano atual
        int anoAtual = data.getYear();

        System.out.println("\nEm qual ano você nasceu?");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade == 18) {
            System.out.println("Está na hora de se alistar!");
        } else if(idade > 18) {
            System.out.println("O alistamento já passou...");
        } else {
            System.out.println("Ainda é cedo pra se alistar...");
        }

        scanner.close();
    }
}