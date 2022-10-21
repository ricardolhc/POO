package menu;

import java.util.Scanner;

import controlelista.Cliente;
import controlelista.ListaClientes;

public class MenuCliente {

    private ListaClientes listaClientes;

    public MenuCliente() {
        listaClientes = new ListaClientes();
    }

    public void adicionaCliente() {
        Scanner input = new Scanner(System.in);

        String nome = null;
        long cpf = 0;
        int numeroCarteiraMotorista = 0;
        String endereco = null;
        int telefone = 0;

        do {
            System.out.print("Digite o CPF do cliente: ");
            cpf = input.nextLong();

            if (cpf == 0) {
                System.out.println("CPF inválido!");
            } else {
                if (listaClientes.existe(cpf)) {
                    System.out.println("O CPF já está adicionado no sistema!");
                }
            }
        } while(cpf <= 0 || listaClientes.existe(cpf));

        input.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nome = input.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        endereco = input.nextLine();

        System.out.print("Digite o numero da carteira de motorista: ");
        numeroCarteiraMotorista = input.nextInt();

        System.out.print("Digite o telefone: ");
        telefone = input.nextInt();

        listaClientes.add(new Cliente(cpf, nome, numeroCarteiraMotorista, endereco, telefone));
    }

    public void removeCliente() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("Digite o CPF do cliente que deseja remover: ");
        cpf = input.nextLong();

        if(listaClientes.remove(cpf)) {
            System.out.println("Remoção concluída com sucesso");
        } else {
            System.out.println("A remoção não foi bem sucedida!");
        }
    }

    public void getInformacaoCliente() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;

        System.out.print("Digite o CPF que se deseja pegar as informaçôes: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.println(listaClientes.getInfo(cpf));
        } else {
            System.out.println("CPF não existente!");
        }
    }

    public void getInformacoesClientes() {
        if(listaClientes.getInfo() != null) {
            System.out.println(listaClientes.getInfo());
        } else {
            System.out.println("Não foi possível imprimir as informações");
        } 
    }

    public void getInformacoesClientesResumido() {
        if(listaClientes.getResumoInfo() != null) {
            System.out.println(listaClientes.getResumoInfo());
        } else {
            System.out.println("Não foi possível imprimir as informações");
        }
    }

    public void alteraNome() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("Digite o CPF que se deseja alterar o nome: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.print("Digite o novo nome: ");
            listaClientes.setNome(cpf, input.nextLine());
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

    public void alteraNumeroCarteira() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("Digite o CPF que se deseja alterar o nome: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.print("Digite o novo numero: ");
            listaClientes.setNumeroCarteira(cpf, input.nextInt());
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

    public void alteraEndereco() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("Digite o CPF que se deseja alterar o nome: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.print("Digite o novo endereco: ");
            listaClientes.setEndereco(cpf, input.nextLine());
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }

    public void alteraTelefone() {
        Scanner input = new Scanner(System.in);
        long cpf = 0;
        
        System.out.print("Digite o CPF que se deseja alterar o nome: ");
        cpf = input.nextLong();

        if(listaClientes.existe(cpf)) {
            System.out.print("Digite o novo endereco: ");
            listaClientes.setTelefone(cpf, input.nextInt());
        } else {
            System.out.println("O CPF informado não existe!");
        }
    }
}
