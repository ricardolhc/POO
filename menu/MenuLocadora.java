/**
 * A classe MenuLocadora modela e integra os outros menus para a gerencia.
 * @author Mateus, Mauricio, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package menu;
import java.util.InputMismatchException;
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

    

    private Scanner input;


    /**
     * Construtor default da classe MenuLocadora<br>
     * <b>Uso: </b>
     * MenuLocadora menuLocadora = new MenuLocadora(listaClientes, listaLocacoes, listaVeiculos);<br><br>
     * @param listaClientes ListaClientes que identifica a lista de clientes
     * @param listaLocacoes ListaLocacoes que identifica a lista de locacoes
     * @param listaVeiculos ListaVeiculos que identifica a lista de veiculos
     */
    public MenuLocadora(ListaClientes listaClientes, ListaLocacoes listaLocacoes, ListaVeiculos listaVeiculos, Scanner input) {
        this.input = input;
        menuLocacao = new MenuLocacao(listaLocacoes, listaClientes, listaVeiculos, input);
        menuCliente = new MenuCliente(listaClientes, input);
        menuVeiculo = new MenuVeiculo(listaVeiculos, input);
    }

    /**
     * Método que exibe o menu principal da locadora<br>
     * <b>Uso: </b>
     * menuLocadora.exibirMenu();<br><br>
     */
    public void menu() {
        int escolha = 0;

        String menu = "\n====== MENU PRINCIPAL ======\n" +
                      "1) Menu Cliente\n" +
                      "2) Menu Veiculo\n" +
                      "3) Menu Locação\n" +
                      "4) Sair\n" +
                      "Digite a opção desejada: ";

        do {
            escolha = lerInteiro(menu);

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
        int escolha = 0;

        String menu = "\n====== MENU CLIENTE ======\n" +
                      "1) Adicionar cliente\n" +
                      "2) Remover cliente\n" +
                      "3) Visualizar informações de um cliente específico\n" +
                      "4) Visualizar informações de todos os clientes\n" +
                      "5) Visualizar resumo das informações de todos os clientes\n" +
                      "6) Alterar nome do cliente\n" +
                      "7) Alterar número da carteira de motorista do cliente \n" +
                      "8) Alterar endereço do cliente \n" +
                      "9) Alterar telefone do cliente \n" +
                      "10) Voltar \n" +
                      "Digite a opção desejada: ";
                        
        
        do {
            escolha = lerInteiro(menu);
            
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
    
    /**
     * Método que exibe o menu de veiculos<br>
     * <b>Uso: </b>
     * menuLocadora.menuVeiculo();<br><br>
     */
    private void menuVeiculo() {
        int escolha = 0;
        String placa = null;

        String menu = "\n====== MENU VEICULO ======\n" +
                      "1) Adicionar Veículo\n" +
                      "2) Excluir Veículo\n" +
                      "3) Visualizar um veículo específico\n" +
                      "4) Visualizar todos os veículos\n" +
                      "5) Visualizar o resumo de todos os veículos\n" +
                      "6) Editar Veículo\n" +
                      "7) Voltar\n" +
                      "Digite a opção desejada: ";

        do {

            escolha = lerInteiro(menu);
            
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
                    try {
                        placa = menuVeiculo.receberPlaca();
                        selecionarMenu(placa);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
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
     * Método que exibe o menu de acordo com o veículo
     * @param placa placa do veículo que será buscado
     */
    private void selecionarMenu(String placa) {
        int tipoVeiculo = menuVeiculo.receberTipo(placa);

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
        
    }


    
    /**
     * Método que exibe o menu de carros<br>
     * @param placa placa do carro que será buscado
     */
    private void menuCarro(String placa) {
        int escolha = 0;

        String menu = "\n====== MENU CARRO ======\n" +
                            "1) Alterar número de passageiros \n" +
                            "2) Alterar número de portas \n" +
                            "3) Alterar média de KM'S \n" +
                            "4) Alterar ar-condicionado \n" +
                            "5) Editar ano do veículo \n" +
                            "6) Editar diaria do veículo \n" +
                            "7) Voltar \n" +
                            "Digite a opção desejada: ";    
        do {
            
            escolha = lerInteiro(menu);

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
     * Método que exibe o menu de Onibus<br>
     * @param placa placa do onibus que será buscado
     */
    private void menuOnibus(String placa) {
        int escolha = 0;

        String menu = "\n====== MENU ÔNIBUS ======\n" +
                        "1) Alterar número de passageiros \n" +
                        "2) Alterar categoria \n" +
                        "3) Alterar wifi \n" +
                        "4) Alterar ar-condicionado \n" +
                        "5) Editar ano do veículo \n" +
                        "6) Editar diaria do veículo \n" +
                        "7) Voltar \n" +
                        "Digite a opção desejada: ";

        do {

            escolha = lerInteiro(menu);

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
     * Método que exibe o menu de caminhões<br>
     * @param placa placa do caminhão que será buscado
     */
    private void menuCaminhao(String placa) {
        int escolha = 0;

       String menu = "\n====== MENU CAMINHÃO ======\n" +
                      "1) Alterar número de eixos \n" +
                      "2) Alterar carga máxima \n " +
                      "3) Editar ano do veículo \n " +
                      "4) Editar diaria do veículo \n " +
                      "5) Voltar \n" +
                      "Opção: ";
                     
        do {
            escolha = lerInteiro(menu);
            
            switch(escolha) {

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


    /**
     * Método que exibe o menu de Locacao<br>
     */
    private void menuLocacao() {
        int escolha = 0;
        
        String menu = "\n====== MENU LOCAÇÃO ======\n" + 
                        "1) Adicionar Locação\n" +
                        "2) Remover Locação\n" +
                        "3) Visualizar Locações\n" +
                        "4) Visualizar uma Locação específica\n" +
                        "5) Editar data inicial\n" +
                        "6) Editar data final\n" +
                        "7) Visualizar todas as locações de um cliente\n" +
                        "8) Visualizar todas as locações de um veículo\n" +
                        "9) Visualizar locações em um dia, mês e ano especifico\n" +
                        "10) Visualizar locações de um mês e ano específico \n" +
                        "11) Visualizar locações de um ano específico\n" +
                        "12) Visualizar locações entra duas datas\n" +
                        "13) Voltar\n" +
                        "Digite a opção desejada: ";
         
        do {
           
            escolha = lerInteiro(menu);

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

                //Editar data inicial
                case 5:
                    menuLocacao.alteraDataInicial();
                    break;

                //Editar data final
                case 6:
                    menuLocacao.alteraDataFinal();
                    break;
                
                case 7:
                    menuLocacao.listarLocacaoCliente();
                    break;
                
                case 8:
                    menuLocacao.listarLocacaoVeiculo();
                    break;

                case 9:
                    menuLocacao.listarLocacaoDiaMesAno();
                    break;

                case 10:
                    menuLocacao.listarLocacaoMesAno();
                    break;

                case 11:    
                    menuLocacao.listarLocacaoAno();
                    break;

                case 12:
                    menuLocacao.listarLocacaoPeriodo();
                    break;

                //Sair
                case 13:
                    System.out.println("Você escolheu sair do menu locação");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;

            }
        } while(escolha != 13);
    }

    


    private int lerInteiro(String mensagem) {
        boolean flag = true;
        int numero = 0;

        do {
            try {
                System.out.print(mensagem);
                numero = input.nextInt();
                flag = false;
            } catch(InputMismatchException e) {
                System.out.println("Número inválido!");
                input.nextLine();
                flag = true;
            }
        } while(flag);

        return numero;
    }

    
}