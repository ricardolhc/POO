public enum Categoria {
    
    LEITO("Leito"), EXECUTIVO("Executivo"), CONVENCIONAL("Convencional");

    private String categoria;

    private Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
}