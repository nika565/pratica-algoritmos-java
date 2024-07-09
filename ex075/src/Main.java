/*
    Crie um programa que preencha um vetor numérico com 15 posições com os
    primeiros elementos da sequência de Fibonacci:
*/

public class Main {
    public static void main(String[] args) {

        int[] fibonacci = new int[15];
        int num1 = 1;
        int num2 = 1;
        int troca = 0;

        for(var i = 0; i < fibonacci.length; i++) {

            fibonacci[i] = num2;
            troca = num2;
            num2 = num2 + num1;
            num1 = troca;

            System.out.print(fibonacci[i] + " ");
        }

    }
}