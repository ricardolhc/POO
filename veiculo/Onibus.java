/**
 * A classe Onibus modela um onibus do sistema.
 * @author Ricardo, Tales, Mateus, Mauricio
 * @since nov 2022
 * @version 1.0
 */

package veiculo;

public class Onibus extends Veiculo {

    /**
     * O atributo numeroPassageiros, do tipo int, e utilizado para indentificar o numero de passageiros de um onibus
     */
    private int numeroPassageiros;

    /**
     * O atributo categoria, do tipo Categoria, e utilizado para indentificar a categoria de um onibus
     */
    private Categoria categoria;

    /**
     * O atributo wifi, do tipo boolean, e utilizado para indentificar se um onibus possui wifi
     */
    private boolean wifi;

    /**
     * O atributo arCondicionado, do tipo boolean, e utilizado para indentificar se um onibus possui ar condicionado
     */
    private boolean arcondicionado;

    /**
     * Construtor default da classe Onibus<br>
     * <b>Uso: </b>
     * Onibus onibus = new Onibus("ABC1234", 2010, 100.0, 5, Categoria.LEITO, true, true);<br><br>
     * @param placa String que identifica a placa do onibus
     * @param ano int que identifica o ano do onibus
     * @param diaria double que identifica a diária do onibus
     * @param numeroPassageiros int que identifica o numero de passageiros do onibus
     * @param categoria Categoria que identifica a categoria do onibus
     * @param wifi boolean que identifica se o onibus possui wifi
     * @param arcondicionado boolean que identifica se o onibus possui ar condicionado
     */
    public Onibus(String placa, int ano, double diaria, int numeroPassageiros, Categoria categoria, boolean wifi, boolean arcondicionado) {
        super(placa, ano, diaria);
        this.numeroPassageiros = numeroPassageiros;
        this.categoria = categoria;
        this.wifi = wifi;
        this.arcondicionado = arcondicionado;
    }

    /**
     * Construtor alternativo da classe Onibus<br>
     * <b>Uso: </b>
     * Onibus onibus = new Onibus("ABC1234");<br><br>
     * @param placa String que identifica a placa do onibus
     */
    public Onibus(String placa) { 
        this(placa, 0, 0.0, 0, Categoria.CONVENCIONAL, false, false);
    }

    
    /** 
     * @return int que identifica o numero de passageiros do onibus
     */
    public int getNumeroPassageiros() { 
        return numeroPassageiros; 
    }

    
    /** 
     * @return Categoria que identifica a categoria do onibus
     */
    public Categoria getCategoria() { 
        return categoria; 
    }

    
    /** 
     * @return boolean que identifica se o onibus possui wifi
     */
    public boolean getWifi() { 
        return wifi; 
    }

    
    /** 
     * @return boolean que identifica se o onibus possui ar condicionado
     */
    public boolean getArcondicionado() { 
        return arcondicionado; 
    }

    
    /** 
     * @param numeroPassageiros int que identifica o numero de passageiros do onibus
     */
    public void setNumeroPassageiros(int numeroPassageiros) { 
        this.numeroPassageiros = numeroPassageiros; 
    }

    
    /** 
     * @param categoria Categoria que identifica a categoria do onibus
     */
    public void setCategoria(Categoria categoria) { 
        this.categoria = categoria; 
    }

    
    /** 
     * @param wifi boolean que identifica se o onibus possui wifi
     */
    public void setWifi(boolean wifi) { 
        this.wifi = wifi; 
    }

    
    /** 
     * @param arcondicionado boolean que identifica se o onibus possui ar condicionado
     */
    public void setArcondicionado(boolean arcondicionado) { 
        this.arcondicionado = arcondicionado; 
    }

    
    /** 
     * @return String que identifica as informações do onibus
     */
    public String toString() {
        String arcondicionadoStr = null;
        String wifiStr = null;
        if(arcondicionado) {
            arcondicionadoStr = "Sim";
        } else {
            arcondicionadoStr = "Não";
        }
        if(wifi) {
            wifiStr = "Sim";
        } else {
            wifiStr = "Não";
        }

        return super.toString() + "; Numero de Passageiros: " + numeroPassageiros + 
                                  "; Categoria: " + categoria.getCategoria() + 
                                  "; Wifi: " + wifiStr + 
                                  "; Ar-Condicionado: " + arcondicionadoStr;
    }

}