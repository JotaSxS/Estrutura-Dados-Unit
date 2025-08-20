package lista2;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        //20.Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor
        //correspondente em dólares.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorEmReais = sc.nextDouble();

        // Solicita a cotação do dólar
        System.out.print("Digite a cotação do dólar (Ex: 5.12): ");
        double cotacaoDolar = sc.nextDouble();

        // Calcula o valor em dólares
        double valorEmDolares = valorEmReais / cotacaoDolar;

        // Imprime o resultado formatado
        System.out.printf("R$ %.2f equivalem a US$ %.2f na cotação de %.2f.\n", valorEmReais, valorEmDolares, cotacaoDolar);

        sc.close();
    }
}