package lista2;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // Leia um valor de volume em litros e apresente-o convertido em metros
        //cúbicos m3. A fórmula de conversão é: M = L / 1000 , sendo L o volume em
        //litros e M o volume em metros cúbicos.
        Scanner sc = new Scanner(System.in);
        double litros = sc.nextDouble();
        double metros = litros / 1000;
        System.out.println(metros + " metros cubicos");
        sc.close();
    }
}