package lista2;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        //Leia um valor de área em metros quadrados
        //2 e apresente-o convertido em
        //acres. A fórmula de conversão é: A = M ∗ 0, 000247, sendo M a área em
        //metros quadrados é A a área em acres.
        Scanner sc = new Scanner(System.in);
        double metros_quadrados = sc.nextDouble();
        double acres = metros_quadrados * 0.000247;
        System.out.println(acres+" acres");
    }
}