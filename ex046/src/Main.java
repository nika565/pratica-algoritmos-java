/*
    Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
    8 + 10 + 12 + 14 + ... + 98 + 100.
*/

public class Main {
    public static void main(String[] args) {

        int acumulador = 0;
        int contador = 6;

        while(contador <= 100){
            acumulador = acumulador + contador;
            System.out.print(acumulador + " ");
            contador += 2;
        }

        System.out.println("\n\nA soma total entre os número é de: " + acumulador);

    }
}