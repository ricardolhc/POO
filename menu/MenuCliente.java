/**
 * A classe MenuCliente modela o menu para cadastro, busca e modificação de informações do cliente.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import controlelista.Cliente;
import controlelista.ListaClientes;

public class MenuCliente {

    /**
     * O atributo listaClientes, do tipo ListaClientes, e utilizado para armazenar os clientes
     */
    private ListaClientes listaClientes;

    private Scanner input;

    public MenuCliente(ListaClientes listaClientes, Scanner input) {
        this.input = input;
        this.listaClientes = listaClientes;
    }

    
    /**
     * captura as informãoes e adiciona um cliente 
     * valida cpf e verifica se já existe
     * retorna uma mensagem se o cliente foi adicionado com sucesso
     */
    public void adicionaCliente() {
        String nome = null;
        String cpf = null;
        int numeroCarteiraMotorista = 0;
        String endereco = null;
        long telefone = 0;

        input.nextLine();

        do {
            System.out.print("\nDigite o CPF do cliente: ");
            cpf = input.nextLine();

            if(cpf.length() < 11 || cpf.length() > 11) {
                System.out.println("CPF inválido!");
            } else {
                if(listaClientes.existe(Long.parseLong(cpf))) {
                    System.out.print("O CPF já está adicionado no sistema!");
                }
            }
        } while(cpf.length() < 11 || cpf.length() > 11 || listaClientes.existe(Long.parseLong(cpf)));

        System.out.print("Digite o nome do cliente: ");
        nome = input.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        endereco = input.nextLine();

        numeroCarteiraMotorista = lerInteiro("Digite o numero da carteiro de motorista: ");

        telefone = lerLong("Digite o telefone: ");
        

        listaClientes.add(new Cliente(cpf, nome, numeroCarteiraMotorista, endereco, telefone));
        System.out.println("Cliente adicionado com sucesso!");
    }

    
    /**
     * Imprime uma mensagem pedindo o cpf para a remoção, 
     * caso não exista o cpf ele imprimirá uma mensagem de erro
     */
    public void removeCliente() {
        long cpf = 0;

        try {
            System.out.print("\nDigite o CPF do cliente que deseja remover: ");
            cpf = input.nextLong();
            if(listaClientes.remove(cpf)) {
                System.out.println("Remoção concluída com sucesso");
            }
        } catch(InputMismatchException e) {
            System.out.println("Número inválido!");
            input.nextLine();
        }

        
    }

    /**
     * imprime uma mensagem pedindo o cpf para a remoção de informações,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void getInformacaoCliente() {
        long cpf = 0;

        cpf = lerLong("\nDigite o CPF que se deseja pegar as informações: ");

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
        try {
            System.out.println("\n====== INFORMAÇÕES DE TODOS OS CLIENTES ======");
            System.out.println(listaClientes.getInfo());
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * imprime um resumo das informações dos clientes
     */
    public void getInformacoesClientesResumo() {
        try {
            System.out.println("\n====== RESUMO DAS INFORMAÇÕES DE TODOS OS CLIENTES ======");
            System.out.println(listaClientes.getResumoInfo());
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * imprime uma mensagem pedindo o cpf para a alteração do nome do cliente,
     * caso não exista o cpf imprime uma mensagem de erro.
     */
    public void alteraNome() {
        long cpf = 0;
        
        cpf = lerLong("\nDigite o CPF que se deseja alterar o nome: ");

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
        long cpf = 0;
        
        cpf = lerLong("\nDigite o CPF que se deseja alterar o numero da carteira: ");

        if(listaClientes.existe(cpf)) {
            int numeroCarteiraMotorista = 0;
            numeroCarteiraMotorista = lerInteiro("Digite o novo numero: ");
            listaClientes.setNumeroCarteira(cpf, numeroCarteiraMotorista);
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
        long cpf = 0;
        
        cpf = lerLong("\nDigite o CPF que se deseja alterar o endereço: ");

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
        long cpf = 0;
        
        //System.out.print("\nDigite o CPF que se deseja alterar o telefone: ");
        cpf = lerLong("\nDigite o CPF que se deseja alterar o telefone: ");

        if(listaClientes.existe(cpf)) {
            long telefone = 0;
            telefone = lerLong("Digite o novo telefone: ");
            System.out.println("Telefone alterado com sucesso!");
            listaClientes.setTelefone(cpf, telefone);
        } else {
            System.out.println("O CPF informado não existe!");
        }
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