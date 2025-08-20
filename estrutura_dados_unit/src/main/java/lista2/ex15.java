package lista2;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        //Leia um valor de área em acres e apresente-o convertido em metros
        //quadrados m
        //. A fórmula de conversão é: M = A ∗ 4048,58 sendo M a área
        //em metros quadrados é A a área em acres.
        Scanner sc = new Scanner(System.in);
        double acres = sc.nextDouble();
        double metros_quadrados =  acres*4048.58;
        System.out.println(metros_quadrados+" metros quadrados");
    }
}