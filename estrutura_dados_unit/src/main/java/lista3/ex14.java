package lista3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        //14.Faça um programa que leia um número inteiro positivo de três dígitos (de 100
        //a 999).
        //Gere outro número formado pelos dígitos invertidos do número lido. Exemplo:
        //NúmeroLido = 123
        //NúmeroGerado = 321

        Scanner sc = new Scanner(System.in);
        String numero_invertido ="";

        try {
            String numero = sc.nextLine().trim();

            for( int i =numero.length()-1; i>=0; i--){
                // verifica se possui apenas numeros
                if(!Character.isDigit(numero.charAt(i))){
                    System.out.println("Error: Entrada invalida.");
                    return;
                }

                numero_invertido += numero.charAt(i);
            }
            System.out.println(numero_invertido);

        } catch (NoSuchElementException e) {
            System.out.println("Error: Nenhuma linha encontrada: "+e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("Error: Formato de dado nao aceito: "+e.getMessage());
        }catch (Exception e) {
            System.out.println("Error: Erro inesperado: "+e.getMessage());
            e.printStackTrace();
        }finally {
            sc.close();
        }
    }
}