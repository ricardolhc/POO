package veiculo;

public class Caminhao extends Veiculo {

    private int numeroEixos;
    private int cargaMaxima;

    public Caminhao(String placa, int numeroEixos, int cargaMaxima, int ano, double diaria){
        super(placa, ano, diaria);
        this.numeroEixos = numeroEixos;
        this.cargaMaxima = cargaMaxima;
    }

    public Caminhao(String placa) {
        this(placa, 0, 0, 0, 0.0);
    }

    public int getNeixos() { return numeroEixos; }

    public int getCargamaxima() { return cargaMaxima; }

    public void setNumeroEixos(int numeroEixos) { this.numeroEixos = numeroEixos; }

    public void setCargamaxima(int cargaMaxima) { this.cargaMaxima = cargaMaxima; }

    public String toString() {
        return super.toString() + " Numero de Eixos: " + numeroEixos + 
                                  " Carga maxima: " + cargaMaxima;
    }
    
}