package Aula_2;

public class Principal {
    // metodo principal para executar o codigo
    public static void main(String []args){

    // Cria o objeto chamado meuCarro
    Carro meuCarro = new Carro("Fiat", "Azul");

    // Atribuindo a cor e a marca ao objeto
    // meuCarro.marca = "Fiat";
    // meuCarro.cor = "azul";
    // Exibindo informações do veiculo
    System.out.println("Carro marca: " + meuCarro.marca + " cor: " + meuCarro.cor);
    meuCarro.buzinar();

    }
    
}
