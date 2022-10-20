import java.util.Date;

public class Locacao {

    private static int codigoUnico = 1;

    private int codigo;
    private boolean seguro;
    private Date dataInicial;
    private Date dataFinal;

    public Locacao(boolean seguro, Date dataInicial, Date dataFinal) {
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.codigo = codigoUnico++;
    }

    public int getCodigo() { return codigo; }

    public boolean getSeguro() { return seguro; }

    public Date getDatainicial() { return dataInicial; }

    public Date getDatafinal() { return dataFinal; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public void setSeguro(boolean seguro) { this.seguro = seguro; }

    public void setDataInicial(Date dataInicial) { this.dataInicial = dataInicial; }

    public void setDataFinal(Date dataFinal) { this.dataFinal = dataFinal; } 

    public String toString() {
        return "Codigo: " + codigo + 
               " Seguro: " + seguro + 
               " Data inicial: " + dataInicial + 
               " Data final: " + dataFinal;
    }

}