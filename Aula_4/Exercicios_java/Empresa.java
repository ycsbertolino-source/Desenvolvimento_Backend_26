public class Empresa {
    
    // Atributos
    private String codigo;
    private String razaoSocial;
    private int numeroFuncionarios;

    // Construtor
    public Empresa(String codigo, String razaoSocial, int numeroFuncionarios) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        setNumeroFuncionarios(numeroFuncionarios); // Usa a validação no momento da criação
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    // Setter com a regra de validação
    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (numeroFuncionarios >= 0) {
            this.numeroFuncionarios = numeroFuncionarios;
        } else {
            System.out.println("Erro: O numero de funcionarios nao pode ser negativo.");
        }
    }

    // --- MAIN (Ponto de entrada para rodar os testes do slide) ---
    public static void main(String[] args) {
        
        // 1. Criando a empresa conforme o exercício
        Empresa empresa = new Empresa(
            "EMP-001",
            "Tech Solutions Ltda",
            50
        );
        
        System.out.println("Empresa " + empresa.getRazaoSocial() + " criada com sucesso!");
        System.out.println("Numero inicial de funcionarios: " + empresa.getNumeroFuncionarios());

        System.out.println("\n--- Testando a validacao de erro ---");
        
        // 2. Testando passar um número negativo (deve barrar e mostrar a mensagem)
        empresa.setNumeroFuncionarios(-10);
    }
}