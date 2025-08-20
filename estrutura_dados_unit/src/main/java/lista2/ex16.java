package lista2;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        //Leia um valor de área em metros quadrados m
        //2 e apresente-o convertido em
        //hectares. A formula de conversaõ é: H = M ∗ 0, 0001, sendo M a area em
        //metros quadrados é H a area em hectares.
        Scanner sc = new Scanner(System.in);
        double metros_quadrados = sc.nextDouble();
        double hectares = metros_quadrados *0.0001;
        System.out.println("Hectares: "+hectares);
    }
}