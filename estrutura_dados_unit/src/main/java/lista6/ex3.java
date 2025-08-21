package lista6;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //Leia um número real. Se o número for positivo imprima a raiz quadrada. Do
        //contrário, imprima o número ao quadrado.
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if(num>=0){
            double raiz_quadrada = Math.sqrt(num);
            System.out.println("Raiz quadrada: "+raiz_quadrada);
        }else {
            System.out.println(num*num);
        }
    }
}
