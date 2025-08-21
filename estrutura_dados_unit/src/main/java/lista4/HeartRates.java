package lista4;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    // Métodos get e set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Métodos get e set para data de nascimento
    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // Método para calcular a idade
    public int calcularIdade() {
        LocalDate dataNascimento = LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento);
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

    // Método para calcular a frequência cardíaca máxima
    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calcularIdade();
        return 220 - idade;
    }

    // Método para calcular a frequência cardíaca alvo (intervalo de 50% a 85%)
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int frequenciaAlvoMin = (int) (frequenciaMaxima * 0.50);
        int frequenciaAlvoMax = (int) (frequenciaMaxima * 0.85);
        return String.format("%d - %d bpm", frequenciaAlvoMin, frequenciaAlvoMax);
    }
}