package lista6;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //Faça um programa que leia um número e, caso ele seja positivo, calcule e
        //mostre:
        //● O número digitado ao quadrado
        //● A raiz quadrada do número digitado
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if(num>=0){
            System.out.println("Raiz quadrada: "+Math.sqrt(num));
            System.out.println("Numero ao quadrado: "+num*num);
        }
    }
}
