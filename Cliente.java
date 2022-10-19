public class Cliente {

    private String nome;
    private String cpf;
    private int numeroCarteiraMotorista;
    private String endereco;
    private int telefone;

    Cliente(String nome, String cpf, int numeroCarteiraMotorista, String endereco, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCarteiraMotorista = numeroCarteiraMotorista;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome(){ return nome; }

    public String getCpf() { return cpf; }

    public int getNumeroCarteiraMotorista() { return numeroCarteiraMotorista; }

    public String getEndereco() { return endereco; }

    public int getTelefone() { return telefone; }
    

    public void setNome(String nome) { this.nome=nome; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public void setNcarteira(int numeroCarteiraMotorista) { this.numeroCarteiraMotorista = numeroCarteiraMotorista; }

    public void setEndereco(String endereco) { this.endereco=endereco; }

    public void setTelefone(int telefone) { this.telefone=telefone; }

}