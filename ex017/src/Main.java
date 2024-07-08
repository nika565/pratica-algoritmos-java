/*
    Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
    80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
    o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é a velocidade do carro?");
        float velocidade = scanner.nextFloat();

        if(velocidade > 80) {
            // Calculo da multa
            float diferenca = velocidade - 80;
            float multa = diferenca * 5;
            System.out.println("\nO limite de velocidade foi ultrapassado. Multa: " + multa);
        } else {
            System.out.println("Velocidade permitida...");
        }

        scanner.close();
    }
}