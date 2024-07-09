/*
    Uma empresa precisa reajustar o salário dos seus funcionários, dando um
    aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
    o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
    No final, mostre o seu novo salário, baseado na tabela a seguir:

        - Mulheres
        - menos de 15 anos de empresa: +5%
        - de 15 até 20 anos de empresa: +12%
        - mais de 20 anos de empresa: +23%
        - Homens
        - menos de 20 anos de empresa: +3%
        - de 20 até 30 anos de empresa: +13%
        - mais de 30 anos de empresa: +25%

        OBSERVAÇÃO: Esse algoritmo não tem o intuito de promover a desigualdade salarial
        entre generos, é apenas para fins didáticos...
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme seu gênero:");
        System.out.println("\nDigite 1 para mulher");
        System.out.println("\nDigite 2 para homem");
        int genero = scanner.nextInt();

        if(genero != 1 && genero != 2) {
            System.out.println("\nEssa opção não existe...");
            return;
        }

        System.out.println("\nHá quantos anos você trabalha na empresa?");
        int tempoDeEmpresa = scanner.nextInt();

        System.out.println("\nQual é o seu salário?");
        double salarioAtual = scanner.nextDouble();

        // Calculo para porcentagem de aumento
        double porcentagemAumento = 0;

        if(genero == 1) {

            if(tempoDeEmpresa < 15) {
                porcentagemAumento = 0.05;
            } else if(tempoDeEmpresa > 20) {
                porcentagemAumento = 0.23;
            } else {
                porcentagemAumento = 0.12;
            }

        }

        if(genero == 2) {

            if(tempoDeEmpresa < 20) {
                porcentagemAumento = 0.03;
            } else if(tempoDeEmpresa > 30) {
                porcentagemAumento = 0.25;
            } else {
                porcentagemAumento = 0.13;
            }

        }

        double salarioAumentado = salarioAtual * porcentagemAumento + salarioAtual;

        System.out.println("\nSeu salário foi aumentado em: " + porcentagemAumento + "%");
        System.out.println("\nSalário atual: " + salarioAumentado);

        scanner.close();
    }

}