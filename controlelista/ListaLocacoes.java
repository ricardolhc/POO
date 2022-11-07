/**
 * A classe ListaLocacoes é responsável por armazenar as locações de um cliente.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package controlelista;

import java.util.ArrayList;

public class ListaLocacoes implements ILocacoes {

    /**
     * Arraylist do tipo Locacao para armazenar as locações
     */
    private ArrayList<Locacao> locacoes;


    /**
     * Construtor default da classe ListaLocacoes<br>
     */
    public ListaLocacoes() {
        locacoes = new ArrayList<Locacao>();
    }

    
    /** 
     * @param l do tipo Locacao que adiciona a locacao no arraylist
     */
    @Override
    public void add(Locacao l) {
        locacoes.add(l);
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return Locacao que tem o codigo informado
     */
    @Override
    public Locacao get(int codigo) {
        for(int i = 0; i < locacoes.size(); i++) {
            if(locacoes.get(i).getCodigo() == codigo) {
                return locacoes.get(i);
            }
        }
        return null;
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return String com as informações da locacao
     */
    @Override
    public String getInfo(int codigo) {
        if(existe(codigo)) {
            Locacao locacao = get(codigo);
            return locacao.toString();
        }
        return null;
    }

    
    /** 
     * @return String com as informações de todas as locacoes
     */
    @Override
    public String getInfo() {
        if(locacoes.size() >= 1) {
            String conteudo = "";
            for(Locacao locacao : locacoes) {
                conteudo += locacao.toString() + "\n";
            }
            return conteudo;
        }
        return null;
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return boolean se a remoção foi feita com sucesso
     */
    @Override
    public boolean remove(int codigo) {
        if(existe(codigo)) {
            Locacao locacao = get(codigo);
            locacoes.remove(locacao);
            return true;
        }
        return false;
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return boolean se a locacao existe
     */
    @Override
    public boolean existe(int codigo) {
        Locacao locacao = get(codigo);
        if(locacao != null) {
            return true;
        }
        return false;
    }

}