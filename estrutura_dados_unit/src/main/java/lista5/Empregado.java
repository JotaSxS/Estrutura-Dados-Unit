package lista5;
public class Empregado {
    private String nome;
    private String sobreNome;
    private double salario;

    public Empregado(String nome, String sobreNome, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double aumento(double porcetangem_aumento){
        this.salario += salario*(porcetangem_aumento/100);
        return this.salario;
    }
}
