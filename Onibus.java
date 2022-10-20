public class Onibus extends Veiculo {

    private int numeroPassageiros;
    private Categoria categoria;
    private boolean wifi;
    private boolean arcondicionado;

    public Onibus(String placa, int ano, double diaria, int numeroPassageiros, Categoria categoria, boolean wifi, boolean arcondicionado) {
        super(placa, ano, diaria);
        this.numeroPassageiros = numeroPassageiros;
        this.categoria = categoria;
        this.wifi = wifi;
        this.arcondicionado = arcondicionado;
    }

    public Onibus(String placa) { 
        this(placa, 0, 0.0, 0, Categoria.CONVENCIONAL, false, false);
    }

    public int getNumeroPassageiros() { return numeroPassageiros; }

    public Categoria getCategoria() { return categoria; }

    public boolean getWifi() { return wifi; }

    public boolean getArcondicionado() { return arcondicionado; }

    public void setNumeroPassageiro(int numeroPassageiros){ this.numeroPassageiros = numeroPassageiros; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public void setWifi(boolean wifi) { this.wifi = wifi; }

    public void setArcondicionado(boolean arcondicionado) { this.arcondicionado = arcondicionado; }

    public String toString() {
        return super.toString() + " Numero de Passageiros: " + numeroPassageiros + 
                                  " Categoria: " + categoria + 
                                  " Wifi: " + wifi + 
                                  " Ar-Condicionado: " + arcondicionado;
    }

}