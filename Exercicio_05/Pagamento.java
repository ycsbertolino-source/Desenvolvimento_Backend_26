package Exercicio_05;

// Classe base que representa um pagamento genérico.
// Todas as formas de pagamento (PIX, cartão e boleto) herdam dessa classe.
public class Pagamento {
    // Atributos protegidos: acessíveis pelas subclasses.
    protected double valor;
    protected String data;

    // Construtor da classe base.
    // Recebe o valor e a data do pagamento.
    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    // Método padrão para cálculo da taxa.
    // Como a taxa pode variar por tipo de pagamento, a implementação base retorna 0.
    public double calcularTaxa() {
        return 0.0;
    }

    // Método genérico para processar o pagamento.
    // As subclasses sobrescrevem esse método para mostrar o comportamento específico.
    public void processarPagamento() {
        System.out.println("Processando pagamento genérico...");
    }
}