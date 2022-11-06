package menu;
import java.util.Scanner;

import controlelista.ListaClientes;
import controlelista.ListaLocacoes;
import controlelista.ListaVeiculos;

public class MenuLocadora {
    
    /**
     * O atributo MenuLocacao é uma instancia da classe MenuLocacao
     */
     
    private MenuLocacao menuLocacao;
    /**
    * O atributo MenuCliente é uma instancia da classe MenuCliente 
    */

    private MenuCliente menuCliente;

    /**
    * O atributo MenuVeiculo é uma instancia da classe MenuVeiculo  
    */

    private MenuVeiculo menuVeiculo;

    /**
    * O atributo listaClientes é uma instancia da classe ListaClientes   
    */


    private ListaClientes listaClientes;

    /**
    * O atributo listaVeiculos é uma instancia da classe ListaVeiculos   
    */ 

    private ListaLocacoes listaLocacoes;

    /**
    * O atributo listaLocacoes é uma instancia da classe ListaLocacoes    
    */

    private ListaVeiculos listaVeiculos;


    /**
     * Construtor default da classe MenuLocadora<br>
     * <b>Uso: </b>
     * MenuLocadora menuLocadora = new MenuLocadora(listaClientes, listaLocacoes, listaVeiculos);<br><br>
     * @param listaClientes ListaClientes que identifica a lista de clientes
     * @param listaLocacoes ListaLocacoes que identifica a lista de locacoes
     * @param listaVeiculos ListaVeiculos que identifica a lista de veiculos
     */
    public MenuLocadora(ListaClientes listaClientes, ListaLocacoes listaLocacoes, ListaVeiculos listaVeiculos) {
        this.listaClientes = listaClientes;
        this.listaLocacoes = listaLocacoes;
        this.listaVeiculos = listaVeiculos;
        menuLocacao = new MenuLocacao(listaLocacoes, listaClientes, listaVeiculos);
        menuCliente = new MenuCliente(listaClientes);
        menuVeiculo = new MenuVeiculo(listaVeiculos);
    }

