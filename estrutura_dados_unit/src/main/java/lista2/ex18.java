package lista2;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        //18.Faça a leitura de três valores e apresente como resultado a soma dos
        //quadrados dos três valores lidos.
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double soma_quadrados = (num1*num1)+(num2*num2)+(num3*num3);
        System.out.println(soma_quadrados);
    }
}