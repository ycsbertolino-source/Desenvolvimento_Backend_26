package Aula_3.Exercicios;

import java.util.Scanner;

//Criando  Verificação de maioridade
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade ao usuário
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Lógica de verificação
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        scanner.close();
    }

    

}
