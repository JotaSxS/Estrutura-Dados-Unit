package lista3;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        //16.Leia um número inteiro de 4 dígitos (de 1000 a 9999) e imprima 1 dígito por
        //linha.
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine().trim();

        for(int i = 0; i <numero.length(); i++) {
            System.out.println(numero.charAt(i));
        }


    }
}