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


    /**
     * Construtor default MenuLocacao, recebe como parametro as listas de locacoes, clientes e veiculos
     * @param listaLocacoes lista de locacoes que identifica as locacoes
     * @param listaClientes lista de clientes que identifica os clientes
     * @param listaVeiculos lista de veiculos que identifica os veiculos
     */
    public MenuLocacao(ListaLocacoes listaLocacoes, ListaClientes listaClientes, ListaVeiculos listaVeiculos) {
        this.listaLocacoes = listaLocacoes;
        this.listaClientes = listaClientes;
        this.listaVeiculos = listaVeiculos;
    }


    /** 
     * 
     * Menu para adicionar uma locação no sistema
     */
    public void adicionarLocacao() {

        Scanner input = new Scanner(System.in);

        long cpf = 0;
        String placa = null;
        long dias = 0;
        
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
        
        System.out.print("Digite um cpf para a locação: ");
        cpf = input.nextLong();
        if(!listaClientes.existe(cpf)) {
            System.out.println("Digite um cpf válido!");
            return;
        }
        
        do {
            
            System.out.println("Seu veiculo possui seguro?");
            System.out.println("1) Sim");
            System.out.println("2) Não");
            System.out.print("Opção: ");
            escolha = input.nextInt();

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
            System.out.print("Informe o ano inicial: ");
            ano = input.nextInt();
            dataInicial.set(ano, mes - 1, dia);

            dia = cadastrarDia("final");
            mes = cadastrarMes("final");
            System.out.print("Informe o ano final: ");
            ano = input.nextInt();
            
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
     * 
     * Menu para obter obter informações de uma locação
     */
    public void mostrarInfoLocacao(){
        Scanner input = new Scanner(System.in);
        int codigo = 0;

        System.out.print("\nDigite o código da locação que deseja obter as informações: ");
        codigo = input.nextInt();

        if(listaLocacoes.existe(codigo)) {
            System.out.println(listaLocacoes.getInfo(codigo));
        } else {
            System.out.println("Código da locação não existe");
        }

    }

    /**
     * 
     * Menu para mostrar informações de todas as locações
     */
    public void mostrarInfoLocacoes() {
        if(listaLocacoes.getInfo() != null) {
            System.out.println(listaLocacoes.getInfo());
        } else {
            System.out.println("Não existem locações");
        }
    }

    /**
     * 
     * Menu para remover uma locação do sistema
     */
    public void removerLocacao() {
        Scanner input = new Scanner(System.in);
        int codigo = 0;

        System.out.print("\nDigite o código da locação que deseja remover: ");
        codigo = input.nextInt();

        if(!listaLocacoes.remove(codigo)) {
            System.out.println("Código da locação não existe");
        } else {
            System.out.println("Locação removida com sucesso");
        }
    }
    

    
    /** 
     * @param inicioFim String que identifica se é a data inicial ou final
     * @return int a data do dia
     */
    public int cadastrarDia(String inicioFim) {
        Scanner input = new Scanner(System.in);

        int dia;
        do {
            System.out.print("\nInforme o dia " + inicioFim + ": ");   
            dia = input.nextInt();

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
        Scanner input = new Scanner(System.in);

        int mes;
        do {
            System.out.print("Informe o mês " + inicioFim + ": ");   
            mes = input.nextInt();

            if(mes > 12 || mes < 1){
                System.out.println("Informe um mes válido!");
            }  
        } while(mes > 12 || mes < 1);

        return mes;
    }

}