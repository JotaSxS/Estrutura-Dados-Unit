package lista2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula
        //de conversão é: R = G ∗ π/180, sendo G o ângulo em graus é R em radianos
        //e π = 3.14.
        Scanner sc = new Scanner(System.in);
        double graus = sc.nextDouble();
        double radians = graus * Math.PI / 180;
        System.out.println(radians);

        double radiano = Math.toRadians(graus);
        System.out.println(radiano);

        sc.close();
    }
}