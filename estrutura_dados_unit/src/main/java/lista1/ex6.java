package lista1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Celsius e apresente-a convertida em graus
        //Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a
        //temperatura em Fahrenheit e C a temperatura em Celsius.

        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit + "\u00B0F");
    }
}