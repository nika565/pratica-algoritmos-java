/*
    Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
    qualquer e mostre uma contagem até esse valor:

    Ex: Digite um valor: 35

    Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme um número inteiro positivo:");
        int num = scanner.nextInt();

        if(num <= 0) {
            System.out.println("O número deve ser inteiro positivo");
            return;
        }

        int contador = 1;

        while(contador <= num) {
            System.out.print(contador + " ");
            contador++;
        }

        System.out.print("Acabou!");

        scanner.close();
    }
}