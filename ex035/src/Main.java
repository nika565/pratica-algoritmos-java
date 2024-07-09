/*
    Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
    aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
    carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
    que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
    quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
    tabela a seguir:
        - Carros populares (aluguel de R$90 por dia)
        - Até 100Km percorridos: R$0,20 por Km
        - Acima de 100Km percorridos: R$0,10 por Km
        - Carros de luxo (aluguel de R$150 por dia)
        - Até 200Km percorridos: R$0,30 por Km
        - Acima de 200Km percorridos: R$0,25 por Km
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual tipo de carro foi alugado?");
        System.out.println("1 - Popular");
        System.out.println("2 - Luxo");

        int tipoCarro = scanner.nextInt();

        System.out.println("\nQuantos Km foram percorridos?");
        double qtdKM = scanner.nextDouble();

        if(tipoCarro != 1 && tipoCarro != 2) {
            System.out.println("\nEssa opção não existe...");
            return;
        }

        // Definindo o preço do aluguel com base no tipo do carro
        double aluguel;
        if(tipoCarro == 1) {
            aluguel = 90;
        } else {
            aluguel = 150;
        }

        // Calculando o total
        double total;
        if(tipoCarro == 1 && qtdKM <= 100) {
            total = (qtdKM * 0.20) + aluguel;
        } else if(tipoCarro == 1 && qtdKM > 100) {
            total = (qtdKM * 0.10) + aluguel;
        } else if(tipoCarro == 2 && qtdKM <= 200) {
            total = (qtdKM * 0.30) + aluguel;
        } else {
            total = (qtdKM * 0.25) + aluguel;
        }

        System.out.println("Valor total: " + total);

        scanner.close();
    }
}