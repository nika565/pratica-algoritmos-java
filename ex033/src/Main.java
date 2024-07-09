/*
    Escreva um programa para aprovar ou não o empréstimo bancário para a compra
    de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
    em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
    ela não pode exceder 30% do salário ou então o empréstimo será negado.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é o valor da casa?");
        double valorDaCasa = scanner.nextDouble();

        System.out.println("\nQual é o salário do comprador(a)?");
        double salario = scanner.nextDouble();

        System.out.println("\nEm quantos anos ele(a) vai pagar?");
        double anos = scanner.nextDouble();

        // Cálculo da prestação mensal
        double qtdMesesTotais = anos * 12;

        double valorDaPrestacao = valorDaCasa / qtdMesesTotais;

        double trintaPorCentoDoSalario = salario * 0.3;

        if(valorDaPrestacao <= trintaPorCentoDoSalario) {
            System.out.println("\nO EMPRÉSTIMO FOI CONCEDIDO.");
            System.out.println("VALOR DE 30% DO SALÁRIO: " + trintaPorCentoDoSalario);
            System.out.println("VALOR DA PRESTAÇÃO: " + valorDaPrestacao);
        } else {
            System.out.println("\nO EMPRÉSTIMO FOI NEGADO.");
            System.out.println("VALOR DE 30% DO SALÁRIO: " + trintaPorCentoDoSalario);
            System.out.println("VALOR DA PRESTAÇÃO: " + valorDaPrestacao);
        }

        scanner.close();
    }
}