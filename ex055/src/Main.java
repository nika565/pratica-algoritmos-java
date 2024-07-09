/*
    Vamos melhorar o jogo que fizemos no exercício 32. A partir de
    agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
    tentativas para tentar acertar.
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numAleatorio = random.nextInt(11);
        byte numTentativas = 4;
        byte num = 0;

        System.out.println("Tente acertar o número que a máquina escolher!");

        while(numTentativas > 0) {

            System.out.println("\nEscolha um número de 1 a 10: ");
            num = scanner.nextByte();

            if(num != numAleatorio) {

                numTentativas--;

                if(numTentativas == 0) {
                    System.out.println("Você perdeu todas as chances...");
                    return;
                };

                System.out.println("INFELIZMENTE VOCÊ ERROU!");
                System.out.println("Você tem " + numTentativas + " restantes...");

            } else {
                System.out.println("VOCÊ ACERTOU!");
                return;
            }
        }

        scanner.close();
    }
}