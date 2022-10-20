public class Caminhao extends Veiculo {

    private int numeroEixos;
    private int cargaMaxima;

    public Caminhao(int numeroEixos, int cargaMaxima, String placa, int ano, double diaria){
        super(placa, ano, diaria);
        this.numeroEixos = numeroEixos;
        this.cargaMaxima = cargaMaxima;
    }

    public int getNeixos() { return numeroEixos; }

    public int getCargamaxima() { return cargaMaxima; }

    public void setNumeroEixos(int numeroEixos) { this.numeroEixos = numeroEixos; }

    public void setCargamaxima(int cargaMaxima) { this.cargaMaxima = cargaMaxima; }

    public String toString() {
        return super.toString() + " Numero de Eixos: " + numeroEixos + " Carga maxima: " + cargaMaxima;
    }
    
}