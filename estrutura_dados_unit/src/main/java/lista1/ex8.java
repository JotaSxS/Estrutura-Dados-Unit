package lista1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Kelvin e apresente-a convertida em graus
        //Celsius. A fórmula de conversão é: C = K − 273.15, sendo C a temperatura
        //em Celsius e K a temperatura em Kelvin.
        Scanner sc = new Scanner(System.in);
        float kelvin = sc.nextFloat();
        System.out.println(kelvin-273.15+"\u00B0C");
    }
}