package lista1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Fahrenheit e apresente-a convertida em
        //graus Celsius. A fórmula de conversão é: C = 5.0 ∗ (F − 32.0)/9.0, sendo C a
        //temperatura em Celsius e F a temperatura em Fahrenheit.

        Scanner sc = new Scanner(System.in);
        float fahrenheit = sc.nextFloat();
        float celsius = 5*(fahrenheit - 32)/9;
        System.out.printf("%.1f\u00B0C",celsius);
    }
}