package lista3;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //Faça um programa que leia o valor de um produto e imprima o valor com
        //desconto, tendo em vista que o desconto foi de 12%
        Scanner sc = new Scanner(System.in);
        double produto = sc.nextDouble();
        System.out.println("Valor: "+(produto*0.88));
    }
}