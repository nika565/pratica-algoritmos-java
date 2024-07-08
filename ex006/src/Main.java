/*
    Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        int num = scanner.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Número digitado: " + num + " Antecessor: " + antecessor + " sucessor: " + sucessor);

        scanner.close();
    }
}