package lista8;

import java.util.Scanner;

public class ex1 {

    public static double valorFinal(double valor, String estado){
        double resultado;
        switch (estado){
            case "SP":
                return valor * 1.12;

            case "RJ":
                return valor * 1.15;

            case "MG":
                return valor * 1.07;

            case "MS":
                return valor * 1.08;

            default:
                throw new IllegalArgumentException("Estado nao encontrado no sistema");
        }

    }

    public static void main(String[] args) {
        //Faça um programa em que o usuário entre com o
        //valor e o estado destino do produto e o programa retorne o preço final do
        //produto acrescido do imposto do estado em que ele será vendido.
        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Digite o preco do produto: ");
            double preco = input.nextDouble();
            System.out.println("Digite o estado destino do produto(SP, MG, RJ, MS): ");
            String estado = input.next().toUpperCase();
            System.out.println(valorFinal(preco, estado));

        }catch (IllegalArgumentException e){
            System.out.println("ERROR : "+e.getMessage());
        }
    }
}
