/*
    Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opções para o joKenPo
        int pedra = 0;
        int papel = 1;
        int tesoura = 2;

        // Pegando um valor aleatório para o computador;
        int escolhaDoComputador= random.nextInt(3);

        System.out.println("\n---PEDRA-PAPEL-TESOURA---\nDigite para fazer sua escolha!");
        System.out.println("0 - PEDRA");
        System.out.println("1 - PAPEL");
        System.out.println("2 - TESOURA");
        int escolhaDoUsuario = scanner.nextInt();

        if((escolhaDoUsuario == 0 && escolhaDoComputador == 2) || (escolhaDoUsuario == 1 && escolhaDoComputador == 0) || (escolhaDoUsuario == 2 && escolhaDoComputador == 1)) {
            System.out.println("\n\n-- Sua escolha: " + escolhaDoUsuario);
            System.out.println("--Escolha do computador: " + escolhaDoComputador);
            System.out.println("\nPARABÉNS, VOCÊ GANHOU!!!");
        } else if(escolhaDoUsuario == escolhaDoComputador) {
            System.out.println("\n\n-- Sua escolha: " + escolhaDoUsuario);
            System.out.println("--Escolha do computador: " + escolhaDoComputador);
            System.out.println("\nEMPATE!!!");
        } else {
            System.out.println("\n\n-- Sua escolha: " + escolhaDoUsuario);
            System.out.println("--Escolha do computador: " + escolhaDoComputador);
            System.out.println("\nINFELIZMENTE VOCÊ PERDEU...");
        }

        scanner.close();
    }
}