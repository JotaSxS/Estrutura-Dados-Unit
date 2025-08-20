package lista3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //Uma empresa contrata um encanador a R$30,00 por dia. Faça ̧a um
        //programa que solicite o número de dias trabalhados pelo encanador e
        //imprima a quantia l ́ ́ıquida que deverá ser paga, sabendo-se que são
        //descontados 8% para imposto de renda.
        Scanner sc = new Scanner(System.in);
        int num_dias = sc.nextInt();
        System.out.println("Total liquido: "+(num_dias*30)*0.92);
    }
}