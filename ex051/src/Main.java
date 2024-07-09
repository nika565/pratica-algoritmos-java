/*
    Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
    qual foi o maior e qual foi o menor preço digitados.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte contador = 1;
        int maiorNumero = 0;
        int menorNumero = 0;
        int num = 0;

        System.out.println("\nDigite 8 números:");

        while(contador <= 8) {

            System.out.print("\n" + contador + ": ");
            num = scanner.nextInt();

            if(num > maiorNumero) {
                maiorNumero = num;
            }

            if(num < menorNumero) {
                menorNumero = num;
            }

            contador++;
        }

        System.out.println("\nMaior número digitado: " + maiorNumero);
        System.out.println("\nMenor número digitado; " + menorNumero);

        scanner.close();
    }
}