package lista8;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        //Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preço
        //antigo, calcule e escreva o preço novo, e escreva uma mensagem em função
        //do preço novo (de acordo com a segunda tabela).
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorBruto = input.nextDouble();

        if(valorBruto<50){

            System.out.println("Percentual de aumento 5%. bruto: " +valorBruto +" corrigido: "+ (valorBruto*1.05));
        }else if (valorBruto<100){
            System.out.println("Percentual de aumento 10%. bruto: " +valorBruto +" corrigido: "+ (valorBruto*1.1));
        }else {
            System.out.println("Percentual de aumento 15%. bruto: " +valorBruto +" corrigido: "+ (valorBruto*1.15));
        }
    }
}
