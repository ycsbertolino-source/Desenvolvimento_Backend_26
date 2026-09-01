package Exercicio_04;

public class Prensa extends Maquina {
    
    public Prensa(int codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println("Prensa: Executando processo de conformação e estamparia.");
    }
}