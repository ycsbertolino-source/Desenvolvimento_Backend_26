package Exercicio_04;

public class RoboIndustrial extends Maquina {
    
    public RoboIndustrial(int codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println("Robô Industrial: Realizando operação de montagem das peças.");
    }
}