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
        return "Codigo: " + codigo + 
               " Seguro: " + seguro + 
               " Data inicial: " + dataInicial.get(Calendar.DAY_OF_MONTH) + "/" + dataInicial.get(Calendar.MONTH) + "/" + dataInicial.get(Calendar.YEAR) +
               " Data final: " + dataFinal.get(Calendar.DAY_OF_MONTH) + "/" + dataFinal.get(Calendar.MONTH) + "/" + dataFinal.get(Calendar.YEAR) +
               " Veiculo: " + veiculo.getResumo() +
               " Cliente: " + cliente.getResumo();
    }

}