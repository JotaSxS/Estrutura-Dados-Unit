package lista2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //Leia uma distância em milhas e apresente-a convertida em quilômetros. A
        //fórmula de conversão é: K = 1, 61 ∗ M, sendo K a distância em quilômetros é
        //M em milhas.
        Scanner sc = new Scanner(System.in);
        float milhas = sc.nextFloat();
        double km = milhas * 1.61;

        System.out.printf("%.2f", km);
        sc.close();

    }
}