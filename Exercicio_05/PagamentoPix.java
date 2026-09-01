package Exercicio_05;

// Classe que representa um pagamento via PIX.
// Nesse caso, a taxa é zero, então o método é sobrescrito para refletir isso.
public class PagamentoPix extends Pagamento {
    // Informação específica da chave PIX.
    private String chavePix;

    // Construtor da classe.
    // Recebe valor, data e chave PIX do pagador.
    public PagamentoPix(double valor, String data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    // Sobrescreve a taxa para indicar que PIX é isento.
    @Override
    public double calcularTaxa() {
        return 0.0; // Isento de taxa
    }

    // Sobrescreve o processamento para exibir os detalhes específicos do PIX.
    @Override
    public void processarPagamento() {
        System.out.println("--- Pagamento via PIX ---");
        System.out.println("Data: " + data);
        System.out.println("Chave PIX: " + chavePix);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Taxa: R$ " + calcularTaxa());
        System.out.println("Total a pagar: R$ " + (valor + calcularTaxa()));
    }
}