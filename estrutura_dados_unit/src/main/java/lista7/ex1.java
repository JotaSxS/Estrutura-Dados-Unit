package lista7;
import java.util.Scanner;



public class ex1 {

    public static int somarAlgarismos(int numero){
        int soma = 0;

        while (numero>0){
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        //Escreva um programa que leia um número inteiro maior do que zero e
        //devolva, na tela, a soma de todos os seus algarismos. Por exemplo, ao
        //número 251 corresponderá o valor 8 (2 + 5 + 1). Se o número lido não for
        //maior do que zero, o programa terminará com a mensagem “Número
        //inválido”.
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextShort();

        if(numero1<0){
            System.out.println("Numero invalido");
            System.exit(0);
        }
        int resultado = somarAlgarismos(numero1);
        System.out.println("A soma dos algarismos eh: "+ resultado);

    }
}