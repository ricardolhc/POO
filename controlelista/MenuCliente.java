package controlelista;

import java.util.Scanner;

public class MenuCliente {

    private ListaClientes listaClientes;

    public MenuCliente() {
        listaClientes = new ListaClientes();
    }

    public void adicionaCliente() {

        String nome = null;
        long cpf = 0;
        int numeroCarteiraMotorista = 0;
        String endereco = null;
        int telefone = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite o cpf do cliente: ");
            cpf = input.nextLong();

            if (cpf == 0) {
                System.out.println("Digite um cpf válido!");
            } else {
                if (listaClientes.existe(cpf)) {
                    System.out.println("O CPF já está adicionado no sistema!");
                }
            }
        } while (cpf == 0 || listaClientes.existe(cpf));

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

        long cpf;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o cpf do cliente que deseja remover: ");
        cpf = input.nextLong();

        input.close();

    }

}
