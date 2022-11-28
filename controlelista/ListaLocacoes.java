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
        for(Locacao locacao : locacoes) {
            if(locacao.getCodigo() == codigo) {
                return locacao;
            }
        }
        throw new NullPointerException("Locação não encontrada");
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return String com as informações da locacao
     */
    @Override
    public String getInfo(int codigo) {
        try {
            return get(codigo).toString();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    
    /** 
     * @return String com as informações de todas as locacoes
     */
    @Override
    public String getInfo() {
        if(locacoes.size() > 0) {
            String conteudo = "";
            for(Locacao locacao : locacoes) {
                conteudo += locacao.toString() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Não existem locações cadastradas");
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return boolean se a remoção foi feita com sucesso
     */
    @Override
    public boolean remove(int codigo) {
        try {
            locacoes.remove(get(codigo));
            return true;
        } catch(NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    
    /** 
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return boolean se a locacao existe
     */
    @Override
    public boolean existe(int codigo) {
        try {
            get(codigo);
            return true;
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

}