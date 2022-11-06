package controlelista;

import java.util.ArrayList;

public class ListaClientes implements IClientes {


    /**
     * Arraylist do tipo cliente para armazenar clientes
     */
    private ArrayList<Cliente> clientes;

    /**
     * Construtor default da classe
     */
    public ListaClientes() {
        clientes = new ArrayList<Cliente>();
    }

    
    /** 
     * Adiciona um cliente no arraylist de clientes 
     * @param c parâmetro necesário para adicionar o cliente
     */
    @Override
    public void add(Cliente c) {
        clientes.add(c);
    }

    
    /** 
     * Procura na arraylist de clientes se o cpf existe
     * @param CPF cpf do cliente a ser procurado
     * @return O cliente que tem o cpf informado
     */
    @Override   
    public Cliente get(long CPF) {
        for(int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCpf() == CPF) {
                return clientes.get(i);
            }
        }
        return null;
    }

    
    /** 
     * @param CPF cpf do cliente usado para procurar as informações
     * @return String com as informações do cliente
     */
    @Override
    public String getInfo(long CPF) {
        if(existe(CPF)) {
            Cliente cliente = get(CPF);
            return cliente.toString(); 
        }
        return null;
    }

    
    /** 
     * @return String com todas as informações dos clientes
     */
    @Override
    public String getInfo() {
        if(clientes.size() >= 1) {
            String conteudo = "";
            for(Cliente cliente : clientes) {
                conteudo += cliente.toString() + "\n";
            }
            return conteudo;
        }
        return null;
    }

    
    /** 
     * @return String com as informações resumidas dos clientes
     */
    @Override
    public String getResumoInfo() {
        if(clientes.size() >= 1) {
            String conteudo = "";
            for(Cliente cliente : clientes) {
                conteudo += cliente.getResumo() + "\n";
            }
            return conteudo;
        }
        return null;
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @return boolean se o cliente foi removido do sistema ou não
     */
    @Override
    public boolean remove(long CPF) {
        if(existe(CPF)) {
            Cliente cliente = get(CPF);
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @return boolean se o cliente existe ou não
     */
    @Override
    public boolean existe(long CPF) {
        Cliente cliente = get(CPF);
        if(cliente != null) {
            return true;
        }
        return false;
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @param nome String que identifica o cliente
     */
    public void setNome(long CPF, String nome) {
        Cliente cliente = get(CPF);
        cliente.setNome(nome);
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @param numeroCarteiraMotorista int que identifica o número da carteira de motorista do cliente
     */
    public void setNumeroCarteira(long CPF, int numeroCarteiraMotorista) {
        Cliente cliente = get(CPF);
        cliente.setNumeroCarteira(numeroCarteiraMotorista);
    }

    
    /** 
     * @param CPF long utlizado para identificar o cliente
     * @param endereco String que identifica o endereço do cliente
     */
    public void setEndereco(long CPF, String endereco) {
        Cliente cliente = get(CPF);
        cliente.setEndereco(endereco);
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @param telefone int que identifica o telefone do cliente
     */
    public void setTelefone(long CPF, long telefone) {
        Cliente cliente = get(CPF);
        cliente.setTelefone(telefone);
    }
    
}