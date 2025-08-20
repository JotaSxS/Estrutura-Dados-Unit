package lista3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //A importância de R$780.000,00 será dividida entre três ganhadores de um
        //concurso. Sendo que da quantia total:
        Scanner sc = new Scanner(System.in);
        double premio;
        final double valor_padrao = 780000;
        System.out.println("O premio è de 780.000 caso deseje alterar digite o novo valor:");

        // VERIFICANDO SE O USUARIO VAI INFORMAR UM NUMERO OU DEIXAR O PADRAO
        // le a linha inteira digitada pelo usuario ( incluindo uma linha vazia)
        String inputLine = sc.nextLine();

        //trim() remove os espacos em branco
        if(inputLine.trim().isEmpty()){
            premio = valor_padrao;
        }else {
            try{
                premio = Double.parseDouble(inputLine.trim());
            }catch (NumberFormatException e){
                // captura o erro se a linha nao puder ser convertida para double
                premio = valor_padrao;
            }
        }

        // DIVISAO DA QUANTIA
        System.out.printf("Primeiro ganhador: %.2f\nSegundo ganhador: %.2f\nTerceiro ganhador: %.2f", (premio*0.46), (premio*0.32),(premio*0.22));

    }

}