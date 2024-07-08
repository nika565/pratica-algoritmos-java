/*
    Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área
    a ser pintada e a quantidade de tinta necessária para o serviço,
    sabendo que cada litro de tinta pinta uma área de 2 metros quadrados
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buscando valores
        System.out.println("\nInforme a largura da parede: ");
        float largura = scanner.nextFloat();

        System.out.println("\nInforme a altura da parede: ");
        float altura = scanner.nextFloat();

        // Calculando valores
        float tamanhoParede = largura * altura;
        float qtdLitrosTinta = tamanhoParede / 2;

        System.out.printf("\nTamanho da parede em metros quadrados é igual a: %.2f\n", tamanhoParede);
        System.out.printf("\nQuantidade de litros de tinta para pintar a parede: %.2f\n", qtdLitrosTinta);

        scanner.close();
    }
}