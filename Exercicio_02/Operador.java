package Exercicio_02;

public class Operador extends Funcionario {
    private double horasExtras;
    private double valorHoraExtra;

    public Operador(String nome, String matricula, double salarioBase, double horasExtras, double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * valorHoraExtra);
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // Aproveita a exibição da superclasse
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Valor da Hora Extra: R$ " + valorHoraExtra);
    }
}    

