/*
    Desenvolva um programa que leia o nome de um funcionário, seu salário,
    quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
    acordo com a tabela a seguir:
    - Até 3 anos de empresa: aumento de 3%
    - entre 3 e 10 anos: aumento de 12.5%
    - 10 anos ou mais: aumento de 20%
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("\n Qual é o seu salário?");
        double salario = scanner.nextDouble();

        System.out.println("\nTempo de empresa em anos:");
        int tempoDeEmpresa = scanner.nextInt();

        double aumento;

        if(tempoDeEmpresa < 4) {
            aumento = salario * 0.03 + salario;
            System.out.println("\nParabéns " + nome + "! Seu salário aumentou 3%. Valor atual: " + aumento);
        } else if(tempoDeEmpresa > 9) {
            aumento = salario * 0.20 + salario;
            System.out.println("\nParabéns " + nome + "! Seu salário aumentou 20%. Valor atual: " + aumento);
        } else {
            aumento = salario * 0.125 + salario;
            System.out.println("\nParabéns " + nome + "! Seu salário aumentou 12,5%. Valor atual: " + aumento);
        }

        scanner.close();
    }
}