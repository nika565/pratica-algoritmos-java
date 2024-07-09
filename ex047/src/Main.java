/*
    Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
    450 + 400 + 350 + 300 + ... + 50 + 0
*/

public class Main {
    public static void main(String[] args) {

        long acumulador = 0;

        int contador = 500;

        while(contador >= 0) {
            acumulador += contador;
            System.out.println(contador);
            contador-= 50;
        }

        System.out.println("\nResultado da soma: " + acumulador);

    }
}