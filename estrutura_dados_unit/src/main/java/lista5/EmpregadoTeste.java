package lista5;
public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Joao", "Pedro", 1700.59);
        Empregado empregado2 = new Empregado("Maria", "Silva", 1590.75);

        System.out.println("--- Empregado 1 ---");
        System.out.println("Nome: " + empregado1.getNome() +" "+ empregado1.getSobreNome());
        System.out.println("Salario: "+empregado1.getSalario());

        System.out.println("--- Empregado 2 ---");
        System.out.println("Nome: " + empregado2.getNome() +" "+ empregado2.getSobreNome());
        System.out.println("Salario: "+empregado2.getSalario());

        System.out.println("--- Empregado 1 (Apos aumento de 10%) ---");
        System.out.println("Nome: " + empregado1.getNome() +" "+ empregado1.getSobreNome());
        System.out.println("Salario: "+empregado1.aumento(10));

        System.out.println("--- Empregado 2 (Apos aumento de 10%) ---");
        System.out.println("Nome: " + empregado2.getNome() +" "+ empregado2.getSobreNome());
        System.out.println("Salario: "+empregado2.aumento(10));

    }
}
