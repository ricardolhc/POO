public class Locacao extends Veiculo {

    private static int codigoUnico = 1;

    private int codigo;
    private boolean seguro;
    private String dataInicial;
    private String dataFinal;


    public Locacao(boolean seguro, String dataInicial, String dataFinal, String placa, int ano, double diaria){
        super(placa, ano, diaria);
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.codigo = codigoUnico++;
    }

    public int getCodigo() { return codigo; }

    public boolean getSeguro() { return seguro; }

    public String getDatainicial() { return dataInicial; }

    public String getDatafinal() { return dataFinal; }

    public void setCodigo(int codigo){this.codigo = codigo;}

    public void setSeguro(boolean seguro){this.seguro = seguro;}

    public void setDataInicial(String dataInicial){this.dataInicial = dataInicial;}

    public void setDataFinal(String dataFinal){this.dataFinal = dataFinal;} 

}