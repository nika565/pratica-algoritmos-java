/*
    O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
    peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
    indivíduo dentro de certas faixas.
    - abaixo de 18.5: Abaixo do peso
    - entre 18.5 e 25: Peso ideal
    - entre 25 e 30: Sobrepeso
    - entre 30 e 40: Obesidade
    - acima de 40: Obseidade mórbida
    Obs: O IMC é calculado pela expressão peso/altura2 (peso dividido pelo quadrado
    da altura)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual é a sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("\nQual é o seu peso?");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc > 40) {
            System.out.println("Seu IMC: " + imc);
            System.out.println("Obesidade mórbida");
        } else if(imc < 18.5){
            System.out.println("Seu IMC: " + imc);
            System.out.println("Abaixo do peso ideal");
        } else if(imc >= 18.5 && imc < 26) {
            System.out.println("Seu IMC: " + imc);
            System.out.println("Peso ideal");
        } else if(imc > 25 && imc < 31) {
            System.out.println("Seu IMC: " + imc);
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Seu IMC: " + imc);
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}