    /**
     * Método que exibe o menu principal da locadora<br>
     * <b>Uso: </b>
     * menuLocadora.exibirMenu();<br><br>
     */
    public void menu() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\n====== MENU PRINCIPAL ======");
            System.out.println("1) Menu Cliente");
            System.out.println("2) Menu Veiculo");
            System.out.println("3) Menu Locação");
            System.out.println("4) Sair");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch(escolha) {

                //Menu cliente
                case 1: 
                    menuCliente();
                    break;

                //Menu veiculo
                case 2:
                    menuVeiculo();
                    break;

                //Menu locação
                case 3:
                    menuLocacao();
                    break;

                //Sair
                case 4:
                    System.out.println("Você escolheu sair do sistema!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;

            }
        } while(escolha != 4);
    }
   
    /**
     * Método que exibe o menu de clientes<br>
     * <b>Uso: </b>
     * menuLocadora.menuCliente();<br><br>
     */
    private void menuCliente() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        
        do {
            System.out.println("\n====== MENU CLIENTE ======");
            System.out.println("1) Adicionar cliente");
            System.out.println("2) Remover cliente");
            System.out.println("3) Visualizar informações de um cliente específico");
            System.out.println("4) Visualizar informações de todos os clientes");
            System.out.println("5) Visualizar resumo das informações de todos os clientes");
            System.out.println("6) Alterar nome do cliente");
            System.out.println("7) Alterar número da carteira de motorista do cliente");
            System.out.println("8) Alterar endereço do cliente");
            System.out.println("9) Alterar telefone do cliente");
            System.out.println("10) Voltar");
            System.out.print("Opção: ");

            escolha = input.nextInt();
            
            switch(escolha) {

                //Adicionar cliente
                case 1:
                    menuCliente.adicionaCliente();
                    break;
                    
                //Remover cliente
                case 2:
                    menuCliente.removeCliente();
                    break;

                //Visualizar informações de um cliente específico 
                case 3:
                    menuCliente.getInformacaoCliente();
                    break;

                //Visualizar informações de todos os clientes 
                case 4:
                    menuCliente.getInformacoesClientes();
                    break;

                //Visualizar resumo das informações de todos os clientes 
                case 5:
                    menuCliente.getInformacoesClientesResumo();
                    break;

                //Alterar nome do cliente
                case 6:     
                    menuCliente.alteraNome();
                    break;
                    
                //Alterar número da carteira de motorista do cliente
                case 7:
                    menuCliente.alteraNumeroCarteira();
                    break;
                    
                //Alterar endereço do cliente
                case 8:
                    menuCliente.alteraEndereco();
                    break;

                //Alterar telefone do cliente
                case 9:
                    menuCliente.alteraTelefone();
                    break;

                //Sair
                case 10:
                    System.out.println("Você escolheu do menu cliente!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while(escolha != 10);
    }

    /* 
    * 
    *
    */
    
    /
    private void menuVeiculo() {
        int escolha = 0;
        Scanner input = new Scanner(System.in);
        String placa = null;

        do {
            System.out.println("\n====== MENU VEICULO ======");
            System.out.println("1) Adicionar Veículo");
            System.out.println("2) Excluir Veículo");
            System.out.println("3) Visualizar um veículo específico");
            System.out.println("4) Visualizar todos os veículos");
            System.out.println("5) Visualizar o resumo de todos os veículos");
            System.out.println("6) Editar Veículo");
            System.out.println("7) Voltar");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch (escolha) {

                //Adicionar Veículo
                case 1:
                    menuVeiculo.adicionaVeiculo();
                    break;
            
                //Excluir Veículo
                case 2:
                    menuVeiculo.removerVeiculo();
                    break;

                //Visualizar um veículo específico
                case 3: 
                    menuVeiculo.getInformacaoVeiculo();
                    break;

                //Visualizar todos os veículos
                case 4:
                    menuVeiculo.imprimirInfoVeiculos();
                    break;

                //Visualizar um reusmo de todos os veículos
                case 5:
                    menuVeiculo.imprimirResumoVeiculos();
                    break;

                //Editar carro
                case 6:
                    placa = menuVeiculo.receberPlaca();
                    selecionarMenu(placa);
                    break;

                //Voltar
                case 7:
                    System.out.println("Você escolheu sair do menu veiculo!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while(escolha != 7);
    }

    
    /** 
     * @param placa
     */
    private void selecionarMenu(String placa) {
        int tipoVeiculo = menuVeiculo.receberTipo(placa);

        if(placa != null) {
            switch(tipoVeiculo) {
                //Erro
                case 0:
                    System.out.println("ERRO INESPERADO!");
                    break;

                //Carro
                case 1:
                    menuCarro(placa);
                    break;

                //Caminhao
                case 2:
                    menuCaminhao(placa);
                    break;

                //Onibus
                case 3:
                    menuOnibus(placa);
                    break;
            }
        } else {
            System.out.println("Placa não encontrada no sistema!");
        }
    }


    
    /** 
     * @param placa
     */
    private void menuCarro(String placa) {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\n====== MENU CARRO ======");
            System.out.println("1) Alterar número de passageiros");
            System.out.println("2) Alterar número de portas");
            System.out.println("3) Alterar média de KM'S");
            System.out.println("4) Alterar ar-condicionado");
            imprimirOpcoesDefault(5);
            System.out.println("7) Voltar");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch (escolha) {

                //Alterar número de passageiros
                case 1:
                    menuVeiculo.alteraNumeroPassageiroCarro(placa);
                    break;

                //Alterar número de portas
                case 2:
                    menuVeiculo.alteraNumeroPortaCarro(placa);
                    break;

                //Alterar média de KM
                case 3:
                    menuVeiculo.alteraMediaKmCarro(placa);
                    break;
                
                //Alterar ar-condicionado
                case 4:
                    menuVeiculo.alteraArCondicionadoCarro(placa);
                    break;

                //Alterar ano
                case 5:
                    menuVeiculo.alteraAno(placa);
                    break;

                //Alterar diaria
                case 6:
                    menuVeiculo.alteraDiaria(placa);
                    break;

                //Sair
                case 7:
                    System.out.println("Você escolheu sair do menu carro!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while (escolha != 7); 
    }

    
    /** 
     * @param placa
     */
    private void menuOnibus(String placa) {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\n====== MENU ÔNIBUS ======");
            System.out.println("1) Alterar número de passageiros");
            System.out.println("2) Alterar categoria");
            System.out.println("3) Alterar wifi");
            System.out.println("4) Alterar ar-condicionado");
            imprimirOpcoesDefault(5);
            System.out.println("7) Voltar");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch (escolha) {

                //Alterar número de passageiros
                case 1:
                    menuVeiculo.alteraNumeroPassageiroOnibus(placa);
                    break;

                //Alterar categoria
                case 2:                                            
                    menuVeiculo.alteraCategoriaOnibus(placa);
                    break;

                //Alterar wifi
                case 3:
                    menuVeiculo.alteraWifiOnibus(placa);
                    break;
                
                //Alterar ar-condicionado
                case 4:
                    menuVeiculo.alteraArCondicionadoOnibus(placa);
                    break;

                //Alterar ano
                case 5:
                    menuVeiculo.alteraAno(placa);
                    break;

                //Alterar diaria
                case 6:
                    menuVeiculo.alteraDiaria(placa);
                    break;

                //Sair
                case 7:
                    System.out.println("Você escolheu sair do menu ônibus!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while (escolha != 7); 
    }

    
    /** 
     * @param placa
     */
    private void menuCaminhao(String placa) {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\n====== MENU CAMINHÃO ======");
            System.out.println("1) Alterar número de eixos");
            System.out.println("2) Alterar carga máxima");
            imprimirOpcoesDefault(3);
            System.out.println("5) Voltar");
            System.out.print("Opção: ");
            escolha = input.nextInt();
            
            switch (escolha) {

                //Alterar número de eixos
                case 1:
                    menuVeiculo.alteraEixoCaminhao(placa);
                    break;

                //Alterar carga máxima
                case 2:
                    menuVeiculo.alteraCargaMaximaCaminhao(placa);
                    break;

                //Alterar ano
                case 3:
                    menuVeiculo.alteraAno(placa);
                    break;

                //Alterar diaria
                case 4:
                    menuVeiculo.alteraDiaria(placa);
                    break;

                //Sair
                case 5:
                    System.out.println("Você escolheu sair do menu caminhão!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
                    
            }
        } while (escolha != 5);
    }


    //LOCACAO
    private void menuLocacao() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        
        do {
            System.out.println("\n====== MENU LOCAÇÃO ======");
            System.out.println("1) Adicionar Locação");
            System.out.println("2) Remover Locação");
            System.out.println("3) Visualizar Locações");
            System.out.println("4) Visualizar uma Locação específica");
            System.out.println("5) Voltar");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch(escolha) {
                //Adicionar Locação
                case 1:
                    menuLocacao.adicionarLocacao();
                    break;

                //Remover Locação
                case 2:
                    menuLocacao.removerLocacao();
                    break;
                
                //Visualizar Locações
                case 3:
                    menuLocacao.mostrarInfoLocacoes();
                    break;

                //Visualizar uma Locação específica
                case 4:
                    menuLocacao.mostrarInfoLocacao();
                    break;
                
                //Sair
                case 5:
                    System.out.println("Você escolheu sair do menu locação");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;

            }
        } while(escolha != 5);
    }

    
    /** 
     * @param inicio
     */
    private void imprimirOpcoesDefault(int inicio) {
        System.out.println(inicio + ") Editar ano do veículo");
        System.out.println((inicio + 1) + ") Editar diaria do veículo");
    }

}