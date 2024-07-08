/*
    Crie um programa que leia o nome e o salário de um funcionário, mostrando no
    final uma mensagem:
    -- Nome do funcionário: fulano de tal
    -- Salário: 1200
    -- O funcionário tal tem uma salário de tal
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Olá! Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual é o seu salário atual " + nome + "?");
        double salario = scanner.nextDouble();

        System.out.println("--Nome do funcionário: " + nome);
        System.out.println("-- Salário do funcionário: " + salario);
        System.out.println("O funcionário " + nome + " tem um salário de R$" + salario);


        scanner.close();
    }
}