/*
    Faça um programa que mostre os 10 primeiros elementos da Sequência
    de Fibonacci:

    1 1 2 3 5 8 13 21...
*/

public class Main {
    public static void main(String[] args) {

        int elemento1 = 1;
        int elemento2 = 1;
        int troca;

        System.out.print("\n" + elemento1 + " ");
        for(var i = 1; i <= 10; i++) {
            System.out.print(elemento2 + " ");
            troca = elemento2;
            elemento2 = elemento2 +  elemento1;
            elemento1 = troca;
        }

    }
}