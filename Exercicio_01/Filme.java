package Exercicio_01;


public class Filme {
    protected String titulo;
    protected int duracao; // em minutos
    protected String classificacao;

    public Filme(String titulo, int duracao, String classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + " | Duração: " + duracao + " min | Classificação: " + classificacao);
    }
}