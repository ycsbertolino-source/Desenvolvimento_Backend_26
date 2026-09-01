package Exercicio_01;
    

public class FilmeAcao extends Filme {
    private String nivelViolencia;

    public FilmeAcao(String titulo, int duracao, String classificacao, String nivelViolencia) {
        super(titulo, duracao, classificacao);
        this.nivelViolencia = nivelViolencia;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método da classe pai
        System.out.println("Nível de Violência: " + nivelViolencia);
    }
}