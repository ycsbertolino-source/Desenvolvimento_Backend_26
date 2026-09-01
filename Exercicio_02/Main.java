package Exercicio_02;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos utilizando referência do tipo Funcionario
        Funcionario op = new Operador("Carlos Silva", "OP1029", 2500.0, 10.0, 50.0);
        Funcionario sup = new Supervisor("Ana Costa", "SUP3048", 5000.0, 1500.0);

        System.out.println("--- Dados do Operador ---");
        op.exibirDados();
        System.out.println("Salário Calculado: R$ " + op.calcularSalario());

        System.out.println("\n--- Dados do Supervisor ---");
        sup.exibirDados();
        System.out.println("Salário Calculado: R$ " + sup.calcularSalario());
    }
}