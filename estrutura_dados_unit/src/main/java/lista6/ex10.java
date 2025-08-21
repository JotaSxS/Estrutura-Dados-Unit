package lista6;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // 10.Faca um programa que receba a altura e o sexo de uma pessoa e calcule e
        //mostre seu peso ideal, utilizando as seguintes formulas (onde h corresponde
        //a altura):
        //Homens: (72.7 ∗ h) − 58
        //Mulheres: (62.1 ∗ h) -44,7
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu sexo M ou F: ");

        char sexo = input.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        System.out.println("Digite sua altura: ");
        float altura = input.nextFloat();
        if(sexo=='M'){
            float pesoIdeal = (float) (72.7 * altura -58);
            System.out.println("Peso ideal: "+pesoIdeal);
        } else if (sexo=='F') {
            float pesoIdeal = (float) (62.1 * altura -44.7 );
            System.out.println("Peso ideal: "+pesoIdeal);
        }else{
            System.out.println("Dado invalido");
        }
    }
}
