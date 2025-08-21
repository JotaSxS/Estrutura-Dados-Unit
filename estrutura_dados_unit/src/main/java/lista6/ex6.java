package lista6;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //Escreva um programa que, dados dois números inteiros, mostre na tela o
        //maior deles, assim como a diferença existente entre ambos.
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>= num2){
            System.out.println("Maior numero: "+ num1);
            System.out.println("Diferenca: "+ (num1 -num2));
        }else {

            System.out.println("Maior numero: "+ num2);
            System.out.println("Diferenca: "+ (num2 -num1));
        }
    }
}
