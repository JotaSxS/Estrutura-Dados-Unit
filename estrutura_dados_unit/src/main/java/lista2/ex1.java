package lista2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida
        //em km/h (quilômetros por hora). A fórmula de conversão é: K = M ∗ 3.6,
        //sendo K a velocidade em km/h e M em m/s.
        Scanner sc = new Scanner(System.in);
        float m_s = sc.nextFloat();
        //System.out.println(m_s*3.6+"km/h");
        System.out.printf("%.1f km/h",m_s*3.6);
    }
}
