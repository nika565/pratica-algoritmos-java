/*
    O programa acima vai ter um problema quando digitarmos o primeiro valor
    maior que o último. Resolva esse problema com um código que funcione em qualquer
    situação.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o primeiro número inteiro positivo:");
        int num1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número inteiro positivo:");
        int num2 = scanner.nextInt();

        System.out.println("\nInforme o terceiro número inteiro positivo: ");
        int num3 = scanner.nextInt();

        // Validação para interromper o programa em caso de igualdade nos valores
        if(num1 == num2 && num2 == num3) {
            System.out.println("Os três valores não podem ser iguais...");
            return;
        }

        // Verificação de que vai ser o contador, valor final e passo
        int contador;
        int valorFinal;
        int passo;

        if(num1 > num2 && num1 > num3 && num2 >= num3) {
            contador = num3;
            valorFinal = num1;
            passo = num2;

        } else if(num1 > num2 && num1 > num3 && num3 >= num2) {
            contador = num2;
            valorFinal = num1;
            passo = num3;
        } else if(num2 > num1 && num2 > num3 && num1 >= num3) {
            contador = num3;
            valorFinal = num2;
            passo = num1;
        } else if(num2 > num1 && num2 > num3 && num3 >= num1) {
            contador = num1;
            valorFinal = num2;
            passo = num3;
        } else if(num3 > num1 && num3 > num2 && num1 >= num2) {
            contador = num2;
            valorFinal = num3;
            passo = num1;
        } else {
            contador = num1;
            valorFinal = num3;
            passo = num2;
        }

        while(contador <= valorFinal) {
            System.out.print(contador + " ");
            contador += passo;
        }

        scanner.close();
    }
}