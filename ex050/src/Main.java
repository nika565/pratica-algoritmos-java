/*
    Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
    mostre na tela:

    a) Quais foram os números sorteados
    b) Quantos números estão acima de 5
    c) Quantos números são divisíveis por 3
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numSorteado = 0;
        byte contador = 1;
        byte acumuladorAcimaDe5 = 0;
        byte divisiveisPor3 = 0;

        while(contador <= 20){

            numSorteado = random.nextInt(11);
            System.out.print("\nNúmero sorteado: " + numSorteado);

            if(numSorteado > 5) {
                acumuladorAcimaDe5++;
            }

            if(numSorteado % 3 == 0) {
                divisiveisPor3++;
            }

            contador++;
        }

        System.out.println("\nQuantidade de números que estão acima de 5: " + acumuladorAcimaDe5);
        System.out.println("Quantidade de números divisíveis por 3: " + divisiveisPor3);

        scanner.close();
    }
}