/**
 * A classe Caminhao modela um caminhao do sistema.
 * @author Ricardo, Tales, Mateus, Mauricio
 * @since nov 2022
 * @version 1.0
 */

package veiculo;

public class Caminhao extends Veiculo {

    /**
     * O atributo numeroEixos, do tipo int, e utilizado para indentificar o numero de eixos de um caminhao
     */
    private int numeroEixos;

    /**
     * O atributo cargaMaxima, do tipo double, e utilizado para indentificar a carga maxima de um caminhao
     */
    private int cargaMaxima;

    /**
     * Construtor default da classe Caminhao<br>
     * <b>Uso: </b>
     * Caminhao caminhao = new Caminhao("ABC1234", 2010, 100.00, 2, 1000);<br><br>
     * @param placa String que identifica a placa do veículo
     * @param ano int que identifica o ano do veículo
     * @param diaria double que identifica a diária do veículo
     * @param numeroEixos int que identifica o numero de eixos do caminhao
     * @param cargaMaxima int que identifica a carga maxima do caminhao
     */
    public Caminhao(String placa, int ano, double diaria, int numeroEixos, int cargaMaxima){
        super(placa, ano, diaria);
        this.numeroEixos = numeroEixos;
        this.cargaMaxima = cargaMaxima;
    }

    /**
     * Construtor alternativo da classe Caminhao<br>
     * <b>Uso: </b>
     * @param placa String que identifica a placa do veículo
     */
    public Caminhao(String placa) {
        this(placa, 0, 0.0, 0, 0);
    }

    
    /** 
     * @return int que identifica o numero de eixos do caminhão
     */
    public int getNumeroEixos() { 
        return numeroEixos; 
    }

    
    /** 
     * @return int que identifica a carga máxima do caminhão
     */
    public int getCargamaxima() { 
        return cargaMaxima; 
    }

    
    /** 
     * @param numeroEixos int que identifica o numero de eixos do caminhão
     */
    public void setNumeroEixos(int numeroEixos) { 
        this.numeroEixos = numeroEixos; 
    }

    
    /** 
     * @param cargaMaxima int que identifica a carga máxima do caminhão
     */
    public void setCargamaxima(int cargaMaxima) { 
        this.cargaMaxima = cargaMaxima; 
    }

    
    /** 
     * @return String com os dados do caminhão
     */
    public String toString() {
        return super.toString() + "; Numero de Eixos: " + numeroEixos + 
                                  "; Carga maxima: " + cargaMaxima;
    }
    
}