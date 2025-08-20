package lista2;


import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //Leia uma distância em quilômetros e apresente-a convertida em milhas. A
        //fórmula de conversão é: M = K 1,61 , sendo K a distância em quilômetros é
        //M em milhas.
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double milhas = km / 1.61;
        System.out.println(milhas+" Milhas");
        sc.close();
    }
}