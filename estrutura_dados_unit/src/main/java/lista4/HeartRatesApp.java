package lista4;

import java.util.Scanner;

public class HeartRatesApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Calculadora de Frequência Cardíaca ---");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua data de nascimento:");
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
        System.out.print("Mês: ");
        int mes = entrada.nextInt();
        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        // Instanciação do objeto HeartRates
        HeartRates pessoa = new HeartRates(nome, sobrenome, dia, mes, ano);

        System.out.println("\n--- Informações da Pessoa ---");
        System.out.printf("Nome completo: %s %s%n", pessoa.getNome(), pessoa.getSobrenome());
        System.out.printf("Data de nascimento: %d/%d/%d%n", pessoa.getDiaNascimento(), pessoa.getMesNascimento(), pessoa.getAnoNascimento());

        System.out.println("\n--- Frequência Cardíaca ---");
        System.out.printf("Idade: %d anos%n", pessoa.calcularIdade());
        System.out.printf("Frequência Cardíaca Máxima: %d bpm%n", pessoa.calcularFrequenciaCardiacaMaxima());
        System.out.printf("Frequência Cardíaca Alvo: %s%n", pessoa.calcularFrequenciaCardiacaAlvo());

        System.out.println("\nLembre-se: consulte um médico ou profissional de saúde antes de iniciar um programa de exercícios.");

        entrada.close();
    }
}