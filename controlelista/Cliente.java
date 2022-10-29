package controlelista;

public class Cliente {

    private String nome;
    private long cpf;
    private int numeroCarteiraMotorista;
    private String endereco;
    private long telefone;

    public Cliente(long cpf, String nome, int numeroCarteiraMotorista, String endereco, long telefone){
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

    public long getTelefone() { return telefone; }

    public String getResumo() {
        return "Nome: " + nome + " CPF: " + cpf;
    }

    public void setNome(String nome) { this.nome = nome; }

    public void setNumeroCarteira(int numeroCarteiraMotorista) { this.numeroCarteiraMotorista = numeroCarteiraMotorista; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void setTelefone(long telefone) { this.telefone = telefone; }

    public String toString() {
        return "Nome: " + nome + 
               "; CPF: " + cpf + 
               "; Endereço: " + endereco + 
               "; Carteira de Motorista: " + numeroCarteiraMotorista + 
               "; Telefone: " + telefone;
    }

}