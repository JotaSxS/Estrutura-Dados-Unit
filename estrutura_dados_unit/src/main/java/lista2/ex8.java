package lista2;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // Leia um valor de volume em metros cúbicos m3 e apresente-o convertido em
        //litros. A fórmula de conversão é: L = 1000 ∗ M, sendo L o volume em litros e
        //M o volume em metros cúbicos.
        Scanner sc = new Scanner(System.in);
        double metros_cubicos = sc.nextDouble();
        double litros = metros_cubicos * 1000;
        System.out.printf("%.2f", litros);
        sc.close();
    }
}