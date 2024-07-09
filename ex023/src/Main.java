/*
    Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
    para todos, mas especialmente para mulheres. Faça um programa que leia nome,
    sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
    que:
    - Homens ganham 5% de desconto
    - Mulheres ganham 13% de desconto
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Total em compras:");
        float totalEmCompras = scanner.nextFloat();

        System.out.println("\nQual é o seu Sexo?\nDigite 1 para feminino.\nDigite 2 para masculino.");
        int sexo = scanner.nextInt();

        double valorComDesconto;

        if(sexo == 1) {
            valorComDesconto = totalEmCompras - (totalEmCompras * 0.13);
            System.out.println(nome + ", você ganhou um desconto de 13%! Valor total: " + valorComDesconto );
        } else if(sexo == 2) {
            valorComDesconto = totalEmCompras - (totalEmCompras * 0.05);
            System.out.println(nome + ", você ganhou um desconto de 5%! Valor total: " + valorComDesconto );
        } else {
            System.out.println("\nEscolheu incorretamente... Execute o programa novamente...");
        }

        scanner.close();
    }
}