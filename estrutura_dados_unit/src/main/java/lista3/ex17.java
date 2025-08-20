package lista3;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        //17.Leia um valor inteiro em segundos, e imprima-o em horas, minutos e
        //segundos.
        Scanner sc = new Scanner(System.in);
        int total_segundos = sc.nextInt();
        int horas = total_segundos / 3600;
        int segundos_restantes = total_segundos % 3600;
        int minutos = segundos_restantes / 60;
        int segundos = segundos_restantes % 60;
        System.out.println(horas + ":"  + minutos + ":" + segundos);

    }
}