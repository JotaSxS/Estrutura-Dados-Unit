package lista2;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //Leia um valor de massa em libras e apresente-o convertido em quilogramas.
        //A fórmula de conversão é: K = L ∗ 0, 45, sendo K a massa em quilogramas e
        //L a massa em libras.
        Scanner sc = new Scanner(System.in);
        double libras = sc.nextDouble();
        double quilogramas = libras *0.45;
        System.out.println(quilogramas+" Kg");
    }
}