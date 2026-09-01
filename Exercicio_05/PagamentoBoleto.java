package Exercicio_05;

// Classe que representa um pagamento realizado por boleto.
// Ela herda as características da classe Pagamento e personaliza o comportamento.
public class PagamentoBoleto extends Pagamento {
    // Código de barras do boleto, específico desta forma de pagamento.
    private String codigoBarras;

    // Construtor da subclasse.
    // Chama o construtor da classe pai e atribui o código de barras.
    public PagamentoBoleto(double valor, String data, String codigoBarras) {
        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    // Sobrescreve o cálculo da taxa para boletos.
    // A taxa aqui é 1% do valor do pagamento.
    @Override
    public double calcularTaxa() {
        return valor * 0.01; // Taxa de 1%
    }

    // Sobrescreve o processamento para exibir as informações específicas do boleto.
    @Override
    public void processarPagamento() {
        System.out.println("--- Pagamento via Boleto ---");
        System.out.println("Data: " + data);
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Taxa (1%): R$ " + calcularTaxa());
        System.out.println("Total a pagar: R$ " + (valor + calcularTaxa()));
    }
}