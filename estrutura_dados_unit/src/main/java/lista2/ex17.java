package lista2;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        //Leia um valor de área em hectares e apresente-o convertido em metros
        //quadrados é m
        //2
        //. A fórmula de conversão é: M = H ∗ 10000, sendo M a área
        //em metros quadrados é H a área em hectares.
        Scanner sc = new Scanner(System.in);
        double hectares = sc.nextDouble();
        double metros_quadrados = hectares*10000;
        System.out.println(metros_quadrados+" metros quadrados"); //10E8
    }
}