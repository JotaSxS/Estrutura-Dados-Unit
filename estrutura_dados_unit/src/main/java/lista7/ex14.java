package lista7;
import java.util.Scanner;

public class ex14 {
    //14.Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode
    //ou não se aposentar. As condições para aposentadoria são
    //● Ter pelo menos 65 anos,
    //● Ou ter trabalhado pelo menos 30 anos,
    //● Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.

    public static String verificaAposentadoria(int idade, int anosTrabalho){
        if(idade>=65 || anosTrabalho>=30 || (idade>=60 && anosTrabalho>=25)){
            return "Atende as condicoes de aposentadoria";
        }else {
            return "Nao pode se aposentar";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do trabalhador");
        int id = scanner.nextInt();
        System.out.println("Digite os anos trabalhados");
        int at = scanner.nextInt();

        System.out.println(verificaAposentadoria(id, at));

    }
}
