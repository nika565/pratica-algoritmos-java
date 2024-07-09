/*
    Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
    No final, mostre o total de salários pagos aos homens e o total pago às
    mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
    sempre que ler os dados de um funcionário.
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 0;
        int sexo = 1;
        int continuar = 1;
        double somaSalarioHomens = 0;
        double somaSalarioMulheres = 0;

        while(true) {
            System.out.println("\nInforme o salário do usuário: ");
            salario = scanner.nextDouble();

            System.out.println("\nInforme o sexo: ");
            System.out.println("1 - para Feminino");
            System.out.println("2 - para Masculino");
            sexo = scanner.nextInt();

            System.out.println("Deseja continuar executando o programa?");
            System.out.println("1 - SIM");
            System.out.println("0 - NÃO");
            continuar = scanner.nextInt();

            if(sexo == 1) {
                somaSalarioMulheres += salario;
            }

            if(sexo == 2) {
                somaSalarioHomens += salario;
            }

            if(continuar == 0) {
                break;
            }

        }

        System.out.println("Total em salários dos homens: " + somaSalarioHomens);
        System.out.println("Total em salários dos Mulheres: " + somaSalarioMulheres);

        scanner.close();
    }
}