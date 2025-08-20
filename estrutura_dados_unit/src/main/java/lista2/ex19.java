package lista2;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        //19.Leia quatro notas, calcule a média aritmética e imprima o resultado.
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double media_aritmetica = (num1 + num2 + num3 + num4)/4;
        System.out.println("Media aritmetica " + media_aritmetica);
    }
}