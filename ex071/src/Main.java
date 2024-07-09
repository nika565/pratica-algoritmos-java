/*
    Faça um programa que preencha automaticamente um vetor numérico com 8
    posições,
*/

public class Main {
    public static void main(String[] args) {
        int[] meuVetor = new int[8];

        for(var i = 0; i < meuVetor.length; i++) {
            meuVetor[i] = i * 2;
            System.out.println("Posição " + i + " do vetor: " + meuVetor[i]);
        }
    }
}