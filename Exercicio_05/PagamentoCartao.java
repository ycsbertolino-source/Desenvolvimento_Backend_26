package Exercicio_05;

// Representa um pagamento realizado com cartão de crédito.
// A classe herda a estrutura de Pagamento e altera a regra de taxa.
public class PagamentoCartao extends Pagamento {
    // Dados específicos do cartão.
    private String numeroCartao;
    private int parcelas;

    // Construtor que recebe valor, data, número do cartão e quantidade de parcelas.
    public PagamentoCartao(double valor, String data, String numeroCartao, int parcelas) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    // Sobrescreve a taxa do pagamento para cartão.
    // A taxa aqui é 3% do valor.
    @Override
    public double calcularTaxa() {
        return valor * 0.03; // Taxa de 3%
    }

    // Sobrescreve o processamento para mostrar os detalhes específicos do cartão.
    @Override
    public void processarPagamento() {
        System.out.println("--- Pagamento via Cartão de Crédito ---");
        System.out.println("Data: " + data);
        System.out.println("Cartão Final: " + numeroCartao.substring(numeroCartao.length() - 4) + " | Parcelas: " + parcelas + "x");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Taxa (3%): R$ " + calcularTaxa());
        System.out.println("Total a pagar: R$ " + (valor + calcularTaxa()));
    }
}