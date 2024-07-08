/*
    Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Digite um número:");
        float num = scanner.nextFloat();
        float dobro = num * 2;
        float tercaParte = num / 3;

        System.out.println("\n-- Número digitado: " + num + "\n-- Dobro: " + dobro + "\n Terça parte: " + tercaParte);

        scanner.close();
    }
}