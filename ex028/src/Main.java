/*
    Faça um programa que leia a largura e o comprimento de um terreno
    retangular, calculando e mostrando a sua área em m2. O programa também
    devemostrar a classificação desse terreno, de acordo com a lista abaixo:
    - Abaixo de 100m2 = TERRENO POPULAR
    - Entre 100m2 e 500m2 = TERRENO MASTER
    - Acima de 500m2 = TERRENO VIP
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLargura do terreno:");
        double largura = scanner.nextDouble();

        System.out.println("\nComprimento do terreno:");
        double comprimento = scanner.nextDouble();

        double metros = largura * comprimento;

        if(metros < 100) {
            System.out.println("\nTERRENO POPULAR");
        } else if(metros > 500) {
            System.out.println("\nTERRENO VIP");
        } else {
            System.out.println("\nTERRENO MASTER");
        }

        scanner.close();
    }
}