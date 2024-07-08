/*
    Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
    seu novo salário, com 15% de aumento.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o seu salário?");
        double salario = scanner.nextDouble();

        // Cálculo
        double salarioComAumento = (salario * 0.15) + salario;

        System.out.printf("\nParabéns! Você ganhou um aumento de 15%%!!!\nSeu salário atual é de: %f", salarioComAumento);

        scanner.close();
    }
}