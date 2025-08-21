package lista7;
import java.util.Scanner;

public class ex11{

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Variáveis booleanas para verificar a divisibilidade
        boolean divisivelPor3 = (numero % 3 == 0);
        boolean divisivelPor5 = (numero % 5 == 0);

        // Usa o operador XOR (^) para verificar se é divisível por 3 ou 5, mas não ambos
        if (divisivelPor3 ^ divisivelPor5) {
            System.out.println("O número " + numero + " é divisível por 3 ou 5, mas não por ambos.");
        } else {
            System.out.println("O número " + numero + " não atende à condição (ou é divisível por ambos, ou não é divisível por nenhum deles).");
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}