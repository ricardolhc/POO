/**
 * A classe Categoria modela as categorias de um onibus do sistema.
 * @author Ricardo, Tales, Mateus, Mauricio
 * @since nov 2022
 * @version 1.0
 */

package veiculo;

public enum Categoria {
    
    LEITO("Leito"), EXECUTIVO("Executivo"), CONVENCIONAL("Convencional");

    /**
     * O atributo categoria, do tipo String, e utilizado para indentificar a categoria do veiculo
     */
    private String categoria;

    /**
     * Construtor default da classe Categoria<br>
     * <b>Uso: </b>
     * Categoria categoria = new Categoria("Leito");<br><br>
     * @param categoria String que identifica a categoria do veículo
     */
    private Categoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return String que identifica a categoria do veículo
     */
    public String getCategoria() {
        return categoria;
    }
    
}