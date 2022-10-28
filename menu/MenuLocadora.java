package menu;
import java.util.Scanner;

public class MenuLocadora {
    
    private MenuLocacao menuLocacao;
    private MenuCliente menuCliente;
    private MenuVeiculo menuVeiculo;

    public MenuLocadora() {
        menuLocacao = new MenuLocacao();
        menuCliente = new MenuCliente();
        menuVeiculo = new MenuVeiculo();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\nMENU PRINCIPAL");
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
   
    // CLIENTE
    private void menuCliente() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        
        do {
            System.out.println("\nMENU CLIENTE");
            System.out.println("1) Adicionar cliente");
            System.out.println("2) Remover cliente");
            System.out.println("3) Visualizar informações de um cliente específico");
            System.out.println("4) Visualizar informações de todos os clientes");
            System.out.println("5) Visualizar resumo das informações de todos os clientes");
            System.out.println("6) Alterar nome do cliente");
            System.out.println("7) Alterar número da carteira de motorista do cliente");
            System.out.println("8) Alterar endereço do cliente");
            System.out.println("9) Alterar telefone do cliente");
            System.out.println("10) Sair");
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

 
    
    // VEICULO
    private void menuVeiculo() {
        int escolha = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nMENU VEICULO");
            System.out.println("1) Adicionar Veículo");
            System.out.println("2) Excluir Veículo");
            System.out.println("3) Visualizar um veículo específico");
            System.out.println("4) Visualizar todos os veículos");
            System.out.println("5) Visualizar o resumo de todos os veículos");
            System.out.println("6) Editar Carro");
            System.out.println("7) Editar Ônibus");
            System.out.println("8) Editar Caminhão");
            System.out.println("9) Editar ano do veículo");
            System.out.println("10) Editar diaria do veículo");
            System.out.println("11) Sair");
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
                    menuCarro();
                    break;

                //Editar ônibus
                case 7:
                    menuOnibus();
                    break;

                //Editar caminhão
                case 8:
                    menuCaminhao();
                    break;

                //Editar ano do veículo
                case 9:
                    menuVeiculo.alteraAno();
                    break;

                //Editar diaria do veículo
                case 10:
                    menuVeiculo.alteraDiaria();
                    break;

                //Sair
                case 11:
                    System.out.println("Você escolheu sair do menu veiculo!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while(escolha != 11);
    }


    private void menuCarro() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\nMENU CARRO");
            System.out.println("1) Alterar número de passageiros");
            System.out.println("2) Alterar número de portas");
            System.out.println("3) Alterar média de KM'S");
            System.out.println("4) Alterar ar-condicionado");
            System.out.println("5) Sair");
            escolha = input.nextInt();

            switch (escolha) {

                //Alterar número de passageiros
                case 1:
                    menuVeiculo.alteraNumeroPassageiroCarro();
                    break;

                //Alterar número de portas
                case 2:
                    menuVeiculo.alteraNumeroPortaCarro();
                    break;

                //Alterar média de KM
                case 3:
                    menuVeiculo.alteraMediaKmCarro();
                    break;
                
                //Alterar ar-condicionado
                case 4:
                    menuVeiculo.alteraArCondicionadoCarro();
                    break;

                //Sair
                case 5:
                    System.out.println("Você escolheu sair do menu carro!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while (escolha != 5); 
    }

    private void menuOnibus() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\nMENU ÔNIBUS");
            System.out.println("1) Alterar número de passageiros");
            System.out.println("2) Alterar categoria");
            System.out.println("3) Alterar wifi");
            System.out.println("4) Alterar ar-condicionado");
            System.out.println("5) Sair");
            escolha = input.nextInt();

            switch (escolha) {

                //Alterar número de passageiros
                case 1:
                    menuVeiculo.alteraNumeroPassageiroOnibus();
                    break;

                //Alterar categoria
                case 2:                                            
                    menuVeiculo.alteraCategoriaOnibus();
                    break;

                //Alterar wifi
                case 3:
                    menuVeiculo.alteraWifiOnibus();
                    break;
                
                //Alterar ar-condicionado
                case 4:
                    menuVeiculo.alteraArCondicionadoOnibus();
                    break;

                //Sair
                case 5:
                    System.out.println("Você escolheu sair do menu ônibus!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        } while (escolha != 5); 
    }

    private void menuCaminhao() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("\nMENU CAMINHÃO");
            System.out.println("1) Alterar número de eixos");
            System.out.println("2) Alterar carga máxima");
            System.out.println("3) Sair");
            escolha = input.nextInt();

            switch (escolha) {

                //Alterar número de eixos
                case 1:
                    menuVeiculo.alteraEixoCaminhao();
                    break;

                //Alterar carga máxima
                case 2:
                    menuVeiculo.alteraCargaMaximaCaminhao();
                    break;

                //Sair
                case 3:
                    System.out.println("Você escolheu sair do menu caminhão!");
                    break;

                //Opção inválida
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
                    
            }
        } while (escolha != 3); 
    }


    //LOCACAO
    private void menuLocacao() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        
        do {
            System.out.println("\nMENU LOCAÇÃO");
            System.out.println("1) Adicionar Locação");
            System.out.println("2) Remover Locação");
            System.out.println("3) Visualizar Locações");
            System.out.println("4) Visualizar uma Locação específica");
            System.out.println("5) Sair");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch(escolha) {
                //Adicionar Locação
                case 1:
                    menuLocacao.adicionarLocacao(menuCliente.getListaClientes(), menuVeiculo.getListaVeiculos());
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
}