/*
    Faça um algoritmo que pergunte a distância que um passageiro deseja
    percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
    viagens até 200Km e R$0.45 para viagens mais longas.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a distância que você pretende percorrer em KM?");
        float distancia = scanner.nextFloat();

        // Preco por km
        double precoPorKm;

        if(distancia > 200) {
            precoPorKm = 0.45;
        } else {
            precoPorKm = 0.5;
        }

        double total = precoPorKm * distancia;

        System.out.println("\nPreço total da passagem: " + total);

        scanner.close();
    }
}