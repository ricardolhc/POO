/**
 * A classe Locacao modela uma locacao do sistema.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package controlelista;

import java.util.Calendar;
import veiculo.Veiculo;

public class Locacao {

    /**
     * O atributo codigoUnico, do tipo int, e utilizado para indentificar o codigo unico da locacao
     */
    private static int codigoUnico = 1;

    /**
     * O atributo codigo, do tipo int, e utilizado para indentificar o codigo da locacao
     */
    private int codigo;

    /**
     * O atributo seguro, do tipo boolean, e utilizado para indentificar se a locacao tem seguro
     */
    private boolean seguro;

    /**
     * O atributo dataInicial, do tipo Calendar, e utilizado para indentificar a data inicial da locacao
     */
    private Calendar dataInicial;

    /**
     * O atributo dataFinal, do tipo Calendar, e utilizado para indentificar a data final da locacao
     */
    private Calendar dataFinal;

    /**
     * O atributo cliente, do tipo Cliente, e utilizado para indentificar o cliente da locacao
     */
    private Cliente cliente;

    /**
     * O atributo veiculo, do tipo Veiculo, e utilizado para indentificar o veiculo da locacao
     */
    private Veiculo veiculo;

    /**
     * Construtor default da classe Locacao<br>
     * <b>Uso: </b>
     * Locacao locacao = new Locacao(true, Calendar.getInstance(), Calendar.getInstance(), cliente, veiculo);<br><br>
     * @param seguro boolean que identifica se a locacao tem seguro
     * @param dataInicial Calendar que identifica a data inicial da locacao
     * @param dataFinal Calendar que identifica a data final da locacao
     * @param cliente Cliente que identifica o cliente da locacao
     * @param veiculo Veiculo que identifica o veiculo da locacao
     */
    public Locacao(boolean seguro, Calendar dataInicial, Calendar dataFinal, Cliente cliente, Veiculo veiculo) {
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.codigo = codigoUnico++;
    }

    
    /** 
     * @return int que identifica o codigo da locacao
     */
    public int getCodigo() { 
        return codigo; 
    }

    
    /** 
     * @return boolean que identifica se a locacao tem seguro
     */
    public boolean getSeguro() { 
        return seguro; 
    }

    
    /** 
     * @return Calendar que identifica a data inicial da locacao
     */
    public Calendar getDataInicial() { 
        return dataInicial; 
    }

    
    /** 
     * @return Calendar que identifica a data final da locacao
     */
    public Calendar getDataFinal() { 
        return dataFinal; 
    }

    
    /** 
     * @return Cliente que identifica o cliente da locacao
     */
    public Cliente getCliente() { 
        return cliente; 
    }

    
    /** 
     * @return Veiculo que identifica o veiculo da locacao
     */
    public Veiculo getVeiculo() { 
        return veiculo; 
    }

    
    /** 
     * @param codigo int que identifica o codigo da locacao
     */
    public void setCodigo(int codigo) { 
        this.codigo = codigo; 
    }

    
    /** 
     * @param seguro boolean que identifica se a locacao tem seguro
     */
    public void setSeguro(boolean seguro) { 
        this.seguro = seguro; 
    }

    
    /** 
     * @param dataInicial Calendar que identifica a data inicial da locacao
     */
    public void setDataInicial(Calendar dataInicial) { 
        this.dataInicial = dataInicial; 
    }

    
    /** 
     * @param dataFinal Calendar que identifica a data final da locacao
     */
    public void setDataFinal(Calendar dataFinal) { 
        this.dataFinal = dataFinal; 
    } 

    
    /** 
     * @param cliente Cliente que identifica o cliente da locacao
     */
    public void setCliente(Cliente cliente) { 
        this.cliente = cliente; 
    }

    
    /** 
     * @param veiculo Veiculo que identifica o veiculo da locacao
     */
    public void setVeiculo(Veiculo veiculo) { 
        this.veiculo = veiculo; 
    }

    
    /** 
     * @return String que identifica as informacoes da locacao
     */
    public String toString() {
        String seguroStr = null;
        String menorQueDezInicialDia = "";
        String menorQueDezInicialMes = "";
        String menorQueDezFinalDia = "";
        String menorQueDezFinalMes = "";

        if(seguro) {
            seguroStr = "Sim";
        } else {
            seguroStr = "Não";
        }

        if(dataInicial.get(Calendar.DAY_OF_MONTH) < 10) {
            menorQueDezInicialDia = "0";
        }
        if((dataInicial.get(Calendar.MONTH) + 1) < 10){
            menorQueDezInicialMes = "0";
        }
        if(dataFinal.get(Calendar.DAY_OF_MONTH) < 10) {
            menorQueDezFinalDia = "0";
        }
        if((dataFinal.get(Calendar.MONTH) + 1) < 10){
            menorQueDezFinalMes = "0";
        }

        return "Codigo: " + codigo + 
               "; Seguro: " + seguroStr + 
               "; Data inicial: " + menorQueDezInicialDia + dataInicial.get(Calendar.DAY_OF_MONTH) + "/" + menorQueDezInicialMes + (dataInicial.get(Calendar.MONTH) + 1) + "/" + dataInicial.get(Calendar.YEAR) +
               "; Data final: " + menorQueDezFinalDia + dataFinal.get(Calendar.DAY_OF_MONTH) + "/" + menorQueDezFinalMes + (dataFinal.get(Calendar.MONTH) + 1) + "/" + dataFinal.get(Calendar.YEAR) +
               "; Veiculo: " + veiculo.getResumo() +
               "; Cliente: " + cliente.getResumo();
    }

}