package Exercicio_03;

public class Main {
    public static void main(String[] args) {
        // Criando objetos utilizando referência da superclasse 'Produto'
        Produto produto1 = new ProdutoFisico(101, "Teclado Mecânico", 350.00, 1.2);
        Produto produto2 = new ProdutoDigital(202, "Curso de Java", 299.90);

        System.out.println("--- Produto 1 ---");
        produto1.exibirDetalhes();
        System.out.println("Valor do Frete: R$ " + produto1.calcularFrete());

        System.out.println("\n--- Produto 2 ---");
        produto2.exibirDetalhes();
        System.out.println("Valor do Frete: R$ " + produto2.calcularFrete());
    }
}