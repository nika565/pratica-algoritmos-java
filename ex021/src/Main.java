/*
    Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
    BISSEXTO.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme um ano para saber se ele é bissexto ou não:");
        int ano = scanner.nextInt();

        // O ano precisa ser divisivel por 4
        if(ano % 4 == 0) {

            // Ele não pode ser divisível o 100
            if(ano % 100 == 0) {

                // Caso ele seja divisivel por 100, ele precisa ser divisivel por 400
                // Para ser um ano bissexto
                if(ano % 400 == 0){
                    System.out.println("O ano é bissexto!");
                } else {
                    System.out.println("O ano NÃO é bissexto...");
                }

            } else {
                System.out.println("O ano é bissexto!");
            }

        } else {
            System.out.println("O ano NÃO é bissexto...");
        }

        scanner.close();
    }
}