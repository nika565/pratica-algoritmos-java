/*
    Crie um programa que leia o número de dias trabalhados em um mês e mostre o
    salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
    por hora trabalhada.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o número de dias trabalhados do mês");
        byte diasTrabalhados = scanner.nextByte();

        double total = (8 * 25) * diasTrabalhados;
        System.out.printf("Salário referente aos dias trabalhados: %2f", total);

        scanner.close();
    }
}