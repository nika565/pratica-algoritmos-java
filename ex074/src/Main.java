/*
    Crie um programa que preencha automaticamente (usando lógica, não apenas
    atribuindo diretamente) um vetor numérico com 10 posições, onde as posições de número ímpar
    dev ter como valor 5 e posição de número par deve ter como valor 5:
*/

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(var i = 0; i < vetor.length; i++) {

            if(i % 2 == 0) {
                vetor[i] = 6;
            } else {
                vetor[i] = 5;
            }

            System.out.println("\nIndice " + i + ": " + vetor[i]);
        }
    }
}