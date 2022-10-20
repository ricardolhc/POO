public abstract class Veiculo {

    private String placa;
    private int ano;
    private double diaria;

    Veiculo(String placa, int ano, double diaria){
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    Veiculo(String placa, double diaria) {
        this(placa, 0, diaria);
    }

    Veiculo(String placa, int ano) {
        this(placa, ano, 0);
    }

    Veiculo(String placa) {
        this(placa, 0, 0);
    }



    public String getPlaca() { return placa; }

    public int getAno() { return ano; }

    public double getDiaria() { return diaria; }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setDiaria(double diaria){
        this.diaria = diaria;
    }
    
    
}