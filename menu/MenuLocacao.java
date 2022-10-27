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
            System.out.print("Digite um cpf para a locação: ");
            cpf = input.nextLong();

            if(!listaClientes.existe(cpf)) {
                System.out.println("Digite um cpf válido!");
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
                System.out.println("Digite uma data final que seja maior que a data inicial!");
            }

        } while(dias <= 0);
        
        listaLocacoes.add(new Locacao(seguro, dataInicial, dataFinal, listaClientes.get(cpf), listaVeiculos.get(placa)));
    }




    /* FACILITADORES */
    public int cadastrarDia() {
        Scanner input = new Scanner(System.in);

        int dia;
        do {
            System.out.print("Informe o dia inicial: ");   
            dia = input.nextInt();

            if(dia > 31 || dia < 1){
                System.out.println("Informe um dia válida!");
            }
        } while(dia > 31 || dia < 1);

        return dia;
    }

    public int cadastrarMes() {
        Scanner input = new Scanner(System.in);

        int mes;
        do {
            System.out.print("Informe o dia inicial: ");   
            mes = input.nextInt();

            if(mes > 12 || mes < 1){
                System.out.println("Informe um dia válida!");
            }
        } while(mes > 12 || mes < 1);

        return mes;
    }

}
