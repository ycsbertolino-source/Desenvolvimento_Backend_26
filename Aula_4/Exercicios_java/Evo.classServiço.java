class Servico {
    
    // Atributos base deduzidos do construtor + o novo atributo 'valor'
    private String codigo;
    private String nome;
    private String descricao;
    private double valor; // Novo atributo adicionado

    // Construtor alterado para receber o valor do serviço
    public Servico(String codigo, String nome, String descricao, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        setValor(valor); // Usa o setter para garantir a validação na criação
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    // --- Exercício 2: Novo getValor() ---
    public double getValor() {
        return valor;
    }

    // Setters básicos
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // --- Exercício 2: Novo setValor() com validação ---
    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Erro: O valor do servico nao pode ser negativo.");
        }
    }

    // --- MAIN (Testes solicitados no exercício) ---
    public static void main(String[] args) {
        
        System.out.println("--- Criando o servico ---");
        
        // 1. Criação no Main como o slide pede
        Servico servico = new Servico(
            "SER-010",
            "Consultoria em Tecnologia",
            "Avaliacao da infraestrutura tecnologica.",
            3500
        );
        
        System.out.println("Servico '" + servico.getNome() + "' criado com o valor de R$" + servico.getValor());

        System.out.println("\n--- Teste de Valor Invalido ---");
        // Forçando o erro (valor negativo)
        servico.setValor(-150);
        
        System.out.println("\n--- Teste de Valor Valido ---");
        // Testando um valor correto
        servico.setValor(4200);
        System.out.println("Novo valor atualizado: R$" + servico.getValor());
    }
}