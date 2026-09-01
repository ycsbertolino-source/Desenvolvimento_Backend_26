package Exercicio_03;

public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(int codigo, String nome, double preco, double peso) {
        super(codigo, nome, preco);
        this.peso = peso;
    }

    @Override
    public double calcularFrete() {
        return peso * 8.0;
    }
}