package lista7;
import java.util.Scanner;

public class ex12 {
    //12.Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de
    //um triangulo e, se forem, se e um triângulo escaleno, equilátero ou isóscele,
    //considerando os seguintes conceitos:

    public static String classificaTriangulo(double a, double b, double c) {
        if(a > b+c || b > c+a || c > a+b) {
            return "O comprimento de um lado foi maior que a soma dos outros";
        } else if (a == b && b ==c) {
            return "Triangulo Equilatero";
        } else if (a == b || a == c || b ==c) {
            return "Triangulo Isosceles";
        }else {
            return "Triangulo Escaleno";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ladoA = input.nextDouble();
        double ladoB = input.nextDouble();
        double ladoC = input.nextDouble();

        System.out.println(classificaTriangulo(ladoA, ladoB, ladoC));

    }
}
