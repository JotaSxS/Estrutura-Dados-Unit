package lista3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //Leia o salário de um funcionário. Calcule e imprima o valor do novo salário,
        //sabendo que ele recebeu um aumento de 25%.
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        System.out.println(salario +(salario * 0.25));
        sc.close();
    }
}