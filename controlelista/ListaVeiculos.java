package controlelista;

import java.util.ArrayList;

import veiculo.*;

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
            if(veiculos.get(i).getPlaca().equals(placa)) {
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
            return true;
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

    /* SET VEICULO */

    public void setAno(String placa, int ano) {
        Veiculo veiculo = get(placa);
        veiculo.setAno(ano);
    }

    public void setDiaria(String placa, double diaria){
        Veiculo veiculo = get(placa);
        veiculo.setDiaria(diaria);
    }

    /* SET CARRO */

    public void setNumeroPortaCarro(String placa, int numeroPortas) {
        Carro carro = (Carro) get(placa);
        carro.setNumeroPortas(numeroPortas);
    }

    public void setNumeroPassageiroCarro(String placa, int numeroPassageiros) {
        Carro carro = (Carro) get(placa);
        carro.setNumeroPassageiros(numeroPassageiros);
    }

    public void setMediaKMCarro(String placa, double mediaKM) {
        Carro carro = (Carro) get(placa);
        carro.setmediaKM(mediaKM);
    }

    public void setArcondicionadoCarro(String placa, boolean arcondicionado) {
        Carro carro = (Carro) get(placa);
        carro.setArcondicionado(arcondicionado);
    }

    /* SET ONIBUS */

    public void setNumeroPassageiroOnibus(String placa, int numeroPassageiros) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setNumeroPassageiros(numeroPassageiros);
    }

    public void setCategoriaOnibus(String placa, Categoria categoria) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setCategoria(categoria);
    }

    public void setWifiOnibus(String placa, boolean wifi) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setWifi(wifi);
    }

    public void setArcondicionadoOnibus(String placa, boolean arcondicionado) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setArcondicionado(arcondicionado);
    }

    /* SET CAMINHAO */

    public void setNumeroEixoCaminhao(String placa, int numeroEixos){
        Caminhao caminhao = (Caminhao) get(placa);
        caminhao.setNumeroEixos(numeroEixos);
    }

    public void setCargaMaximaCaminhao(String placa, int cargamaxima){
        Caminhao caminhao = (Caminhao) get(placa);
        caminhao.setCargamaxima(cargamaxima);
    }
    
}