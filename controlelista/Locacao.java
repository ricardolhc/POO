package controlelista;

import java.util.Calendar;
import veiculo.Veiculo;

public class Locacao {

    private static int codigoUnico = 1;

    private int codigo;
    private boolean seguro;
    private Calendar dataInicial;
    private Calendar dataFinal;
    private Cliente cliente;
    private Veiculo veiculo;

    public Locacao(boolean seguro, Calendar dataInicial, Calendar dataFinal, Cliente cliente, Veiculo veiculo) {
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.codigo = codigoUnico++;
    }

    public int getCodigo() { return codigo; }

    public boolean getSeguro() { return seguro; }

    public Calendar getDatainicial() { return dataInicial; }

    public Calendar getDatafinal() { return dataFinal; }

    public Cliente getCliente() { return cliente; }

    public Veiculo getVeiculo() { return veiculo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public void setSeguro(boolean seguro) { this.seguro = seguro; }

    public void setDataInicial(Calendar dataInicial) { this.dataInicial = dataInicial; }

    public void setDataFinal(Calendar dataFinal) { this.dataFinal = dataFinal; } 

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

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