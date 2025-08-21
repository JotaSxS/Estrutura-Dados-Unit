package lista6;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //Leia um número fornecido pelo usuário. Se esse número for positivo, calcule
        //a raiz quadrada do número. Se o número for negativo, mostre uma
        //mensagem dizendo que o número é invalido.
        Scanner input = new Scanner(System.in);
        double num =  input.nextInt();
        if(num>0){
            double raiz_quadrada = Math.sqrt(num);
            System.out.println("Raiz quadrada: "+raiz_quadrada);
        }else {
            System.out.println("Numero invalido");
        }

    }
}
