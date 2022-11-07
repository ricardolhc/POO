/**
 * A classe Veiculo modela as informações mínimas de um veículo do sistema.
 * @author Ricardo, Tales, Mateus, Mauricio
 * @since nov 2022
 * @version 1.0
 */

package veiculo;

public abstract class Veiculo {

    /**
     * O atributo placa, do tipo String, e utilizado para indentificar a placa do veiculo
     */
    private String placa;

    /**
     * O atributo ano, do tipo int, e utilizado para indentificar o ano do veiculo
     */
    private int ano;

    /**
     * O atributo diaria, do tipo double, e utilizado para indentificar a diaria do veiculo
     */
    private double diaria;

    /**
     * Construtor default da classe Veiculo<br>
     * <b>Uso: </b>
     * Veiculo veiculo = new Carro("ABC1234", 2010, 100.00);<br><br>
     * @param placa String que identifica a placa do veículo
     * @param ano int que identifica o ano do veículo
     * @param diaria double que identifica a diária do veículo
     */
    public Veiculo(String placa, int ano, double diaria){
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    
    /** 
     * @return String que identifica a placa do veículo
     */
    public String getPlaca() { 
        return placa; 
    }

    
    /** 
     * @return int que identifica o ano do veículo
     */
    public int getAno() { 
        return ano; 
    }

    
    /** 
     * @return double que identifica a diária do veículo
     */
    public double getDiaria() { 
        return diaria; 
    }

    
    /** 
     * @param placa String que identifica a placa do veículo
     */
    public void setPlaca(String placa) { 
        this.placa = placa; 
    }

    
    /** 
     * @param ano int que identifica o ano do veículo
     */
    public void setAno(int ano) { 
        this.ano = ano;
    }

    
    /** 
     * @param diaria double que identifica a diária do veículo
     */
    public void setDiaria(double diaria) { 
        this.diaria = diaria; 
    }

    
    /** 
     * @return String que identifica as informações do veículo
     */
    public String toString() {
        return "Placa: " + placa + 
               "; Ano: " + ano + 
               "; Diaria: " + diaria;
    }

    
    /** 
     * @return String que identifica as informações básicas do veículo
     */
    public String getResumo() {
        return "Placa: " + placa + 
               "; Ano: " + ano + 
               "; Diaria: " + diaria;
    }

}