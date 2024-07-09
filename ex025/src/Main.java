/*
    Crie um programa que leia o tamanho de três segmentos de reta.
    Analise seus comprimentos e diga se é possível formar um triângulo com essas
    retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
    de cada lado deve ser menor que a soma dos outros dois.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o tamanho da primeira reta:");
        int reta1 = scanner.nextInt();

        System.out.println("\nInforme o tamanho da segunda reta:");
        int reta2 = scanner.nextInt();

        System.out.println("Informe o tamanho da terciera reta:");
        int reta3 = scanner.nextInt();

        if(reta1 > reta2 + reta3 || reta2 > reta1 + reta3 || reta3 > reta1 + reta2) {
            System.out.println("\nÉ impossível formar um triângulo, pois nehuma das retas pode ser maior que a soma de outras duas");
        } else {
            System.out.println("É possível formar um triângulo!");
        }

        scanner.close();
    }
}