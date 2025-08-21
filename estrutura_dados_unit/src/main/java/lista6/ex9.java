package lista6;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //Leia o salário de um trabalhador e o valor da prestação de um empréstimo.
        //Se a prestação for maior que 20% do salário imprima: Empréstimo não
        //concedido, caso contrário imprima: Empréstimo concedido.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");
        double salario = input.nextDouble();

        System.out.println("Digite o valor do emprestimo: ");
        double prestacao = input.nextDouble();
        double limite = salario*0.2;

        if( prestacao > limite){
            System.out.println("Emprestimo nao concedido");
        }else{
            System.out.println("Emprestimo concedido");
        }

    }
}
