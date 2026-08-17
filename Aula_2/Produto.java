package Aula_2;
public class Produto {
    // Caracteristicas do produto
    String nome;
    double preco;
    int quantidade;

    // Ações que o produto pode fazer
    public void mostrarDetalhes(){
        System.out.println("Produto: " + nome + " valor: R$ " + preco);
    }
public void main(String [] args){
Produto p1 = new Produto();
p1.nome = "Notebook";
p1.preco=2500.00;
p1.mostrarDetalhes();
}
}



