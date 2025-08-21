package lista6;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //Faça um programa que receba um número inteiro e verifique se este número
        //é par ou ímpar.
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2==0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }

    }
}
