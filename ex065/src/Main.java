/*
    Desenvolva um programa usando a estrutura “for” que mostre na tela a
    seguinte contagem:

    100 90 80 70 60 50 40 30 20 10 0 Acabou!
*/

public class Main {
    public static void main(String[] args) {

        for(var i = 100; i >= 0; i-= 10){
            System.out.print(i + " ");
        }

        System.out.print("Acabou!");
    }
}