package Aula_3.Exercicios;

public class Ex3 {
    // cria metodo para encontrar o maior ou se sao iguais
    public static String encontrarMaior(int num1, int num2){
        if(num1 > num2){
            return "O maior número é: " + num1;
        }
        else if(num2 > num1){
            return "O maior número é: " + num2;
        }
        else{
            return "Os números são iguais.";
        }
    }
}
