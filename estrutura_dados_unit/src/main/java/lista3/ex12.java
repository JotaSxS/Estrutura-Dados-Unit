package lista3;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        //12.Receba a altura do degrau de uma escada e a altura que o usuário deseja
        //alcançar subindo a escada. Calcule e mostre quantos degraus o usuário
        //deverá subir para atingir seu objetivo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura do degrau:");
        double altura_degrau = sc.nextDouble();
        System.out.println("Altura que se deseja subir:");
        double alturaSubir = sc.nextDouble();
        double numero_degraus = alturaSubir / altura_degrau;
        System.out.println("Numero de degraus: "+(int)numero_degraus);
    }
}