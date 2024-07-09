/*
    Crie um programa que preencha automaticamente (usando lógica, não apenas
    atribuindo diretamente) um vetor numérico com 10 posições
*/

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(var i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
            System.out.println("\nIndice " + i + ": " +  vetor[i]);
        }

    }
}