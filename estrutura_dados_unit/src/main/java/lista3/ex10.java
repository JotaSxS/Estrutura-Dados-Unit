package lista3;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //10.Receba o salário-base de um funcionário. Calcule e imprima o salário a
        //receber, sabendo-se que esse funcionário tem uma gratificação de 5% sobre
        //o salário-base. Além disso, ele paga 7% de imposto sobre o salário-base.
        Scanner sc = new Scanner(System.in);
        double salario_base = sc.nextDouble();
        System.out.printf("Salario: R$%.2f",salario_base*1.05-(salario_base*0.07));
    }
}