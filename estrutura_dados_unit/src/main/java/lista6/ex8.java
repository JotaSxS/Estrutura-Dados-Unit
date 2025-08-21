package lista6;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //Faça um programa que leia 2 notas de um aluno, verifique se as notas são
        //válidas e exiba na tela a média destas notas. Uma nota válida deve ser,
        //obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a nota não possua um
        //valor válido, este fato deve ser informado ao usuário e o programa termina.
        Scanner input = new Scanner(System.in);
        double nota1=input.nextDouble();
        if(nota1<0||nota1>10){
            System.out.println("Nota invalida");
            System.out.println("Encerrando..");
            System.exit(0);
        }
        double nota2=input.nextDouble();
        if(nota2<0||nota2>10){
            System.out.println("Nota invalida");
            System.out.println("Encerrando..");
            System.exit(0);
        }
        System.out.println("Media: "+ (nota1+nota2)/2);
    }
}

