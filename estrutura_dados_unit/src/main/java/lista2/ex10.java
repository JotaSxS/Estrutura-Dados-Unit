package lista2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // Leia um valor de massa em quilogramas e apresente-o convertido em libras.
        //A fórmula de conversão é: L = K / 0,45 , sendo K a massa em quilogramas e
        //L a massa em libras.
        Scanner sc = new Scanner(System.in);
        double quilogramas = sc.nextDouble();
        double libras = quilogramas / 0.45;
        System.out.println(libras+" libras");
        sc.close();
    }
}