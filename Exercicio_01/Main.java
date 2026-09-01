package Exercicio_01;

    

public class Main {
    public static void main(String[] args) {
        // Referência do tipo Filme, objeto do tipo FilmeAcao
        Filme filme1 = new FilmeAcao("Duro de Matar", 132, "14 anos", "Alto");
        
        // Referência do tipo Filme, objeto do tipo FilmeDocumentario
        Filme filme2 = new FilmeDocumentario("Planeta Terra", 90, "Livre", "Natureza");

        // Polimorfismo na prática: cada um chama a sua própria implementação
        filme1.exibirDetalhes();
        System.out.println("-------------------");
        filme2.exibirDetalhes();
    }
}