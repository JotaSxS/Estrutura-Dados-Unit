package lista3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //Leia o tamanho do lado de um quadrado e imprima como resultado a sua
        //área.
        Scanner sc = new Scanner(System.in);
        double lado = sc.nextDouble();
        System.out.println("Area: "+lado*lado);
        sc.close();
    }
}