package lista8;

import java.util.Scanner;

public class ex5 {

    public static String classificaPessoa(double altura, double peso) {
        String classificacao;
        if (peso <= 60) {
            if (altura < 1.20) {
                classificacao = "A";
            } else if (altura <= 1.70) {
                classificacao = "B";
            } else {
                classificacao = "C";
            }
        } else if (peso <= 90) {
            if (altura < 1.20) {
                classificacao = "D";
            } else if (altura <= 1.70) {
                classificacao = "E";
            } else {
                classificacao = "F";
            }
        } else { // peso > 90
            if (altura < 1.20) {
                classificacao = "G";
            } else if (altura <= 1.70) {
                classificacao = "H";
            } else {
                classificacao = "I";
            }
        }
        return classificacao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura : ");
        double idade1 = sc.nextDouble();
        System.out.println("Infome o peso :");
        double peso1 = sc.nextDouble();
        System.out.println(classificaPessoa(idade1, peso1));

    }
}