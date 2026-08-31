package Aula_05;
// Cria a classe consultor herdando os parametros e metodos da classe mae pessoa

public  class Consultor extends Pessoa {
    private String matricula;// Deixa a variavel matricula privado
    public Consultor(String nome, String matricula){
        super(nome);
        this.matricula = matricula;
    }
    public String getMatricula(){
    return matricula;
    
        
    }
}
