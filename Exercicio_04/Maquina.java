package Exercicio_04;

public class Maquina {
    private int codigo;
   private String nome;
    private String status;

    public Maquina(int codigo, String nome, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

    public void operar() {
        System.out.println("A máquina " + nome + " está operando de forma genérica.");
    }
    
    public void exibirInfo() {
        System.out.println("Código: " + codigo + " | Máquina: " + nome + " | Status: " + status);
    }
}