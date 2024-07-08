/*
    Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre
    quantos dólares ela pode comprar. Considere US$1,00 = R$6,00.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Qual é o seu saldo na carteira?");
        float saldo = scanner.nextFloat();
        float qtdDolares = saldo / 6;

        System.out.println("O seu saldo permite que você compre " + qtdDolares + " Dólares...");

        scanner.close();

    }
}