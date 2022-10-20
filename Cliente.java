public class Cliente {

    private String nome;
    private long cpf;
    private int numeroCarteiraMotorista;
    private String endereco;
    private int telefone;

    public Cliente(long cpf, String nome, int numeroCarteiraMotorista, String endereco, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCarteiraMotorista = numeroCarteiraMotorista;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(long cpf) {
        this(cpf, "", 0, "", 0);
    }

    public String getNome(){ return nome; }

    public long getCpf() { return cpf; }

    public int getNumeroCarteiraMotorista() { return numeroCarteiraMotorista; }

    public String getEndereco() { return endereco; }

    public int getTelefone() { return telefone; }

    public String getResumo() {
        return "CPF: " + cpf + " Nome: " + nome;
    }

    public void setNome(String nome) { this.nome=nome; }

    public void setCpf(long cpf) { this.cpf = cpf; }

    public void setNcarteira(int numeroCarteiraMotorista) { this.numeroCarteiraMotorista = numeroCarteiraMotorista; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void setTelefone(int telefone) { this.telefone = telefone; }

    public String toString() {
        return "Nome: " + nome + 
               " CPF: " + cpf + 
               " Endereço: " + endereco + 
               " Carteira de Motorista: " + numeroCarteiraMotorista + 
               " Telefone: " + telefone;
    }

}