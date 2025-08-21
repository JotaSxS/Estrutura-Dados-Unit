package lista8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {
    //Faça um programa que receba três números e mostre-os em ordem
    //crescente.
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        numeros.add(num1);
        int num2 = sc.nextInt();
        numeros.add(num2);
        int num3 = sc.nextInt();
        numeros.add(num3);
        numeros.sort(null);

        System.out.println( numeros);


    }
}