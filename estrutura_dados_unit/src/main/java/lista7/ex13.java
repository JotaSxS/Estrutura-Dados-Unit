package lista7;
import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        // Exibe o menu de opções
        System.out.println("Escolha a opção:");
        System.out.println("1 - Soma de 2 números.");
        System.out.println("2 - Diferença entre 2 números (maior pelo menor).");
        System.out.println("3 - Produto entre 2 números.");
        System.out.println("4 - Divisão entre 2 números (o denominador não pode ser zero).");
        System.out.print("Opção: ");

        // Lê a opção do usuário
        opcao = scanner.nextInt();

        // Estrutura de decisão para executar a operação escolhida
        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("A soma é: " + resultado);
                break;

            case 2:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                if (num1 > num2) {
                    resultado = num1 - num2;
                } else {
                    resultado = num2 - num1;
                }
                System.out.println("A diferença é: " + resultado);
                break;

            case 3:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                System.out.println("O produto é: " + resultado);
                break;

            case 4:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("A divisão é: " + resultado);
                } else {
                    System.out.println("Erro: O denominador não pode ser zero.");
                }
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                break;
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}