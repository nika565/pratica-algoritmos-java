/*
    Desenvolva um programa usando a estrutura “for” que mostre na tela a
    seguinte contagem:

    0 5 10 15 20 25 30 35 40 Acabou!
*/

public class Main {
    public static void main(String[] args) {

        for(var i = 0; i <= 40; i+=5) {
            System.out.print(i + " ");
        }

        System.out.print("Acabou!");

    }
}