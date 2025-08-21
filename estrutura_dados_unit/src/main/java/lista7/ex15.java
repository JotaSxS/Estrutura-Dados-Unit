package lista7;
import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano para verificar se ele é bissexto:");

        int ano = entrada.nextInt();

        boolean eBissexto = false;

        // Um ano é bissexto se for divisível por 4.
        // Exceto se for divisível por 100...
        // ...a não ser que também seja divisível por 400.
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    eBissexto = true;
                }
            } else {
                eBissexto = true;
            }
        }

        if (eBissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        entrada.close();
    }
}