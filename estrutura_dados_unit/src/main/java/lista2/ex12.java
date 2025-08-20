package lista2;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        //12.Leia um valor de comprimento em jardas e apresente-o convertido em
        //metros. A fórmula de conversão é: M = 0, 91 ∗ J, sendo J o comprimento em
        //jardas e M o comprimento em metros.
        Scanner sc = new Scanner(System.in);
        double jardas = sc.nextDouble();
        double metros = jardas * 0.91;
        System.out.println(metros+" metros");
    }
}