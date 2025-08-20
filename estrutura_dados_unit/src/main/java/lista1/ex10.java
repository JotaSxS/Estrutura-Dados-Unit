package lista1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //Leia uma velocidade em km/h (quilômetros por hora) e apresente-a
        //convertida em m/s (metros por segundo). A fórmula de conversão é: M =
        //K/3.6, sendo K a velocidade em km/h e M em m/s.
        Scanner sc = new Scanner(System.in);
        float km_hr = sc.nextFloat();
        double m_s = km_hr / 3.6;
        System.out.println(m_s+"m/s");
        sc.close();

    }
}