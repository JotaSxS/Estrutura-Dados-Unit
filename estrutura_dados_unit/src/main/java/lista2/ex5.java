package lista2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // Leia um ângulo em radianos e apresente-o convertido em graus. A fórmula
        //de conversão é: G = R ∗ 180/π, sendo G o ângulo em graus é R em radianos
        //e π = 3.14.
        Scanner sc = new Scanner(System.in);
        double radianos = sc.nextDouble();
        double graus =  radianos * 180/Math.PI;
        System.out.println(graus+"\u00B0");

        System.out.printf("%.0f\u00B0", graus);
        sc.close();
    }
}
