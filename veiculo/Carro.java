package veiculo;

public class Carro extends Veiculo {

    private int numeroPassageiros;
    private int numeroPortas;
    private double mediaKM;
    private boolean arcondicionado;

    public Carro (String placa, int ano, double diaria, int numeroPassageiros, int numeroPortas, double mediaKM, boolean arcondicionado){
        super(placa, ano, diaria);
        this.numeroPassageiros = numeroPassageiros;
        this.numeroPortas = numeroPortas;
        this.mediaKM = mediaKM;
        this.arcondicionado = arcondicionado;
    }

    public Carro(String placa) {
        this(placa, 0, 0, 0, 0, 0, false);
    }
    
    public int getNumeroPassageiros() { return numeroPassageiros; }

    public int getNumeroPortas() { return numeroPortas; }

    public double getMediakm() { return mediaKM; }

    public boolean getArcondicionado() { return arcondicionado; }

    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }

    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public void setmediaKM(double mediaKM) { this.mediaKM = mediaKM; }
    
    public void setArcondicionado(boolean arcondicionado) { this.arcondicionado = arcondicionado; }

    public String toString() {
        return super.toString() + " Numero de Passageiros: " + numeroPassageiros + 
        " Numero Portas: " + numeroPortas + 
        " Media km: " + mediaKM + 
        " Ar-Condicionado: " + arcondicionado;
    }

}