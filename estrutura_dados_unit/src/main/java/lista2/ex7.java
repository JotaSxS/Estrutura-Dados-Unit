package lista2;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // Leia um valor de comprimento em centímetros e apresente-o convertido em
        //polegadas. A fórmula de conversão é: P = C 2,54 , sendo C o comprimento
        //em centímetros e P o comprimento em polegadas.
        Scanner sc = new Scanner(System.in);
        double centimetros = sc.nextDouble();
        double polegadas = centimetros / 2.54;
        System.out.printf("%.2f polegadas", polegadas);
        sc.close();

    }
}