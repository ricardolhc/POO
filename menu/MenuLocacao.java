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
        
        Calendar dataInicial = Calendar.getInstance();
        Calendar dataFinal = Calendar.getInstance();

        int escolha = 0;
        boolean seguro = false;

        do {
            
            int dia = 0;
            int mes = 0;
            int ano = 0;

            do {
                System.out.print("Informe o dia inicial: ");   
                dia = input.nextInt();

                if(dia > 31 || dia < 1){
                    System.out.println("Informe um dia válida!");
                }
            } while(dia > 31 || dia < 1);
                
               
            do {
                System.out.print("Informe o mês inicial: "); 
                mes = input.nextInt();

                if(mes > 12 || mes < 1){
                    System.out.println("Informe um mês válido!");
                }
            }while(mes > 12 || mes <1);
    
            System.out.print("Informe o ano inicial: ");
            ano = input.nextInt();
               
            dataInicial.set(dia, mes, ano);

            do {
                System.out.print("Informe o dia final: ");   
                dia = input.nextInt();

                if(dia > 31 || dia < 1){
                    System.out.println("Informe um dia válida!");
                }
            } while(dia > 31 || dia < 1);
                
               
            do {
                System.out.print("Informe o mês final: "); 
                mes = input.nextInt();

                if(mes > 12 || mes < 1){
                    System.out.println("Informe um mês válido!");
                }
            } while(mes > 12 || mes <1);
    
            System.out.print("Informe o ano final: ");
            ano = input.nextInt();
            
            dataFinal.set(dia, mes, ano);

            long dataFinalLong = dataFinal.getTimeInMillis() / 1000 / 60 / 60 / -24;
            long InicialLong = dataInicial.getTimeInMillis() / 1000 / 60 / 60 / -24;

            System.out.println("Data final long: " + dataFinalLong);
            System.out.println("Data inicial long: " + InicialLong);

            if((dataFinal.getTimeInMillis() / 1000 / 60 / 60 / 24) - (dataInicial.getTimeInMillis() / 1000 / 60 / 60 / 24) <= 0) {
                System.out.println("Digite uma data final que seja maior que a data inicial!");
            }

        } while((dataFinal.getTimeInMillis() / 1000 / 60 / 60 / 24) - (dataInicial.getTimeInMillis() / 1000 / 60 / 60 / 24) <= 0);

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

        
        
        listaLocacoes.add(new Locacao(seguro, dataInicial, dataFinal, listaClientes.get(cpf), listaVeiculos.get(placa)));
    }

}
