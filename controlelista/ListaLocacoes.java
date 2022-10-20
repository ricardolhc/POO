package controlelista;
import java.util.ArrayList;

public class ListaLocacoes implements ILocacoes {

    private ArrayList<Locacao> locacoes;

    public ListaLocacoes() {
        locacoes = new ArrayList<Locacao>();
    }

    @Override
    public void add(Locacao l) {
        locacoes.add(l);
    }

    @Override
    public Locacao get(int codigo) {
        for(int i = 0; i < locacoes.size(); i++) {
            if(locacoes.get(i).getCodigo() == codigo) {
                return locacoes.get(i);
            }
        }
        return null;
    }

    @Override
    public String getInfo(int codigo) {
        if(existe(codigo)) {
            Locacao locacao = get(codigo);
            return locacao.toString();
        }
        return null;
    }

    @Override
    public String getInfo() {
        if(locacoes.size() >= 1) {
            String conteudo = "";
            for(int i = 0; i < locacoes.size(); i++) {
                conteudo += locacoes.get(i).toString() + "\n";
            }
            return conteudo;
        }
        return null;
    }

    @Override
    public boolean remove(int codigo) {
        if(existe(codigo)) {
            Locacao locacao = get(codigo);
            locacoes.remove(locacao);
            return true;
        }
        return false;
    }

    @Override
    public boolean existe(int codigo) {
        Locacao locacao = get(codigo);
        if(locacao != null) {
            return true;
        }
        return false;
    }
    
}