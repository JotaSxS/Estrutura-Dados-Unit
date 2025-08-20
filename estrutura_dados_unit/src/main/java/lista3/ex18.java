package lista3;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do horário de início
        System.out.print("Digite a hora de início (0-23): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite o minuto de início (0-59): ");
        int minutoInicio = scanner.nextInt();

        System.out.print("Digite o segundo de início (0-59): ");
        int segundoInicio = scanner.nextInt();

        // Entrada da duração
        System.out.print("Digite a duração da experiência em segundos: ");
        int duracaoSegundos = scanner.nextInt();

        // Converte o horário de início para segundos
        int totalSegundosInicio = horaInicio * 3600 + minutoInicio * 60 + segundoInicio;

        // Adiciona a duração para obter o total de segundos do horário de término
        int totalSegundosTermino = totalSegundosInicio + duracaoSegundos;

        // Converte o total de segundos do término de volta para horas, minutos e segundos
        int horasFim = (totalSegundosTermino / 3600) % 24;
        int segundosRestantes = totalSegundosTermino % 3600;
        int minutosFim = segundosRestantes / 60;
        int segundosFim = segundosRestantes % 60;

        // Imprime o resultado
        System.out.printf("\nHorário de início: %02d:%02d:%02d\n", horaInicio, minutoInicio, segundoInicio);
        System.out.printf("Duração da experiência: %d segundos\n", duracaoSegundos);
        System.out.printf("Horário de término: %02d:%02d:%02d\n", horasFim, minutosFim, segundosFim);

        scanner.close();
    }
}