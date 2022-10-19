public class Carro extends Veiculo {

    private int numeroPassageiros;
    private int numeroPortas;
    private double mediaKM;
    private boolean arcondicionado;

    Carro (int numeroPassageiros, int numeroPortas, double mediaKM, boolean arcondicionado, String placa, int ano, double diaria){
        super(placa, ano, diaria);
        this.numeroPassageiros = numeroPassageiros;
        this.numeroPortas = numeroPortas;
        this.mediaKM = mediaKM;
        this.arcondicionado = arcondicionado;
    }
    
    public int getNumeroPassageiros() { return numeroPassageiros; }

    public int getNumeroPortas() { return numeroPortas; }

    public double getMediakm() { return mediaKM; }

    public boolean getArcondicionado() { return arcondicionado; }

}