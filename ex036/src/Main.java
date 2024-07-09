/*
    Um programa de vida saudável quer dar pontos atividades físicas que podem
    ser trocados por dinheiro. O sistema funciona assim:

        - Cada hora de atividade física no mês vale pontos
        - até 10h de atividade no mês: ganha 2 pontos por hora
        - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
        - acima de 20h de atividade no mês: ganha 10 pontos por hora
        - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)

    Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
    calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuantas horas de atividade física você fez?");
        double qtdHoras = scanner.nextDouble();
        double pontos;

        if(qtdHoras <= 10) {
            pontos = 2;
        } else if(qtdHoras > 20) {
            pontos = 10;
        } else {
            pontos = 5;
        }

        double qtdPontos = qtdHoras * pontos;
        double totalGanho = qtdPontos * 0.05;

        System.out.println("\nTota de dinheiro ganho: " + totalGanho);

        scanner.close();
    }
}