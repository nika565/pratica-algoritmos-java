/*
    Desenvolva um programa que mostre na tela a seguinte contagem:

    100 95 90 85 80 ... 0 Acabou!
*/

public class Main {
    public static void main(String[] args) {

        byte contador = 100;

        while(contador >= 0) {
            System.out.println(contador);
            contador -= 5;
        }

        System.out.println("Acabou!");

    }
}