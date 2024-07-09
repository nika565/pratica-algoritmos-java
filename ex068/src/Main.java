/*
    Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
    “for”. No final, mostre na tela:
    a) Quantas mulheres foram cadastradas
    b) Quantos homens pesam mais de 100Kg
    c) A média de peso entre as mulheres
    d) O maior peso entre os homens
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sexo = 0;
        double peso = 0;
        int qtdMulheres = 0;
        int qtdHomensQuePesamMaisDe100Kg = 0;
        double somaPesoMulheres = 0;
        double mediaPesoMulheres = 0;
        double maiorPesoHomens = 0;

        for(var i = 1; i <= 8; i++) {

            System.out.println("\nInforme o sexo da pessoa " + i + ":");
            System.out.println("Digite 0 para feminino.");
            System.out.println("Digite 1 para masculino.");
            sexo = scanner.nextInt();

            System.out.print("\nInforme o peso da pessoa " + i + ": ");
            peso = scanner.nextDouble();

            if(sexo == 0) {
                qtdMulheres++;
                somaPesoMulheres += peso;
            }

            if(sexo == 1) {

                if(peso > maiorPesoHomens) {
                    maiorPesoHomens = peso;
                }

                if(peso > 100){
                    qtdHomensQuePesamMaisDe100Kg++;
                }

            }

        }

        mediaPesoMulheres = somaPesoMulheres / qtdMulheres;

        /*a) Quantas mulheres foram cadastradas
    b) Quantos homens pesam mais de 100Kg
    c) A média de peso entre as mulheres
    d) O maior peso entre os homens*/

        System.out.println("\nQuantidade de mulheres cadastradas: " + qtdMulheres);
        System.out.println("Quantidade de homens que pesam mais de 100Kg: " + qtdHomensQuePesamMaisDe100Kg);
        System.out.println("Média de peso entre as mulheres: " + mediaPesoMulheres);
        System.out.println("Maior peso entre os homens: " + maiorPesoHomens);

        scanner.close();
    }
}