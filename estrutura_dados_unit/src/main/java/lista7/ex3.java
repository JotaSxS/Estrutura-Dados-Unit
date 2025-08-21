package lista7;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A
        //primeira e a segunda prova tem peso 1 e a terceira tem peso 2. Ao final,
        //mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. A
        //nota para aprovação deve ser igual ou superior a 60 pontos.
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3*2)/4;
        if (media<6 ){
            System.out.printf("Reprovado media : %.2f",media);
        }else {
            System.out.printf("Aprovado media : %.2f",media);
        }
    }
}