package lista7;
import java.util.Scanner;
// QUESTAO 4 E 5
public class ex4e5 {

    public static double validarNota(double nota){
        if( nota>10 || nota<0){
            throw new IllegalArgumentException("Nota invalida");
        }
        return nota;
    }
    public static void verificarAprovacao(double media){
        if ( media >=5){
            System.out.println("Aprovado");
        } else if (media >=3) {
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        // Ler 3 notas com peso 2 3 1 obter a media
        // reprovado media entre 0 e 2,9
        // recuperacao entre 3 e 4,9
        Scanner input = new Scanner(System.in);
        try {
            double nota1 =input.nextDouble();
            validarNota(nota1);
            double nota2=input.nextDouble();
            validarNota(nota2);
            double nota3=input.nextDouble();
            validarNota(nota3);

            double media = (nota1*2 +nota2*3 +nota3)/6;
            verificarAprovacao(media);

        }catch (IllegalArgumentException e){
            System.out.println("Erro :" + e.getMessage());
        }catch (java.util.InputMismatchException e){
            System.out.println("Erro : digite apenas numeros");
        }
    }
}
