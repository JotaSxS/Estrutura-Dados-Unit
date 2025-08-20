package lista3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        // Leia um número inteiro e imprima o seu antecessor e o seu sucessor.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Antecessor: "+(num-1)+"\nSucessor: "+(num+1) );
    }
}