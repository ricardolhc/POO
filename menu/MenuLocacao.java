/**
 * A classe MenuLocacao modela o menu para cadastro, busca e modificação de informações da locacao.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package menu;

import controlelista.ListaClientes;
import controlelista.ListaLocacoes;
import controlelista.ListaVeiculos;
import controlelista.Locacao;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLocacao {
    
    /**
     * O atributo listaLocacoes, do tipo ListaLocacoes, e utilizado para armazenar as locacoes
     */
    private ListaLocacoes listaLocacoes;
    /**
     * O atributo listaClientes, do tipo ListaClientes, e utilizado para armazenar os clientes
     */
    private ListaClientes listaClientes;
    /**
     * O atributo listaVeiculos, do tipo ListaVeiculos, e utilizado para armazenar os veiculos
     */
    private ListaVeiculos listaVeiculos;


    private Scanner input;


    /**
     * Construtor default MenuLocacao, recebe como parametro as listas de locacoes, clientes e veiculos
     * @param listaLocacoes lista de locacoes que identifica as locacoes
     * @param listaClientes lista de clientes que identifica os clientes
     * @param listaVeiculos lista de veiculos que identifica os veiculos
     */
    public MenuLocacao(ListaLocacoes listaLocacoes, ListaClientes listaClientes, ListaVeiculos listaVeiculos, Scanner input) {
        this.input = input;
        this.listaLocacoes = listaLocacoes;
        this.listaClientes = listaClientes;
        this.listaVeiculos = listaVeiculos;
    }


    /** 
     * O metodo menuLocacao, do tipo void, e utilizado para exibir o menu de locacao
     */
    public void adicionarLocacao() {

        long cpf = 0;
        String placa = null;
        long dias = 0;
        
        input.nextLine();

        Calendar dataInicial = Calendar.getInstance();
        Calendar dataFinal = Calendar.getInstance();

        int escolha = 0;
        boolean seguro = false;

        System.out.print("\nDigite uma placa para a locação: ");
        placa = input.nextLine();
        if(!listaVeiculos.existe(placa)) {
            System.out.println("Digite uma placa válida!");
            return;
        }
        
        cpf = lerLong("Digite um cpf para a locação: ");
        if(!listaClientes.existe(cpf)) {
            System.out.println("Digite um cpf válido!");
            return;
        }
        
        do {
            
            System.out.println("Seu veiculo possui seguro?");
            System.out.println("1) Sim");
            System.out.println("2) Não");
            System.out.print("Opção: ");
            escolha = lerInteiro();

            if(escolha == 1) {
                seguro = true;
            } else {
                seguro = false;
            }
        
        } while (escolha < 1 || escolha > 2 );

        do {
            
            int dia = 0;
            int mes = 0;
            int ano = 0;

            dia = cadastrarDia("inicial");
            mes = cadastrarMes("inicial");
            
            ano = lerInteiro("Informe o ano inicial: ");
            dataInicial.set(ano, mes - 1, dia);

            dia = cadastrarDia("final");
            mes = cadastrarMes("final");
            
            ano = lerInteiro("Informe o ano final: ");
            
            dataFinal.set(ano, mes - 1, dia);

            dias = (dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis()) / (1000 * 60 * 60 * 24);

            if(dias <= 0) {
                System.out.println("\nDigite uma data final que seja maior que a data inicial!");
            }

        } while(dias <= 0);
        
        listaLocacoes.add(new Locacao(seguro, dataInicial, dataFinal, listaClientes.get(cpf), listaVeiculos.get(placa)));
        System.out.println("Locação adicionada com sucesso!");
    }


    /**
     * Menu para obter obter informações de uma locação
     */
    public void mostrarInfoLocacao() {
        int codigo = 0;

        codigo = lerInteiro("\nDigite o código da locação que deseja obter as informações: ");

        if(listaLocacoes.existe(codigo)) {
            System.out.println("\n====== INFORMAÇÕES DA LOCAÇÃO ======");
            System.out.println(listaLocacoes.getInfo(codigo));
        }

    }

    /**
     * Menu para mostrar informações de todas as locações
     */
    public void mostrarInfoLocacoes() {
        try {
            System.out.println("\n====== INFORMAÇÕES DA LOCAÇÃO ======");
            System.out.println(listaLocacoes.getInfo());
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * Menu para remover uma locação do sistema
     */
    public void removerLocacao() {
        int codigo = 0;

        
        codigo = lerInteiro("\nDigite o código da locação que deseja remover: ");

        if(listaLocacoes.remove(codigo)) {
            System.out.println("Locação removida com sucesso");
        }
    }

    /**
     * Menu para alterar a data inicial de uma locação
     */
    public void alteraDataInicial() {
        int codigo = 0;

        Calendar dataInicial = Calendar.getInstance();

       
        codigo = lerInteiro("\nDigite o código da locação que deseja alterar a data inicial: ");

        if(listaLocacoes.existe(codigo)) {
            int dia = 0;
            int mes = 0;
            int ano = 0;

            dia = cadastrarDia("inicial");
            mes = cadastrarMes("inicial");
            
            ano = lerInteiro("Informe o ano inicial: ");

            dataInicial.set(ano, mes - 1, dia);

            long dataInicialLong = dataInicial.getTimeInMillis() / (1000 * 60 * 60 * 24);
            long dataFinalLong = listaLocacoes.get(codigo).getDataFinal().getTimeInMillis() / (1000 * 60 * 60 * 24);

            if(dataFinalLong <= dataInicialLong) {
                System.out.println("A data inicial não pode ser maior ou igual que a data final");
            } else {
                listaLocacoes.get(codigo).setDataInicial(dataInicial);
                System.out.println("Data inicial alterada com sucesso");
            }

        } else {
            System.out.println("Código da locação não existe");
        }
    }


    /**
     * Menu para alterar a data final de uma locação
     */
    public void alteraDataFinal() {
        int codigo = 0;

        Calendar dataFinal = Calendar.getInstance();

        
        codigo = lerInteiro("\nDigite o código da locação que deseja alterar a data final: ");

        if(listaLocacoes.existe(codigo)) {
            int dia = 0;
            int mes = 0;
            int ano = 0;

            dia = cadastrarDia("final");
            mes = cadastrarMes("final");
            
            ano = lerInteiro("Informe o ano final: ");

            dataFinal.set(ano, mes - 1, dia);

            long dataInicialLong = listaLocacoes.get(codigo).getDataInicial().getTimeInMillis() / (1000 * 60 * 60 * 24);
            long dataFinalLong = dataFinal.getTimeInMillis() / (1000 * 60 * 60 * 24);

            if(dataInicialLong >= dataFinalLong) {
                System.out.println("A data final não pode ser menor ou igual que a data inicial");
            } else {
                listaLocacoes.get(codigo).setDataFinal(dataFinal);
                System.out.println("Data final alterada com sucesso");
            }
        }
    }
    

    
    /** 
     * @param inicioFim String que identifica se é a data inicial ou final
     * @return int a data do dia
     */
    public int cadastrarDia(String inicioFim) {
        int dia = 0;

        do {
               
            dia = lerInteiro("\nInforme o dia " + inicioFim + ": ");

            if(dia > 31 || dia < 1){
                System.out.println("Informe um dia válido!");
            } 
        } while(dia > 31 || dia < 1);

        return dia;
    }

    
    /** 
     * @param inicioFim String que identifica se é a data inicial ou final
     * @return int a data do mês
     */
    public int cadastrarMes(String inicioFim) {
        int mes = 0;
        
        do {
            mes = lerInteiro("Informe o mês " + inicioFim + ": ");

            if(mes > 12 || mes < 1){
                System.out.println("Informe um mes válido!");
            }  
        } while(mes > 12 || mes < 1);

        return mes;
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
                System.out.println("Digite um número inteiro!");
                input.nextLine();
                flag = true;
            }
        } while(flag);

        return numero;
    }

    private int lerInteiro() {
        return lerInteiro("");
    }

    private long lerLong(String mensagem) {
        boolean flag = true;
        long numero = 0;

        do {
            try {
                System.out.print(mensagem);
                numero = input.nextLong();
                flag = false;
            } catch(InputMismatchException e) {
                System.out.println("Digite um número inteiro!");
                input.nextLine();
                flag = true;
            }
        } while(flag);

        return numero;
    }

    

}