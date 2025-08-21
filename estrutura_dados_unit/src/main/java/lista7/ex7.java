package lista7;
import java.util.Scanner;

public class ex7 {

    public static String nomeMes(int m) {
        String resultado;
        switch (m) {
            case 1:
                resultado = "Janeiro";
                break;
            case 2:
                resultado = "Fevereiro";
                break;
            case 3:
                resultado = "Março";
                break;
            case 4:
                resultado = "Abril";
                break;
            case 5:
                resultado = "Maio";
                break;
            case 6:
                resultado = "Junho";
                break;
            case 7:
                resultado = "Julho";
                break;
            case 8:
                resultado = "Agosto";
                break;
            case 9:
                resultado = "Setembro";
                break;
            case 10:
                resultado = "Outubro";
                break;
            case 11:
                resultado = "Novembro";
                break;
            case 12:
                resultado = "Dezembro";
                break;
            default:
                resultado = "Número do mês inválido.";
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        //Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e
        //imprima o mês correspondente a este número. Isto é, janeiro se 1, fevereiro
        //se 2, e assim por diante.

        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        System.out.print(nomeMes(mes));
    }
}
