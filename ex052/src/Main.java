/*
    Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
    a) Qual é a média de idade do grupo
    b) Quantas pessoas tem mais de 18 anos
    c) Quantas pessoas tem menos de 5 anos
    d) Qual foi a maior idade lida
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme as idades de 10 pessoas...");
        double media = 0;
        int idade = 0;
        int somaIdade = 0;
        int maiorIdade = 0;
        int qtdPessoasMaioresDe18 = 0;
        int qtdPessoasMenoresDe5 = 0;
        int contador = 1;

        while(contador <= 10) {

            System.out.print("\nPessoa " + contador + ": ");
            idade = scanner.nextInt();

            // Soma das idades
            somaIdade += idade;

            // Verificações
            if(idade > 18) {
                qtdPessoasMaioresDe18++;
            }

            if(idade < 5) {
                qtdPessoasMenoresDe5++;
            }

            if(idade > maiorIdade) {
                maiorIdade = idade;
            }


            contador++;
        }

        // Média das idades
        media = somaIdade / 10;

        System.out.println("\nMédia das idades: " + media);
        System.out.println("\nQuantidade de pessoas maiores de 18 anos: " + qtdPessoasMaioresDe18);
        System.out.println("\nQuantidade de pessoas menores de 5 anos: " + qtdPessoasMenoresDe5);
        System.out.println("\nMaior idade registrada: " + maiorIdade);

        scanner.close();
    }
}