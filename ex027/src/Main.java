/*
    Crie um programa que leia quatro notas de um aluno e calcule a sua média,
    mostrando uma mensagem no final, de acordo com a média atingida:
    - Média até 4.9: REPROVADO
    - Média entre 5.0 e 6.9: RECUPERAÇÃO
    - Média 7.0 ou superior: APROVADO
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("\nInforme a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("\nInforme a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();

        System.out.println("\nInforme a quarta nota do aluno:");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media < 5) {
            System.out.println("\nMédia: " + media + "\n--REPROVADO");
        } else if(media > 6) {
            System.out.println("\nMédia: " + media + "\n--APROVADO");
        } else {
            System.out.println("\nMédia: " + media + "\n--RECUPERAÇÃO");
        }

        scanner.close();
    }
}