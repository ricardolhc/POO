import java.util.ArrayList;

public class ListaClientes implements IClientes {

    ArrayList<Cliente> clientes;

    ListaClientes() {
        clientes = new ArrayList<Cliente>();
    }

    @Override
    public void add(Cliente c) {
        clientes.add(c);
    }

    @Override   
    public Cliente get(long CPF) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInfo(long CPF) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getResumoInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(long CPF) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean existe(long CPF) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
