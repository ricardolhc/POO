package menu;

public class MenuLocadora {
    
    private MenuLocacao menuLocacao;
    private MenuCliente menuCliente;
    private MenuVeiculo menuVeiculo;

    public MenuLocadora() {
        menuLocacao = new MenuLocacao();
        menuCliente = new MenuCliente();
        menuVeiculo = new MenuVeiculo();
    }

    public void adicionarLocacao() {
        menuLocacao.adicionarLocacao(menuCliente.getListaClientes(), menuVeiculo.getListaVeiculos());
    }

    public void adicionaCliente() {
        menuCliente.adicionaCliente();
    }

    public void adicionaVeiculo() {
        menuVeiculo.adicionaVeiculo();
    }

    public void getInfoVeiculo() {
        System.out.println(menuVeiculo.getInfoVeiculos());
    }


}
