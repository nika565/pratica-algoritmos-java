/*
    A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
    um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
    quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
    sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços
        byte valorDia = 90;
        float valorPorKm = 0.20F;

        System.out.println("\nQuantos Dias foram usados?");
        int qtdDiasUso = scanner.nextInt();

        System.out.println("\nQuantos quilômetros foram percorridos??");
        float qtdKmRodado = scanner.nextFloat();

        // Cálculo do total:
        double total = (qtdDiasUso * valorDia) + (qtdKmRodado * valorPorKm);

        System.out.printf("Total: %2f", total);

        scanner.close();
    }
}