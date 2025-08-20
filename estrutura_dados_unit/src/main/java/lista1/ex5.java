package lista1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // Leia um número real e imprima a quinta parte deste número.
        Scanner sc = new Scanner(System.in);

        float num  = sc.nextFloat();
        System.out.println(num/5);
    }
}