package controlelista;

public class Cliente {

    /**
     * O atributo nome, do tipo String, e utilizado para indentificar o nome do cliente
     */
    private String nome;


    /**
     * Atributo cpf, do tipo long é utlizado para identificar o cpf do cliente
     */
    private long cpf;


    /**
     * Atributo numeroCarteiraMotorista, do tipo int é utilizado para identificar o numero da carteira de motorista do cliente
     */
    private int numeroCarteiraMotorista;


    /**
     * Atributo endereco, do tipo String é utilizado para identificar o endereço do cliente
     */
    private String endereco;
    

    /**
     * Atributo telefone, do tipo long é utilizado para identificar o telefone do cliente
     */
    private long telefone;

    

    /**
     * Construtor default da classe <b>Cliente</b>.<br>
     * <b>Uso: </b>
     * Cliente cliente = new Cliente(99999999999, "Fulano", 123123, "Travessa das castanheiras", "5599786354");<br><br>
     * @param cpf long que identifica um novo cliente
     * @param nome string que identifica um novo cliente
     * @param numeroCarteiraMotorista int que identifica um novo cliente
     * @param endereco string que identifica um novo cliente
     * @param telefone long que identifica um novo cliente
     */
    public Cliente(long cpf, String nome, int numeroCarteiraMotorista, String endereco, long telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCarteiraMotorista = numeroCarteiraMotorista;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    /**
     * Construtor apenas com o cpf do cliente
     * <b>Uso: </b>
     * Cliente cliente = new Cliente(99999999999);<br><br>
     * @param cpf long que identifica um novo cliente
     */
    public Cliente(long cpf) {
        this(cpf, "", 0, "", 0);
    }

    
    /** 
     * Captura uma String com o nome do cliente
     * @return String com o nome do cliente
     */
    public String getNome() { 
        return nome; 
    }

    
    /** 
     * Captura uma String com o cpf do cliente
     * @return cpf do tipo long do cliente
     */
    public long getCpf() { 
        return cpf; 
    }

    
    /** 
     * Captura um int com o número da carteira de motorista do cliente
     * @return int com o número da carteira de motorita do cliente
     */
    public int getNumeroCarteiraMotorista() { 
        return numeroCarteiraMotorista; 
    }

    
    /** 
     * Captura uma String com o endereço do cliente
     * @return String com o endereço do cliente
     */
    public String getEndereco() { 
        return endereco; 
    }

    
    /** 
     * Captura um long com o telefone do cliente
     * @return long com o telefone do cliente
     */
    public long getTelefone() { 
        return telefone; 
    }

    
    /** 
     * Captura uma String com as informações resumidas do cliente, nome e cpf
     * @return String com o nome e cpf do cliente
     */
    public String getResumo() {
        return "Nome: " + nome + " CPF: " + cpf;
    }

    
    /** 
     * @param nome String que identifica o nome do cliente
     */
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    
    /** 
     * @param numeroCarteiraMotorista int que identifica a carteira de motorista do cliente
     */
    public void setNumeroCarteira(int numeroCarteiraMotorista) { 
        this.numeroCarteiraMotorista = numeroCarteiraMotorista; 
    }

    
    /** 
     * @param endereco String que identifica o endereço do cliente
     */
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }

    
    /** 
     * @param telefone long que identifica o telefone do cliente
     */
    public void setTelefone(long telefone) { 
        this.telefone = telefone; 
    }

    
    /** 
     * @return String com os dados completos do cliente
     */
    public String toString() {
        return "Nome: " + nome + 
               "; CPF: " + cpf + 
               "; Endereço: " + endereco + 
               "; Carteira de Motorista: " + numeroCarteiraMotorista + 
               "; Telefone: " + telefone;
    }

}