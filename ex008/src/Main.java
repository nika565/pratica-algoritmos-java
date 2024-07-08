/*
    Desenvolva um programa que leia uma distância em metros e mostre os valores
    relativos em outras medidas
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Informe uma distância em metros para ser convertido em outras medidas:");
        float metros = scanner.nextFloat();

        // Convertendo em outras medidas
        float km = metros / 1000;
        float hm = metros / 100;
        float dam = metros / 10;
        float dm = metros * 10;
        float cm = metros * 100;
        float mm = metros * 1000;

        System.out.println("A distância de " + metros + "m corresponde a:");
        System.out.println(km + "Km");
        System.out.println(hm + "Hm");
        System.out.println(dam + "Dam");
        System.out.println(dm + "dm");
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");

        scanner.close();
    }
}