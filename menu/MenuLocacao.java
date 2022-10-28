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

        do {
            System.out.print("Digite uma placa para a locação: ");
            placa = input.nextLine();

            if(!listaVeiculos.existe(placa)) {
                System.out.println("Digite uma placa válida!");
            }
        } while(!listaVeiculos.existe(placa));

        do {
            System.out.print(" Digite um cpf para a locação: ");
            cpf = input.nextLong();

            if(!listaClientes.existe(cpf)) {
                System.out.println(" Digite um cpf válido!");
            }
        } while(!listaClientes.existe(cpf));


        do {
            System.out.println("Seu veiculo possui seguro: (1)Sim (2)Não");
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

            dia = cadastrarDia();
            mes = cadastrarMes();
            System.out.print("Informe o ano inicial: ");
            ano = input.nextInt();
            dataInicial.set(ano, mes, dia);

            dia = cadastrarDia();
            mes = cadastrarMes();
            System.out.print("Informe o ano inicial: ");
            ano = input.nextInt();
            
            dataFinal.set(ano, mes, dia);

            dias = (dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis()) / (1000 * 60 * 60 * 24);

            if(dias <= 0) {
                System.out.println("\n Digite uma data final que seja maior que a data inicial!");
            }

        } while(dias <= 0);
        
        listaLocacoes.add(new Locacao(seguro, dataInicial, dataFinal, listaClientes.get(cpf), listaVeiculos.get(placa)));
    }


    public void mostrarInfoLocacao(){
        Scanner input = new Scanner(System.in);
        int codigo = 0;

        System.out.print("\nDigite o código da locação que deseja obter as informações:");
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

        System.out.print("\n Digite o código da locação que deseja remover:");
        codigo = input.nextInt();

        if(!listaLocacoes.remove(codigo)) {
            System.out.println("Código da locação não existe");
        }
    }
    

    /* FACILITADORES */
    public int cadastrarDia() {
        Scanner input = new Scanner(System.in);

        int dia;
        do {
            System.out.print("\nInforme o dia inicial: ");   
            dia = input.nextInt();

            if(dia > 31 || dia < 1){
                System.out.println("Informe um dia válido!");
            }
        } while(dia > 31 || dia < 1);

        return dia;
    }

    public int cadastrarMes() {
        Scanner input = new Scanner(System.in);

        int mes;
        do {
            System.out.print("\nInforme o mes inicial: ");   
            mes = input.nextInt();

            if(mes > 12 || mes < 1){
                System.out.println("Informe um mes válido!");
            }
        } while(mes > 12 || mes < 1);

        return mes;
    }

}
