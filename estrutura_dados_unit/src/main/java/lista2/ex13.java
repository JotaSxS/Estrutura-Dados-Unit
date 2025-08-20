package lista2;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        //13.Leia um valor de comprimento em metros e apresente-o convertido em
        //jardas. A fórmula de conversão é: J = M / 0,91 , sendo J o comprimento em
        //jardas e M o comprimento em metros.
        Scanner sc = new Scanner(System.in);
        double metros = sc.nextDouble();
        double jardas = metros/0.91;
        System.out.println("Jardas: " + jardas);
    }
}