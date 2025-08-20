package lista2;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //Leia um valor de comprimento em polegadas e apresente-o convertido em
        //centímetros. A fórmula de conversão é: C = P ∗ 2, 54, sendo C o
        //comprimento em centımetros e P o comprimento em polegadas.
        Scanner sc = new Scanner(System.in);
        double polegadas = sc.nextDouble();
        double centimetros = polegadas * 2.54;
        System.out.println(centimetros+" cm");
    }
}