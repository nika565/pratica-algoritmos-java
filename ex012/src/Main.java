/*
    Crie um programa que leia o preço de um produto, calcule e mostre o seu
    PREÇO PROMOCINAL, com 5% de desconto
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o valor do produto");
        float valorProduto = scanner.nextFloat();

        // Calculo da porcentagem
        double valorDesconto = valorProduto * 0.05;

        double valorFinal = valorProduto - valorDesconto;

        System.out.printf("O Produto com desconto Promocional de 5%%: %2f", valorFinal);

        scanner.close();
    }
}