/*
    Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
    jogador vai tentar descobrir qual foi o valor sorteado.
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(5) + 1;

        System.out.println("Advinhe o número de 1 a 5");
        int numUsuario = scanner.nextInt();

        if(numUsuario == numeroSorteado) {
            System.out.println("VOCÊ ACERTOU!!!");
        } else {
            System.out.println("Você errou...");
            System.out.println("O número sorteado foi: " + numeroSorteado);
        }

        scanner.close();
    }
}