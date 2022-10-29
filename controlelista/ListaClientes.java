package controlelista;

import java.util.ArrayList;

public class ListaClientes implements IClientes {

    private ArrayList<Cliente> clientes;

    public ListaClientes() {
        clientes = new ArrayList<Cliente>();
    }

    @Override
    public void add(Cliente c) {
        clientes.add(c);
    }

    @Override   
    public Cliente get(long CPF) {
        for(int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCpf() == CPF) {
                return clientes.get(i);
            }
        }
        return null;
    }

    @Override
    public String getInfo(long CPF) {
        if(existe(CPF)) {
            Cliente cliente = get(CPF);
            return cliente.toString(); 
        }
        return null;
    }

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

    @Override
    public boolean remove(long CPF) {
        if(existe(CPF)) {
            Cliente cliente = get(CPF);
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    @Override
    public boolean existe(long CPF) {
        Cliente cliente = get(CPF);
        if(cliente != null) {
            return true;
        }
        return false;
    }

    public void setNome(long CPF, String nome) {
        Cliente cliente = get(CPF);
        cliente.setNome(nome);
    }

    public void setNumeroCarteira(long CPF, int numeroCarteiraMotorista) {
        Cliente cliente = get(CPF);
        cliente.setNumeroCarteira(numeroCarteiraMotorista);
    }

    public void setEndereco(long CPF, String endereco) {
        Cliente cliente = get(CPF);
        cliente.setEndereco(endereco);
    }

    public void setTelefone(long CPF, long telefone) {
        Cliente cliente = get(CPF);
        cliente.setTelefone(telefone);
    }
    
}