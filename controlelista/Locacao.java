package controlelista;

import java.util.Calendar;

public class Locacao {

    private static int codigoUnico = 1;

    private int codigo;
    private boolean seguro;
    private Calendar dataInicial;
    private Calendar dataFinal;

    public Locacao(boolean seguro, Calendar dataInicial, Calendar dataFinal) {
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.codigo = codigoUnico++;
    }

    public int getCodigo() { return codigo; }

    public boolean getSeguro() { return seguro; }

    public Calendar getDatainicial() { return dataInicial; }

    public Calendar getDatafinal() { return dataFinal; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public void setSeguro(boolean seguro) { this.seguro = seguro; }

    public void setDataInicial(Calendar dataInicial) { this.dataInicial = dataInicial; }

    public void setDataFinal(Calendar dataFinal) { this.dataFinal = dataFinal; } 

    public String toString() {
        return "Codigo: " + codigo + 
               " Seguro: " + seguro + 
               " Data inicial: " + dataInicial + 
               " Data final: " + dataFinal;
    }

}