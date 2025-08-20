package lista1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // Leia uma temperatura em graus Celsius e apresente-a convertida em graus
        //Kelvin. A fórmula de conversão é: K = C + 273.15, sendo C a temperatura em
        //Celsius e K a temperatura em Kelvin.
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        System.out.println(celsius+273.15+"\u00B0K");
    }
}