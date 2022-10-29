package menu;

import controlelista.ListaClientes;
import controlelista.ListaLocacoes;
import controlelista.ListaVeiculos;
import controlelista.Locacao;

import java.util.Calendar;
import java.util.Scanner;

public class MenuLocacao {
    
    private ListaLocacoes listaLocacoes;

    public MenuLocacao() {
        listaLocacoes = new ListaLocacoes();
    }

    public void adicionarLocacao(ListaClientes listaClientes, ListaVeiculos listaVeiculos) {

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

    
    public void mostrarInfoLocacoes() {
        if(listaLocacoes.getInfo() != null) {
            System.out.println(listaLocacoes.getInfo());
        } else {
            System.out.println("Não existem locações");
        }
    }

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
    

    /* FACILITADORES */
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
