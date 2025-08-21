package lista7;
import java.util.Scanner;

public class ex6 {

    public static String diaSemana(int d){
        String resultado;
        switch (d){
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda";
                break;
            case 3:
                resultado= "Terca";
                break;
            case 4:
                resultado = "Quarta";
                break;
            case 5:
                resultado = "Quinta";
                break;
            case 6:
                resultado = "Sexta";
                break;
            case 7:
                resultado = "Sabado";
                break;
            default:
                resultado ="Numero da semana invalido";
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        //Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e
        //imprima o dia da semana correspondente a este número. Isto é, domingo se
        //1, segunda-feira se 2, e assim por diante.
        Scanner input = new Scanner(System.in);
        int dia =  input.nextInt();
        System.out.println(diaSemana(dia));


    }
}
