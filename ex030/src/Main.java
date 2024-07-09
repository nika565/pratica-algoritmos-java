/*
    Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
    de triângulo será formado:
    - EQUILÁTERO: todos os lados iguais
    - ISÓSCELES: dois lados iguais
    - ESCALENO: todos os lados diferentes
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o tamanho da primeira reta: ");
        double reta1 = scanner.nextDouble();

        System.out.println("\nInforme o tamanho da segunda reta: ");
        double reta2 = scanner.nextDouble();

        System.out.println("\nInforme o tamanho da terceira reta: ");
        double reta3 = scanner.nextDouble();

        if(reta1 > reta2 + reta3 || reta2 > reta1 + reta3 || reta3 > reta1 + reta2) {
            System.out.println("\nImpossível formar uma triângulo, pois nenhum dos lados pode ser maior que a soma dos outros dois");
        } else if(reta1 == reta2 && reta2 == reta3 && reta1 == reta3) {
            System.out.println("\n- EQUILÁTERO");
        } else if(reta1 != reta2 && reta2 != reta3 && reta1 != reta3) {
            System.out.println("\n- ESCALENO");
        } else {
            System.out.println("\n- ISÓSCELES");
        }

        scanner.close();
    }
}