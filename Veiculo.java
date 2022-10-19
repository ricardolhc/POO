public abstract class Veiculo {

    private String placa;
    private int ano;
    private double diaria;

    Veiculo(String placa, int ano, double diaria){
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    public String getPlaca() { return placa; }

    public int getAno() { return ano; }

    public double getDiaria() { return diaria; }
    
}