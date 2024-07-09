/*
Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, de 9 a 0:
*/

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(var i = 1; i <= vetor.length; i++){

            vetor[i-1] = vetor.length - i;
            System.out.println("Indice " + (i-1) + ": " + vetor[i-1]);

        }

    }
}