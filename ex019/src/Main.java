/*
    Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
    média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
    não um bom aproveitamento (se ficou acima da média 7.0).
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("\n Informe a primeira nota do aluno:");
        float nota1 = scanner.nextFloat();

        System.out.println("\n Informe a segunda nota do aluno:");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media >= 7) {
            System.out.println("Acima da média: " + media);
        } else {
            System.out.println("Abaixo da média: " + media);
        }

        scanner.close();
    }
}