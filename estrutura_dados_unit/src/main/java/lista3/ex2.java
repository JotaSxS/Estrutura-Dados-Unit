package lista3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //Leia um número inteiro e imprima a soma do sucessor de seu triplo com o
        //antecessor de seu dobro.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int soma = 3*a +1 + 2*a -1;
        System.out.println(soma);
    }
}