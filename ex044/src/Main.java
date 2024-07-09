/*
    Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
    incremento, mostrando em seguida todos os valores no intervalo:

    Ex: Digite o primeiro Valor: 3
    Digite o último Valor: 10
    Digite o incremento: 2
    Contagem: 3 5 7 9 Acabou!
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o valor inicial da contagem: ");
        int inicial = scanner.nextInt();

        System.out.println("\nDigite o valor final da contagem: ");
        int contFinal = scanner.nextInt();

        System.out.println("\nInforme o passo da contagem: ");
        int passo = scanner.nextInt();

        while(inicial <= contFinal) {

            System.out.print(inicial + " ");

            inicial += passo;
        }

        System.out.println(" Acabou!");
        scanner.close();
    }
}