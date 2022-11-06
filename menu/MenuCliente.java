package menu;

import java.util.Scanner;

import controlelista.Cliente;
import controlelista.ListaClientes;



public class MenuCliente {

    /**
     * O atributo listaClientes, do tipo ListaClientes, e utilizado para armazenar os clientes
     */
    private ListaClientes listaClientes;

    public MenuCliente(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }

    
    /** 
     * Retorna a lista de clientes
     * @return ListaClientes
     */
    public ListaClientes getListaClientes() {
        return listaClientes;
    }


    /**
     * captura as informãoes e adiciona um cliente 
     * valida cpf e verifica se já existe
     * retorna uma mensagem se o cliente foi adicionado com sucesso
     */
    public void adicionaCliente() {
        Scanner input = new Scanner(System.in);

        String nome = null;
        long cpf = 0;
        int numeroCarteiraMotorista = 0;
        String endereco = null;
        long telefone = 0;

        do {
            System.out.print("\nDigite o CPF do cliente: ");
            cpf = input.nextLong();

            if (cpf < 10000000000L || cpf > 99999999999L) {
                System.out.println("CPF inválido!");
            } else {
                if(listaClientes.existe(cpf)) {
                    System.out.print("O CPF já está adicionado no sistema!");
                }
            }
        } while(cpf < 10000000000L || cpf > 99999999999L || listaClientes.existe(cpf));

        input.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nome = input.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        endereco = input.nextLine();

        System.out.print("Digite o numero da carteira de motorista: ");
        numeroCarteiraMotorista = input.nextInt();

        System.out.print("Digite o telefone: ");
        telefone = input.nextLong();


        listaClientes.add(new Cliente(cpf, nome, numeroCarteiraMotorista, endereco, telefone));

        System.out.println("Cliente adicionado com sucesso!");

    }

    
    /**
     * Imprime uma mensagem pedindo o cpf para a remoção, 
     * caso não exista o cpf ele imprimirá uma mensagem de erro
     */
    public void removeCliente() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("\nDigite o CPF do cliente que deseja remover: ");
        cpf = input.nextLong();

        if(listaClientes.remove(cpf)) {
            System.out.println("Remoção concluída com sucesso");
        } else {
            System.out.println("A remoção não foi bem sucedida!");
        }
    }

    /**
     * imprime uma mensagem pedindo o cpf para a remoção de informações,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void getInformacaoCliente() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;

        System.out.print("\nDigite o CPF que se deseja pegar as informaçôes: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.println("\n====== INFORMAÇÕES DO CLIENTE ======");
            System.out.println(listaClientes.getInfo(cpf));
        } else {
            System.out.println("CPF não existente!");
        }
    }

    /**
     * imprime as informações de todos os clientes
     */
    public void getInformacoesClientes() {
        if(listaClientes.getInfo() != null) {
            System.out.println("\n====== INFORMAÇÕES DE TODOS OS CLIENTES ======");
            System.out.println(listaClientes.getInfo());
        } else {
            System.out.println("Não foi possível imprimir as informações");
        } 
    }

    /**
     * imprime um resumo das informações dos clientes
     */
    public void getInformacoesClientesResumo() {
        if(listaClientes.getResumoInfo() != null) {
            System.out.println("\n====== RESUMO DAS INFORMAÇÕES DE TODOS OS CLIENTES ======");
            System.out.println(listaClientes.getResumoInfo());
        } else {
            System.out.println("Não foi possível imprimir as informações");
        }
    }

    /**
     * imprime uma mensagem pedindo o cpf para a alteração do nome do cliente,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void alteraNome() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("\nDigite o CPF que se deseja alterar o nome: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            input.nextLine();
            System.out.print("Digite o novo nome: ");
            listaClientes.setNome(cpf, input.nextLine());
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

    /**
     * imprime uma mensagem pedindo o cpf para a alteração do número da carteira,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void alteraNumeroCarteira() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("\nDigite o CPF que se deseja alterar o numero da carteira: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.print("Digite o novo numero: ");
            listaClientes.setNumeroCarteira(cpf, input.nextInt());
            System.out.println("Numero da carteira de motorista alterado com sucesso!");
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

    /**
     * imprime uma mensagem pedindo o cpf para a alteração do endereço do cliente,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void alteraEndereco() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("\nDigite o CPF que se deseja alterar o endereço: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            input.nextLine();
            System.out.print("Digite o novo endereco: ");
            listaClientes.setEndereco(cpf, input.nextLine());
            System.out.println("Endereço alterado com sucesso!");            
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

    /**
     * imprime uma mensagem pedindo o cpf para a alteração do telefone do cliente,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void alteraTelefone() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("\nDigite o CPF que se deseja alterar o telefone: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.print("Digite o novo telefone: ");
            System.out.println("Telefone alterado com sucesso!");
            listaClientes.setTelefone(cpf, input.nextLong());
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

}