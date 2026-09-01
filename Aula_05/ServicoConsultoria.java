package Aula_05;

public class ServicoConsultoria extends Servico{

    public ServicoConsultoria(String nome){
        super(nome,"Consultoria");
    }

    @Override
    public void executar(){
        System.out.println("Executando consultoria do cliente" +getNome());
    
    
    
    }
    
}
