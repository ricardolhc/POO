package menu;

import java.util.Scanner;

import controlelista.ListaVeiculos;
import veiculo.Caminhao;
import veiculo.Carro;
import veiculo.Categoria;
import veiculo.Onibus;

public class MenuVeiculo {
    
    private ListaVeiculos listaVeiculos;

    public MenuVeiculo() {
        listaVeiculos = new ListaVeiculos();
    }

    public void adicionaCliente() {
        Scanner input = new Scanner(System.in);

        String placa = null;
        int ano = 0;
        double diaria = 0.0;
        int modeloCarro = 0; 

        do {
            System.out.print("Digite a placa do carro: ");
            placa = input.nextLine();

            if(placa == null) {
                System.out.println("Placa inválida!");
            } else {
                if(listaVeiculos.existe(placa)) {
                    System.out.println("A placa já está adicionada no sistema!");
                }
            }
        } while(placa == null || listaVeiculos.existe(placa));

        System.out.print("Digite o ano do carro: ");
        ano = input.nextInt();

        System.out.print("Digite a diaria do carro: ");
        diaria = input.nextDouble();

        do {
            System.out.println("1) Ônibus");
            System.out.println("2) Carro");
            System.out.println("3) Caminhão");
            System.out.print("Digite o modelo carro: ");
            modeloCarro = input.nextInt();

            if(modeloCarro < 1 || modeloCarro > 3) {

                switch(modeloCarro) {

                    case 1:
                        cadastrarOnibus(placa, ano, diaria);
                        break;

                    case 2:
                        cadastrarCarro(placa, ano, diaria);
                        break;

                    case 3:
                        cadastrarCaminhao(placa, ano, diaria);
                        break;
                }

            } else {
                System.out.println("Resposta inválida!");
            }

        } while(modeloCarro < 1 || modeloCarro > 3);

    }

    public void cadastrarCarro(String placa, int ano, double diaria) {
        Scanner input = new Scanner(System.in);
        
        int numeroPassageiros = 0;
        int numeroPortas = 0;
        double mediaKM = 0.0;
        boolean arcondicionado = false;

        int escolha = 0;

        System.out.print("Digite a quantidade de passageiros: ");
        numeroPassageiros = input.nextInt();

        System.out.print("Digite a quantidade de portas: ");
        numeroPortas = input.nextInt();

        System.out.print("Digite a media de KM por litro: ");
        mediaKM = input.nextDouble();

        do {
            System.out.println("Possui Ar-Condicionado?");
            System.out.println("1) Sim");
            System.out.println("2) Não");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            if(escolha < 1 || escolha > 2) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    arcondicionado = true;
                } else {
                    arcondicionado = false;
                }
            }
        } while(escolha < 1 || escolha > 2);

        listaVeiculos.add(new Carro(placa, ano, diaria, numeroPassageiros, numeroPortas, mediaKM, arcondicionado));
    }

    public void cadastrarCaminhao(String placa, int ano, double diaria) {
        Scanner input = new Scanner(System.in);

        int numeroEixos = 0;
        int cargaMaxima = 0;

        System.out.print("Digite o numero de eixos: ");
        numeroEixos = input.nextInt();

        System.out.print("Digite a carga máxima: ");
        cargaMaxima = input.nextInt();

        listaVeiculos.add(new Caminhao(placa, ano, diaria, numeroEixos, cargaMaxima));
    }

    public void cadastrarOnibus(String placa, int ano, double diaria) {
        Scanner input = new Scanner(System.in);

        int numeroPassageiros = 0;
        Categoria categoria = Categoria.CONVENCIONAL;
        boolean wifi = false;
        boolean arcondicionado = false;

        int escolha = 0;

        System.out.print("Digite a quantidade de passageiros: ");
        numeroPassageiros = input.nextInt();

        do {
            System.out.println("Possui wifi?");
            System.out.println("1) Sim");
            System.out.println("2) Não");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            if(escolha < 1 || escolha > 2) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    wifi = true;
                } else {
                    wifi = false;
                }
            }
        } while(escolha < 1 || escolha > 2);
                        
        do {
            System.out.println("Possui Ar-Condicionado?");
            System.out.println("1) Sim");
            System.out.println("2) Não");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            if(escolha < 1 || escolha > 2) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    arcondicionado = true;
                } else {
                    arcondicionado = false;
                }
            }
        } while(escolha < 1 || escolha > 2);

        do {
            System.out.println("Categorias: ");
            System.out.println("1) Leito");
            System.out.println("2) Convencional");
            System.out.println("3) Executivo");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            if(escolha < 1 || escolha > 3) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    categoria = Categoria.LEITO;
                } else if(escolha == 2) {
                    categoria = Categoria.CONVENCIONAL;
                } else {
                    categoria = Categoria.EXECUTIVO;
                }
            }
        } while(escolha < 1 || escolha > 3);

        listaVeiculos.add(new Onibus(placa, ano, diaria, numeroPassageiros, categoria, wifi, arcondicionado));
    }

    /* FAZER OS SETS DE CADA CATEGORIA DE CARRO E DO GERAL (VEICULO) */


}