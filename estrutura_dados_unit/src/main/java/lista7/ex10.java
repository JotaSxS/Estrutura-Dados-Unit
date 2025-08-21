package lista7;
import java.util.Scanner;

public class ex10 {

    public static double calculadora(double num1, double num2, char op) {
        double resultado;
        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Nao eh possivel dividir por zero");
                }else {
                    resultado = num1 / num2;
                    break;
                }
            default:
                throw  new IllegalArgumentException("Operador invalido");
        }
        return resultado;
    }

    public static void main(String[] args) {
        //
        try {
            System.out.println("Digite a operacao matematica que deseja realizar(+, -, *, /)");
            Scanner sc = new Scanner(System.in);
            char operador = sc.next().charAt(0);
            //System.out.println(operador);
            System.out.println("Digite o numero 1: ");
            double num1 = sc.nextDouble();
            System.out.println("Digite o numero 2: ");
            double num2 = sc.nextDouble();
            System.out.print(calculadora(num1, num2, operador));

        }catch(ArithmeticException e){
            System.out.println("Ocorreu um erro:"+e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Ocorreu um erro:"+e.getMessage());
        }catch (Exception e){
            System.out.println("Ocorreu um erro:"+e.getMessage());
        }
    }
}
