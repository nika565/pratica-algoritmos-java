/*
    Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau
    e mostre o valor de Delta.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o valor inteiro de A:");
        int A = (scanner.nextInt());

        System.out.println("\nInforme o valor inteiro de B:");
        int B = scanner.nextInt();

        System.out.println("\nInforme o valor inteiro de C:");
        int C = scanner.nextInt();

        double delta = B * B - 4 * A * C;

        System.out.printf("O valor de Delta é: %.2f", delta);

        scanner.close();
    }
}