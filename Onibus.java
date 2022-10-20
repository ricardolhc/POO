public class Onibus extends Veiculo {

    private int numeroPassageiros;
    private String categoria;
    private boolean wifi;
    private boolean arcondicionado;

    public Onibus(int numeroPassageiros, String categoria, boolean wifi, boolean arcondicionado, String placa, int ano, double diaria){
        super(placa, ano, diaria);
        this.numeroPassageiros = numeroPassageiros;
        this.categoria = categoria;
        this.wifi = wifi;
        this.arcondicionado = arcondicionado;
    }

    public int getNumeroPassageiros() { return numeroPassageiros; }

    public String getCategoria() { return categoria; }

    public boolean getWifi() { return wifi; }

    public boolean getArcondicionado() { return arcondicionado; }

    public void setNumeroPassageiro(int numeroPassageiros){this.numeroPassageiros = numeroPassageiros; }

    public void setCategorias(String categoria){this.categoria = categoria;}

    public void setWifi(boolean wifi){this.wifi = wifi;}

    public void setArcondicionado(boolean arcondicionado){this.arcondicionado = arcondicionado;}

}