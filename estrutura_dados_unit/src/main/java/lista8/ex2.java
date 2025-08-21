package lista8;

import java.util.Scanner;

public class ex2 {

    public static String analiseConsumoCarro(double k, double l){
        double consumoMedio = k/l;
        if(consumoMedio<8){
            return "Venda o carro !";

        } else if (consumoMedio >=14) {
            return "Super economico !";
        }else{
            return "Economico !";
        }

    }
    public static void main(String[] args) {
        //Leia a distância em Km e a quantidade de litros de gasolina consumidos por
        //um carro em um percurso, calcule o consumo em Km/l e escreva uma
        //mensagem de acordo com a tabela abaixo:
        System.out.println("---Analise de consumo do carro---");
        try {
            Scanner ler = new Scanner (System.in);
            System.out.println("Informe a distancia percorrida:");
            double km = ler.nextDouble();
            System.out.println("Quantidade de litros consumidos:");
            double litros = ler.nextDouble();

            System.out.println(analiseConsumoCarro(km, litros));
        }catch (Exception e){
            System.out.println("Erro na analise de consumo do carro :"+e.getMessage());
        }
    }
}
