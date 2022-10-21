package controlelista;

import java.util.ArrayList;
import veiculo.Veiculo;

public class ListaVeiculos implements IVeiculos {

    private ArrayList<Veiculo> veiculos;

    public ListaVeiculos() {
        veiculos = new ArrayList<Veiculo>();
    }

    @Override
    public void add(Veiculo v) {
        veiculos.add(v);
    }

    @Override
    public Veiculo get(String placa) {
        for(int i = 0; i < veiculos.size(); i++) {
            if(veiculos.get(i).getPlaca() == placa) {
                return veiculos.get(i);
            }
        }
        return null;
    }

    @Override
    public String getInfo(String placa) {
        if(existe(placa)) {
            Veiculo veiculo = get(placa);
            return veiculo.toString();
        }
        return null;
    }

    @Override
    public String getInfo() {
        if(veiculos.size() >= 1) {
            String conteudo = "";
            for(Veiculo veiculo : veiculos) {
                conteudo += veiculo.toString() + "\n";
            }
            return conteudo;
        }
        return null;
    }

    @Override
    public String getResumoInfo() {
        if(veiculos.size() >= 1) {
            String conteudo = "";
            for(Veiculo veiculo : veiculos) {
                conteudo += veiculo.getResumo() + "\n";
            }
            return conteudo;
        }
        return null;
    }

    @Override
    public boolean remove(String placa) {
        if(existe(placa)) {
            Veiculo veiculo = get(placa);
            veiculos.remove(veiculo);
        }
        return false;
    }

    @Override
    public boolean existe(String placa) {
        Veiculo veiculo = get(placa);
        if(veiculo != null) {
            return true;
        }
        return false;
    }
    
}