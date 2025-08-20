package lista3;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //Escreva um programa de ajuda para vendedores. A partir de um valor total
        //lido, mostre:
        //O total a pagar com desconto de 10%;
        //O valor de cada parcela, no parcelamento de 3× sem juros;
        //A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com
        //desconto);
        //A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor
        //total) ;
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        System.out.println("Valor com 10% de desconto: R$"+ valor*0.9);
        System.out.println("Parcelas de 3x de "+ (valor/3)+" sem juros");
        System.out.println("Comissao da venda a vista: R$"+valor * 0.9 * 0.05);
        System.out.println("Comissao da venda parcelada: R$"+valor*0.05);
    }
}