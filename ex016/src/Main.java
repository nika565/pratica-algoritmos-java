/*
    Escreva um programa para calcular a redução do tempo de vida de um
    fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos ele
    já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
    quantos dias de vida um fumante perderá e exiba o total em dias.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuantos cigarros você fuma por dia?");
        int qtdCicarrosDia = scanner.nextInt();

        System.out.println("\nHá quantos anos você fuma?");
        int qtdAnosFumando = scanner.nextInt();

        // Cálculo
        double qtdMinutosTotais = 10 * qtdCicarrosDia;
        double qtdDiasTotais = 365 * qtdAnosFumando;

        double qtdDeVidaPerdidaEmDias = ((qtdMinutosTotais * qtdDiasTotais) / 60) / 24;

        System.out.printf("Quantidade total de vida perdida em dias: %2f", qtdDeVidaPerdidaEmDias);
        scanner.close();
    }
}