/**
 * A classe ListaVeiculos modela uma lista de veiculos.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package controlelista;

import java.util.ArrayList;
import veiculo.*;

public class ListaVeiculos implements IVeiculos {


    /**
     * Arraylist do tipo Veiculo para armazenar os veiculos
     */
    private ArrayList<Veiculo> veiculos;

    
    /**
     * Construtor default da classe
     */
    public ListaVeiculos() {
        veiculos = new ArrayList<Veiculo>();
    }

    
    /** 
     * @param v do tipo Veiculo que adiciona o veiculo no arraylist
     */
    @Override
    public void add(Veiculo v) {
        veiculos.add(v);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @return Veiculo que tem a placa informada
     */
    @Override
    public Veiculo get(String placa) {
        for(Veiculo veiculo : veiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        throw new NullPointerException("Veiculo não encontrado!");
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @return String com as informações do veiculo
     */
    @Override
    public String getInfo(String placa) {
        try {
            return get(placa).toString();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    
    /** 
     * @return String com as informações de todos os veiculos
     */
    @Override
    public String getInfo() {
        if(veiculos.size() > 0) {
            String conteudo = "";
            for(Veiculo veiculo : veiculos) {
                conteudo += veiculo.toString() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Não existem veiculos cadastrados");
    }

    
    /** 
     * @return String com o resumo dos veículos
     */
    @Override
    public String getResumoInfo() {
        if(veiculos.size() > 0) {
            String conteudo = "";
            for(Veiculo veiculo : veiculos) {
                conteudo += veiculo.getResumo() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Não existem veiculos cadastrados");
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @return boolean que indica se a remoção foi bem sucedida
     */
    @Override
    public boolean remove(String placa) {
        try {
            veiculos.remove(get(placa));
            return true;
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @return boolean que indica se o veiculo existe
     */
    @Override
    public boolean existe(String placa) {
        try {
            get(placa);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param ano do tipo int que é usado para alterar o ano do veiculo
     */
    public void setAno(String placa, int ano) {
        get(placa).setAno(ano);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param diaria do tipo double que é usado para alterar o valor da diaria do veiculo
     */
    public void setDiaria(String placa, double diaria){
        get(placa).setDiaria(diaria);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param numeroPortas do tipo int que é usado para alterar o numero de portas do veiculo
     */
    public void setNumeroPortaCarro(String placa, int numeroPortas) {
        Carro carro = (Carro) get(placa);
        carro.setNumeroPortas(numeroPortas);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param numeroPassageiros do tipo int que é usado para alterar o numero de passageiros do veiculo
     */
    public void setNumeroPassageiroCarro(String placa, int numeroPassageiros) {
        Carro carro = (Carro) get(placa);
        carro.setNumeroPassageiros(numeroPassageiros);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param mediaKM do tipo double que é usado para alterar a media de KM do veiculo
     */
    public void setMediaKMCarro(String placa, double mediaKM) {
        Carro carro = (Carro) get(placa);
        carro.setmediaKM(mediaKM);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param arcondicionado do tipo boolean que é usado para alterar o ar condicionado do veiculo
     */
    public void setArcondicionadoCarro(String placa, boolean arcondicionado) {
        Carro carro = (Carro) get(placa);
        carro.setArcondicionado(arcondicionado);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param numeroPassageiros do tipo int que é usado para alterar o numero de passageiros do veiculo
     */
    public void setNumeroPassageiroOnibus(String placa, int numeroPassageiros) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setNumeroPassageiros(numeroPassageiros);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param categoria do tipo String que é usado para alterar a categoria do veiculo
     */
    public void setCategoriaOnibus(String placa, Categoria categoria) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setCategoria(categoria);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param wifi do tipo boolean que é usado para alterar o wifi do veiculo
     */
    public void setWifiOnibus(String placa, boolean wifi) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setWifi(wifi);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param arcondicionado do tipo boolean que é usado para alterar o ar condicionado do veiculo
     */
    public void setArcondicionadoOnibus(String placa, boolean arcondicionado) {
        Onibus onibus = (Onibus) get(placa);
        onibus.setArcondicionado(arcondicionado);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param numeroEixos do tipo int que é usado para alterar o numero de eixos do veiculo
     */
    public void setNumeroEixoCaminhao(String placa, int numeroEixos){
        Caminhao caminhao = (Caminhao) get(placa);
        caminhao.setNumeroEixos(numeroEixos);
    }

    
    /** 
     * @param placa do tipo String que é usado para procurar o veiculo
     * @param cargamaxima do tipo double que é usado para alterar a carga maxima do veiculo
     */
    public void setCargaMaximaCaminhao(String placa, int cargamaxima){
        Caminhao caminhao = (Caminhao) get(placa);
        caminhao.setCargamaxima(cargamaxima);
    }
    
}