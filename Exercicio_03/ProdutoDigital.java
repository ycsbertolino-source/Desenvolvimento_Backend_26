package Exercicio_03;

public class ProdutoDigital extends Produto {
    
    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 0.0;
    }
}