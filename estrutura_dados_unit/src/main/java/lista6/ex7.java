package lista6;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //Faça um programa que receba dois números e mostre o maior. Se por acaso,
        //os dois números forem iguais, imprima a mensagem Números iguais.
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("Maior numero: "+ num1);
        } else if (num2 > num1) {
            System.out.println("Maior numero: "+ num2);
        }else{
            System.out.println("Numeros iguais");

        }
    }
}
