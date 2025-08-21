package lista6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //Faça um programa que receba dois números e mostre qual deles é o maior.
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        if(num1>=num2){
            System.out.println("O valor maior e "+num1);
        }else{
            System.out.println("O valor menor e "+num2);
        }
    }
}
