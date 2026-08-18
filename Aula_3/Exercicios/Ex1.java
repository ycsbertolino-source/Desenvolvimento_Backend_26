package Aula_3.Exercicios;


    import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // Cria o Scanner para ler o que for digitado no terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome ao usuário
        System.out.print("Digite o seu nome: ");
        
        // Lê o texto digitado e guarda na variável 'nome'
        String nome = scanner.nextLine();

        // Exibe o nome digitado no terminal
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}

