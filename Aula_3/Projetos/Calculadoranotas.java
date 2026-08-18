package Aula_3.Projetos;
// Exemplo classe calculadora de notas

public class Calculadoranotas {
    //criando o primeiro metodo 
     
    public static double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2)/2;
    }
//cria metodo para verificar a situação do aluno
    public static String verificarSituacao(double media){
        if (media >= 7){
            return "Aprovado";
        }
        else if(media >= 5){
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
    }
    //cria metodo para exibir o resultado
    public static void exibirResultado(String nome, double media, String situacao){
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }

 // Cria o metodo void main
    public static void main(String[] args){
        String nome = "Mariana ";
        double nota1 = 9.0;
        double nota2 = 0.5;
        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);
        exibirResultado(nome, media, situacao);
    }
}



