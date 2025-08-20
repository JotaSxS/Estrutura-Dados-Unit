package lista3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        //13.Faça um programa para converter uma letra maiuscula em letra minúscula.
        //Use a tabela ASCII para resolver o problema.
        Scanner sc = new Scanner(System.in);

        try {
            char maiuscula = sc.next().charAt(0);

            if(maiuscula >= 'A' && maiuscula <= 'Z'){
                System.out.println(maiuscula);
            } else if (maiuscula >= 'a' && maiuscula <= 'z') {
                System.out.println((char) (maiuscula - 32));
            }else{
                System.out.println("Nao foi encontrada nenhuma letra");
            }

        }catch (NoSuchElementException e){
            System.err.println("Erro: Nenhuma entrada");
            e.printStackTrace();
        }catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }finally {
            sc.close();
        }



    }
}