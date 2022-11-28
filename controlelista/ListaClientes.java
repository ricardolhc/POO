/**
 * A classe ListaClientes representa uma lista de clientes.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

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
     * @param c parâmetro necesário para adicionar o cliente
     */
    @Override
    public void add(Cliente c) {
        clientes.add(c);
    }

    
    /** 
     * @param CPF cpf do cliente a ser procurado
     * @return O cliente que tem o cpf informado
     */
    @Override   
    public Cliente get(long CPF) {
        for(Cliente cliente : clientes) {
            if(Long.parseLong(cliente.getCpf()) == CPF) {
                return cliente;
            }
        }
        throw new NullPointerException("Cliente não encontrado");
    }

    
    /** 
     * @param CPF cpf do cliente usado para procurar as informações
     * @return String com as informações do cliente
     */
    @Override
    public String getInfo(long CPF) {
        try {
            return get(CPF).toString();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    
    /** 
     * @return String com todas as informações dos clientes
     */
    @Override
    public String getInfo() {
        if(clientes.size() > 0) {
            String conteudo = "";
            for(Cliente cliente : clientes) {
                conteudo += cliente.toString() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Não existem clientes cadastrados");
    }

    
    /** 
     * @return String com as informações resumidas dos clientes
     */
    @Override
    public String getResumoInfo() {
        if(clientes.size() > 0) {
            String conteudo = "";
            for(Cliente cliente : clientes) {
                conteudo += cliente.getResumo() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Não existem clientes cadastrados");
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @return boolean se o cliente foi removido do sistema ou não
     */
    @Override
    public boolean remove(long CPF) {
        try {
            clientes.remove(get(CPF));
            return true;
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @return boolean se o cliente existe ou não
     */
    @Override
    public boolean existe(long CPF) {
        try {
            get(CPF);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @param nome String que identifica o cliente
     */
    public void setNome(long CPF, String nome) {
        get(CPF).setNome(nome);
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @param numeroCarteiraMotorista int que identifica o número da carteira de motorista do cliente
     */
    public void setNumeroCarteira(long CPF, int numeroCarteiraMotorista) {
        get(CPF).setNumeroCarteira(numeroCarteiraMotorista);
    }

    
    /** 
     * @param CPF long utlizado para identificar o cliente
     * @param endereco String que identifica o endereço do cliente
     */
    public void setEndereco(long CPF, String endereco) {
        get(CPF).setEndereco(endereco);
    }

    
    /** 
     * @param CPF long utilizado para identificar o cliente
     * @param telefone int que identifica o telefone do cliente
     */
    public void setTelefone(long CPF, long telefone) {
        get(CPF).setTelefone(telefone);
    }
    
}