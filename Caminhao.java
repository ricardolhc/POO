public class Caminhao extends Veiculo {

    private int numeroEixos;
    private int cargaMaxima;

    Caminhao(int numeroEixos, int cargaMaxima, String placa, int ano, double diaria){
        super(placa, ano, diaria);
        this.numeroEixos = numeroEixos;
        this.cargaMaxima = cargaMaxima;
    }

    public int getNeixos() { return numeroEixos; }

    public int getCargamaxima() { return cargaMaxima; }
    
}