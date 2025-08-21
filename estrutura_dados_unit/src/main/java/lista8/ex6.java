package lista8;

import java.util.Scanner;

public class ex6 {


    public static void main(String[] args) {
    //lanchonete
        System.out.println("--- Cardápio da Lanchonete ---");
        System.out.println("100 - Cachorro Quente  - R$ 1.20");
        System.out.println("101 - Bauru Simples    - R$ 1.30");
        System.out.println("102 - Bauru com Ovo    - R$ 1.50");
        System.out.println("103 - Hambúrguer       - R$ 1.20");
        System.out.println("104 - Cheeseburguer    - R$ 1.70");
        System.out.println("105 - Suco             - R$ 2.20");
        System.out.println("106 - Refrigerante     - R$ 1.00");
        System.out.println("------------------------------");

        double precoCachorroQuente = 1.20;
        double precoBauruSimples = 1.30;
        double precoBauruOvo = 1.50;
        double precoHamburguer = 1.20;
        double precoCheeseburguer = 1.70;
        double precoSuco = 2.20;
        double precoRefrigerante = 1.00;


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        int codigo =  ler.nextInt();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = ler.nextInt();
        double valorTotal=0.0;

        switch (codigo) {
            case 100:
                valorTotal = quantidade * precoCachorroQuente;
                break;
            case 101:
                valorTotal = quantidade * precoBauruSimples;
                break;
            case 102:
                valorTotal = quantidade * precoBauruOvo;
                break;
            case 103:
                valorTotal = quantidade * precoHamburguer;
                break;
            case 104:
                valorTotal = quantidade * precoCheeseburguer;
                break;
            case 105:
                valorTotal = quantidade * precoSuco;
                break;
            case 106:
                valorTotal = quantidade * precoRefrigerante;
                break;
            default:
                System.out.println("Código do produto inválido!");
                break;
        }
        System.out.println(valorTotal);


    }
}
