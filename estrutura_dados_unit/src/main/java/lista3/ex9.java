package lista3;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //Faça um programa que leia o valor da hora de trabalho (em reais) e o número
        //de horas trabalhadas no mês. Imprima o valor a ser pago ao funcionário,
        //adicionando 10% sobre o valor calculado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora: ");
        float valor_hora = sc.nextFloat();
        System.out.println("Digite o numero de horas: ");
        float numero_horas = sc.nextFloat();
        System.out.printf("Salario: %.2f", (valor_hora * numero_horas)*1.1);
    }
}