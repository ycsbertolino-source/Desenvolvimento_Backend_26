package Exercicio_05;

import java.util.ArrayList;
import java.util.List;

// Classe principal para testar o comportamento de herança e polimorfismo.
public class Main {
    public static void main(String[] args) {
        // Criando a lista de pagamentos com o tipo da superclasse.
        // Isso permite armazenar objetos de diferentes subclasses em uma mesma estrutura.
        List<Pagamento> operacoes = new ArrayList<>();

        // Adicionando instâncias das subclasses na lista.
        // Cada objeto tem seu comportamento específico, mesmo sendo tratado como Pagamento.
        operacoes.add(new PagamentoPix(200.0, "21/09/2026", "123.456.789-00"));
        operacoes.add(new PagamentoCartao(1500.0, "31/08/2026", "1234-5678-9012-3456", 5));
        operacoes.add(new PagamentoBoleto(450.0, "31/08/2026", "34191.09008 63571.277308 71444.640008 1 80000000000500"));

        System.out.println("Iniciando processamento em lote...\n");

        // Percorrendo a lista com polimorfismo.
        // O método processarPagamento() executa a versão correta de cada objeto.
        for (Pagamento pag : operacoes) {
            pag.processarPagamento();
            System.out.println(); // Linha em branco para separar as operações
        }
    }
}