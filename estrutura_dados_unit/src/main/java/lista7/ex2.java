package lista7;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //Ler um número inteiro. Se o número lido for negativo, escreva a mensagem
        //“Numero invalido”. Se o número for positivo, calcular o logaritmo deste
        //número.
        Scanner sc =new Scanner(System.in);
        double numero = sc.nextInt();
        if(numero<0){
            System.out.println("Numero invalido");
            System.exit(0);
        }
        double resultado = Math.log(numero);

        System.out.println("O logaritmo natural de "+numero+" é " + resultado);
        resultado = Math.log10(numero);
        System.out.println("O logaritmo na base 10 de "+ numero+" é "+ resultado);

    }
}