package Exercicio_01;


    public class FilmeDocumentario extends Filme {
    private String tema;

    public FilmeDocumentario(String titulo, int duracao, String classificacao, String tema) {
        super(titulo, duracao, classificacao);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tema: " + tema);
    }
}

