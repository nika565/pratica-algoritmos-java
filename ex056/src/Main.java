/*
    Crie um programa que leia vários números pelo teclado e mostre no final o
    somatório entre eles.
    Obs: O programa será interrompido quando o número 1111 for digitado
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        int soma = 0;

        while(true){
            System.out.println("\nDigite Algum número inteiro:");
            valor = scanner.nextInt();

            if(valor == 1111) {
                break;
            }

            soma += valor;
        }

        System.out.println("Soma: " + soma);
        scanner.close();
    }
}