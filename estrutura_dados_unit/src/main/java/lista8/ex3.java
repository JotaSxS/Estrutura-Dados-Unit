package lista8;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex3 {
    /* Escreva um programa que, dada a idade de um nadador, classifique-o em
uma das seguintes categorias: */
    public static String categoriaNadador(int idade) {
        if (idade >= 18) {
            return "Senior";
        } else if (idade >= 14) {
            return "Juvenil B";
        } else if (idade >= 11) {
            return "Juvenil A";
        } else if (idade >= 8) {
            return "Infantil B";
        } else if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else {
            return "Idade fora das categorias";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Idade do nadador :");
        int idade1 = sc.nextInt();
        System.out.println(categoriaNadador(idade1));

    }



}