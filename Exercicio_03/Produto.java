package Exercicio_03;

public class Produto {
    protected int codigo;
    protected String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Método padrão que será sobrescrito nas subclasses
    public double calcularFrete() {
        return 0.0; 
    }

    public void exibirDetalhes() {
        System.out.println("Código: " + codigo + " | Produto: " + nome + " | Preço: R$ " + preco);
    }
}