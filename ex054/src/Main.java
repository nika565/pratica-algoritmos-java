/*
    Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
    no final:

    a) Qual foi a média de altura do grupo
    b) Quantas pessoas pesam mais de 90Kg
    c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
    d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        double altura = 0;
        double mediaAltura = 0;
        double somaAltura = 0;
        int qtdPessoasMaisPesadasQue90Kg = 0;
        int qtdPessoasQuePesamMenosDe50KgETemMenosDe160DeAltura = 0;
        int qtdPessoasMaioresDe190DeAlturaEPesamMaisDe100Kg = 0;
        int contador = 1;

        while(contador <= 7) {

            System.out.println("\nPessoa " + contador + ':');
            System.out.print("-- Informe o peso: ");
            peso = scanner.nextDouble();

            System.out.print("\n-- Informe a altura: ");
            altura = scanner.nextDouble();

            // Soma da altura
            somaAltura += altura;

            // Quantidade de pessoas que pesam mais de 90Kg
            if(peso > 90) {
                qtdPessoasMaisPesadasQue90Kg++;
            }

            // Quantidade de pessoas que pesam menos de 50Kg tem menos de 1.60m
            if(peso < 50 && altura < 1.6) {
                qtdPessoasQuePesamMenosDe50KgETemMenosDe160DeAltura++;
            }

            // Quantidade de pessoas que medem mais de 1.90m pesam mais de 100Kg.
            if(peso > 100 && altura > 1.9) {
                qtdPessoasMaioresDe190DeAlturaEPesamMaisDe100Kg++;
            }

            contador++;
        }

        // Média de altura do grupo
        mediaAltura = somaAltura / 7;

        System.out.println("\nMédia de altura do grupo: " + mediaAltura);
        System.out.println("Quantidade de pessoas que pesam mais de 90Kg: " + qtdPessoasMaisPesadasQue90Kg);
        System.out.println("Quantidade de pessoas que pesam menos de 50Kg tem menos de 1.60m: " + qtdPessoasQuePesamMenosDe50KgETemMenosDe160DeAltura);
        System.out.println("Quantidade de pessoas que medem mais de 1.90m pesam mais de 100Kg: " + qtdPessoasMaioresDe190DeAlturaEPesamMaisDe100Kg);
        scanner.close();
    }
}