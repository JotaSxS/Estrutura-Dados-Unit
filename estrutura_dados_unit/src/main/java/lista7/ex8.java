package lista7;
import java.util.Scanner;

public class ex8 {

    public static double areaTrapezio(double baseMaior, double baseMenor,double altura){
        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
            //return Double.NaN; // Retorna Not a Number para indicar erro
            throw new IllegalArgumentException("A base maior, base menor e a altura devem ser valores positivos.");
        }

        double area = (baseMaior + baseMenor)*altura / 2;
        return area;
    }

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o valor da base Maior  : ");
            double baseMaior = input.nextDouble();
            System.out.println("Digite o valor da base Menor  : ");
            double baseMenor = input.nextDouble();
            System.out.println("Digite o valor da altura  : ");
            double altura = input.nextDouble();

            System.out.println("A area do trapezio : "+areaTrapezio(baseMaior, baseMenor, altura));
        }catch (IllegalArgumentException e){
            System.out.println("Ocorreu um erro ao calcular a area:\n"+e.getMessage());
        }

        //Faça um programa que calcule e mostre a área de um trapézio.

    }
}
