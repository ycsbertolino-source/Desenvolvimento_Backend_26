package Exercicio_04;

public class Esteira extends Maquina {
    
    public Esteira(int codigo, String nome, String status) {
        super(codigo, nome, status);
    }
    @Override
    public void operar() {
        System.out.println("Esteira: Transportando materiais pela linha de produção.");
    }
}