package lista5;
public class FaturaTeste {
    public static void main(String[] args) {
        // Criando uma fatura com valores positivos
        Fatura fatura1 = new Fatura("001", "Mouse", 3, 25.50);

        System.out.println("--- Fatura 1 (Valores Positivos) ---");
        System.out.println("Número da Fatura: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço por Item: " + fatura1.getPreco());
        System.out.println("Total da Fatura: " + fatura1.getTotalFatura());

        System.out.println("\n-------------------------------------");

        // Criando uma fatura com valores negativos para testar a validação
        Fatura fatura2 = new Fatura("002", "Teclado", -2, -50.00);

        // Demonstração da validação
        // O construtor não faz a validação, por isso usamos os sets
        fatura2.setQuantidade(-2);
        fatura2.setPreco(-50.00);

        System.out.println("--- Fatura 2 (Valores Negativos) ---");
        System.out.println("Número da Fatura: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade()); // Será 0
        System.out.println("Preço por Item: " + fatura2.getPreco()); // Será 0.0
        System.out.println("Total da Fatura: " + fatura2.getTotalFatura()); // Será 0.0

        System.out.println("\n-------------------------------------");

        // Criando uma fatura com valores mistos
        Fatura fatura3 = new Fatura("003", "Monitor", 1, 350.00);
        fatura3.setQuantidade(-5); // Alterando a quantidade para um valor inválido

        System.out.println("--- Fatura 3 (Validação após a criação) ---");
        System.out.println("Número da Fatura: " + fatura3.getNumero());
        System.out.println("Descrição: " + fatura3.getDescricao());
        System.out.println("Quantidade: " + fatura3.getQuantidade()); // Será 0
        System.out.println("Preço por Item: " + fatura3.getPreco());
        System.out.println("Total da Fatura: " + fatura3.getTotalFatura()); // Será 0.0
    }
}