package lista3;

import java.time.Year;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        //19.Implemente um programa que calcule o ano de nascimento de uma pessoa a
        //partir de sua idade e do ano atual.
        Scanner sc = new Scanner(System.in);
        int idade=sc.nextInt();
        int anoAtual= Year.now().getValue();
        int anoNascimento= anoAtual-idade;
        System.out.println(anoNascimento);
    }
}