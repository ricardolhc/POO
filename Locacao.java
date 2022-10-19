public abstract class Locacao extends Veiculo{

    private static int codigoUnico = 1;

    private int codigo;
    private boolean seguro;
    private String dataInicial;
    private String dataFinal;

    Locacao(boolean seguro, String dataInicial, String dataFinal, String placa, int ano, double diaria){
        super(placa, ano, diaria);
        this.codigo = codigoUnico++;
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public int getCodigo() { return codigo; }

    public boolean getSeguro() { return seguro; }

    public String getDatainicial() { return dataInicial; }

    public String getDatafinal() { return dataFinal; }

}