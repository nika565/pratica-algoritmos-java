/*
    Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
    na tela a sua média na disciplina
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Nome do Aluno:");
        String nome = scanner.nextLine();

        System.out.println("\n Informe a primeira nota de " + nome);
        int nota1 = scanner.nextInt();

        System.out.println("Informe a segunda nota de " + nome);
        int nota2 = scanner.nextInt();

        float media = (nota1 + nota2) / 2;

        System.out.println("A média de " + nome + " é igual a: " + media);

        scanner.close();
    }
}