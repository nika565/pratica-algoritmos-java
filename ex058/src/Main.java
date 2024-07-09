/*
    Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
    vai parar quando for digitada a idade 999. No final, mostre quantos alunos
    existem na turma e qual é a média de idade do grupo.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade = 0;
        double somaIdade = 0;
        double mediaIdade = 0;
        double qtdAlunos = 0;

        while(true) {

            System.out.println("\nInforme a idade do aluno: ");
            idade = scanner.nextDouble();

            if(idade == 999) {
                break;
            }

            somaIdade += idade;
            qtdAlunos++;

        }

        mediaIdade = somaIdade / qtdAlunos;

        System.out.println("\nO grupo tem " + qtdAlunos + " integrantes.\nA média de idade do grupo é de: " + mediaIdade);

        scanner.close();
    }
}