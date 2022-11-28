/**
 * A classe MenuVeiculo modela o menu para cadastro, busca e modificação de informações do veiculo.
 * @author Mateus, Maurício, Ricardo, Tales
 * @since nov 2022
 * @version 1.0
 */

package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import controlelista.ListaVeiculos;
import veiculo.*;

public class MenuVeiculo {
    
    /**
     * O atributo listaVeiculos, do tipo ListaVeiculos, e utilizado para indentificar a lista de veiculos
     */
    private ListaVeiculos listaVeiculos;

    private Scanner input;


    /**
     * Construtor default da classe MenuVeiculo<br>
     * <b>Uso: </b>
     * MenuVeiculo menuVeiculo = new MenuVeiculo(listaVeiculos);<br><br>
     * @param listaVeiculos ListaVeiculos que identifica a lista de veiculos
     */
    public MenuVeiculo(ListaVeiculos listaVeiculos, Scanner input) {
        this.input = input;
        this.listaVeiculos = listaVeiculos;
    }


    /** 
     * Verifica se possui veículos na listaVeiculos, caso possua imprime uma lista com as informações de todos os veículos.
     */
    public void imprimirInfoVeiculos() {
        try {
            System.out.println("\n====== INFORMAÇÕES DE TODOS OS VEICULOS ======");
            System.out.println(listaVeiculos.getInfo());
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /** 
     * Recebe uma placa, verifica se ela existe na listaVeiculos e caso possua imprime as informações do veículo.
     */
    public void getInformacaoVeiculo() {
        String placa = null;

        input.nextLine();

        System.out.print("\nDigite a placa que se deseja obter as informaçôes: ");
        placa = input.nextLine();

        if(listaVeiculos.existe(placa)) {
            System.out.println("\n====== INFORMAÇÕES DO VEICULO ======");
            System.out.println(listaVeiculos.getInfo(placa));
        } else {
            System.out.println("Veiculo não existente!");
        }
    }

    /** 
     * Verifica se possui veículos na listaVeiculos, caso possua imprime uma lista com as informções da placa, diária e ano.
     */
    public void imprimirResumoVeiculos() {

        try {
            System.out.println("\n====== RESUMO DAS INFORMAÇÕES DE TODOS OS VEICULOS ======");
            System.out.println(listaVeiculos.getResumoInfo());
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    /** 
     * Recebe uma placa e verifica se a placa já existe no sistema;
     * Recebe um ano e verifica se o ano é válido;
     * Recebe uma diária e verifica se a diária é valida;
     * Logo em seguida, pede qual veículo será adicionado e encaminha para o menu de sua escolha.
     */
    public void adicionaVeiculo() {
        String placa = null;
        double diaria = 0.0;
        int modeloCarro = 0;
        int ano = 0;
        
        input.nextLine();

        do {
            System.out.print("\nDigite a placa do veiculo: ");
            placa = input.nextLine();

            if(placa == null) {
                System.out.println("Placa inválida!");
            } else {
                if(listaVeiculos.existe(placa)) {
                    System.out.println("A placa já está adicionada no sistema!");
                }
            }
        } while(placa == null || listaVeiculos.existe(placa));

        do {
            ano = lerInteiro("Digite o ano do veiculo: ");

            if(ano <= 0) {
                System.out.println("Ano inválido!");
            }
        } while (ano <= 0);

        do {
            diaria = lerDouble("Digite a diaria do veiculo: ");

            if(diaria <= 0) {
                System.out.println("Valor da diária inválido");
            }
        } while (diaria <= 0);

        do {

            String menu = "1) Ônibus\n" + 
                          "2) Carro\n" +
                          "3) Caminhão\n" +
                          "Digite o modelo do veículo: ";

            modeloCarro = lerInteiro(menu);

            input.nextLine();

            if(modeloCarro >= 1 && modeloCarro <= 3) {

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

     /** 
     * Recebe uma quantidade de passageiros e verifica se a quantidade é válida;
     * Recebe uma quantidade de portas e verifica se a quantidade é válida;
     * Recebe uma média de KM'S e verifica se a média é válida;
     * Recebe se o carro possui ar-condicionado e verifica se a resposta é válida;
     * @param placa 
     * @param ano
     * @param diaria 
     */
    public void cadastrarCarro(String placa, int ano, double diaria) {
        
        int numeroPassageiros = 0;
        int numeroPortas = 0;
        double mediaKM = 0.0;
        boolean arcondicionado = false;

        int escolha = 0;

        do {
            numeroPassageiros = lerInteiro("Digite a quantidade de passageiros: ");

            if (numeroPassageiros <= 0 || numeroPassageiros > 5){
                System.out.println("Número de passageiros inválido!");
            }
        } while (numeroPassageiros <= 0 || numeroPassageiros > 5);

        do {
            numeroPortas = lerInteiro("Digite a quantidade de portas: ");

            if(numeroPortas <= 0 || numeroPortas > 4){
                System.out.println("Número de portas inválido!");
            }
        } while (numeroPortas <=0 || numeroPortas > 4);

        do {
            mediaKM = lerDouble("Digite a media de KM por litro: ");

            if (mediaKM <=0){
                System.out.println("Média de KM inválida!");
            }
        } while (mediaKM <= 0);

        do {
            String menu = "Possui Ar-Condicionado?\n" +
                          "1) Sim\n" +
                          "2) Não\n" +
                          "Opção: ";
                          
            escolha = lerInteiro(menu);

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
        System.out.println("Carro adicionado com sucesso");
    }


    /** 
     * Recebe uma quantidade de eixos e verifica se a quantidade é válida;
     * Recebe uma carga máxima e verifica se a carga é válida.
     * @param placa 
     * @param ano
     * @param diaria 
     */
    public void cadastrarCaminhao(String placa, int ano, double diaria) {

        int numeroEixos = 0;
        int cargaMaxima = 0;

        do {
            numeroEixos = lerInteiro("Digite o numero de eixos: ");
            if(numeroEixos <= 0 || numeroEixos > 10) {
                System.out.println("Número de eixos inválido!");
            }
        } while(numeroEixos <= 0 || numeroEixos > 10);

        do {
            cargaMaxima = lerInteiro("Digite a carga máxima: ");

            if(cargaMaxima <= 0 || cargaMaxima > 100000) {
                System.out.println("Carga máxima inválida!");
            }
        } while(cargaMaxima <= 0 || cargaMaxima > 100000);
        
        listaVeiculos.add(new Caminhao(placa, ano, diaria, numeroEixos, cargaMaxima));
        System.out.println("Caminhão adicionado com sucesso");
    }

    /** 
     * Recebe uma quantidade de passageiros e verifica se a quantidade é válida;
     * Recebe se o ônibus possui wifi e verifica se a resposta é válida;
     * Recebe se o ônibus possui ar-condicionado e verifica se a resposta é válida;
     * Recebe a categoria do assento e verifica se a resposta é válida;
     * Caso passar por todos verificações adiciona um ônibus.
     * @param placa 
     * @param ano
     * @param diaria 
     */
    public void cadastrarOnibus(String placa, int ano, double diaria) {

        int numeroPassageiros = 0;
        Categoria categoria = Categoria.CONVENCIONAL;
        boolean wifi = false;
        boolean arcondicionado = false;

        int escolha = 0;

        do{
            numeroPassageiros = lerInteiro("Digite a quantidade de passageiros: ");

            if (numeroPassageiros <= 0 || numeroPassageiros > 61){
                System.out.println("Número de passageiros inválido!");
            }
        } while (numeroPassageiros <= 0 || numeroPassageiros > 61);

        do {
            
            String menu = "Possui Wifi?\n" +
                          "1) Sim\n" +
                          "2) Não\n" +
                          "Opção: ";

            escolha = lerInteiro(menu);

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

            String menu = "Possui Ar-Condicionado?\n" +
                          "1) Sim\n" +
                          "2) Não\n" +
                          "Opção: ";
        
            escolha = lerInteiro(menu);

            if(escolha < 1 || escolha > 2) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    arcondicionado = true;
                } else if(escolha == 2) {
                    arcondicionado = false;
                }
            }
        } while(escolha < 1 || escolha > 2);

        do {
            String menu = "Categorias: \n" + 
                          "1) Leito\n" +
                          "2) Convencional\n" +
                          "3) Executivo\n" +
                          "Opção: ";
            
            escolha = lerInteiro(menu);

            if(escolha < 1 || escolha > 3) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    categoria = Categoria.LEITO;
                } else if(escolha == 2) {
                    categoria = Categoria.CONVENCIONAL;
                } else if(escolha == 3) {
                    categoria = Categoria.EXECUTIVO;
                }
            }
        } while(escolha < 1 || escolha > 3);

        listaVeiculos.add(new Onibus(placa, ano, diaria, numeroPassageiros, categoria, wifi, arcondicionado));
        System.out.println("Ônibus adicionado com sucesso");
    }

    
    /** 
     * Recebe um novo ano e altera;
     * @param placa 
     */
    public void alteraAno(String placa) {
        int ano = 0;

        System.out.print("Digite o novo ano: ");
        ano = lerInteiro();
        listaVeiculos.setAno(placa, ano);
        System.out.println("Ano alterado com sucesso!");
    }

    
    /** 
     * Recebe uma nova diária e altera;
     * @param placa 
     */
    public void alteraDiaria(String placa) {
        double diaria = 0.0;

        diaria = lerDouble("Digite a nova diaria: ");
        listaVeiculos.setDiaria(placa, diaria);
        System.out.println("Diaria alterada com sucesso!");
    }

    /* FAZER OS SETS DE CADA CATEGORIA DE VEICULO */

    /* ALTERA DO CARRO */

    /** 
     * Recebe um novo número de passageiros e altera;
     * @param placa 
     */
    public void alteraNumeroPassageiroCarro(String placa) {
        int numeroPasseiros = 0;

        System.out.print("Digite o novo número de passageiros: ");
        numeroPasseiros = lerInteiro();

        if(numeroPasseiros <= 0 || numeroPasseiros > 5) {
            System.out.println("Número de passageiros inválido!");
        } else {
            listaVeiculos.setNumeroPassageiroCarro(placa, numeroPasseiros);
            System.out.println("Número de passageiros alterado com sucesso!");
        }             
            
    }

    /** 
     * Recebe um novo número de portas e altera;
     * @param placa 
     */
    public void alteraNumeroPortaCarro(String placa) {
        int numeroPortas = 0;

        System.out.print("Digite o novo número de portas: ");
        numeroPortas = lerInteiro();
                
        if(numeroPortas <= 0 || numeroPortas > 5) {
            System.out.println("Número de portas inválido!");
        } else {
            listaVeiculos.setNumeroPortaCarro(placa, numeroPortas);
            System.out.print("Número de portas alterado com sucesso!");
        }
    }

    /** 
     * Recebe uma nova média de KM's e altera;
     * @param placa 
     */
    public void alteraMediaKmCarro(String placa) {
        double mediaKm = 0.0;
        
        mediaKm = lerDouble("Digite a nova media de km: ");

        if(mediaKm <= 0){
            System.out.println("A media de km não pode ser negativa!");
        } else {
            listaVeiculos.setMediaKMCarro(placa, mediaKm);         
            System.out.println("Média de KM'S alterada com sucesso!");  
        }
    }

    /** 
     * Recebe uma nova atribuição para o ar-condicionado e altera;
     * @param placa 
     */
    public void alteraArCondicionadoCarro(String placa) {
        int escolha = 0;
        boolean arcondicionado = false;

        do {

            String menu = "Seu carro possui ar-condicionado?"
                        + "1) Sim\n"
                        + "2) Não\n"
                        + "Opção: ";
            
            escolha = lerInteiro(menu);

            if(escolha < 1 || escolha > 2) {
                System.out.println("Opção inválida!");
            } else {
                if(escolha == 1)  {
                    arcondicionado = true;
                } else if(escolha == 2) {
                    arcondicionado = false;
                }
                listaVeiculos.setArcondicionadoCarro(placa, arcondicionado);
                System.out.println("Ar-condicionado alterado com sucesso!");
            }
        } while(escolha < 1 || escolha > 2);
    }

    /* ALTERA DO ONIBUS  */
    
    /** 
     * Recebe um novo número de passageiros e altera;
     * @param placa 
     */
    public void alteraNumeroPassageiroOnibus(String placa) {
        int numeroPassageiros = 0;
        
        System.out.print("Digite o novo número de passageiros: ");
        numeroPassageiros = lerInteiro();
        listaVeiculos.setNumeroPassageiroOnibus(placa, numeroPassageiros);
        System.out.println("Número de passageiros alterado com sucesso!");
            
    }
     /** 
     * Recebe uma nova categoria de assento e altera;
     * @param placa 
     */
    public void alteraCategoriaOnibus(String placa) {
        int escolha = 0;
        Categoria categoria = Categoria.CONVENCIONAL;
        
        do {
            String menu = "Qual a nova categoria do ônibus?"
                          + "1) Leito \n" 
                          + "2) Convencional \n" 
                          + "3) Executivo \n" 
                          +  "Opção: ";
    
            escolha = lerInteiro(menu);

            if(escolha < 1 || escolha > 3) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    categoria = Categoria.LEITO;
                } else if(escolha == 2) {
                    categoria = Categoria.CONVENCIONAL;
                } else if(escolha == 3) {
                    categoria = Categoria.EXECUTIVO;
                }
                listaVeiculos.setCategoriaOnibus(placa, categoria);
                System.out.println("Categoria alterada com sucesso");
            }
        } while(escolha < 1 || escolha > 2);
            
    }

   
    /** 
     * Recebe uma nova atribuição para o wifi e altera;
     * @param placa 
     */
    public void alteraWifiOnibus(String placa) {
        int escolha = 0;
        boolean wifi = false;

        do {
            
             String menu = "Possui wifi? \n" + 
                          "1) Sim \n" +
                          "2) Não \n" +
                          "Opção: ";

            escolha = lerInteiro(menu);

            if(escolha < 1 || escolha > 2) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    wifi = true;
                } else {
                    wifi = false;
                }
                listaVeiculos.setWifiOnibus(placa, wifi);
                System.out.println("Wifi alterado com sucesso");
            }
        } while(escolha < 1 || escolha > 2);  
    }
        
    /** 
     * Recebe uma nova atribuição para o ar-condicionado e altera;
     * @param placa 
     */
    public void alteraArCondicionadoOnibus(String placa) {
        int escolha = 0;
        boolean arcondicionado = false;

        do {

            String menu = "Possui ar condicionado?\n" +
                            "1) Sim \n" +
                            "2) Não \n" +
                            "Opção: ";
        
            escolha = lerInteiro(menu);

            if(escolha < 1 || escolha > 2) {
                System.out.println("Escolha inválida!");
            } else {
                if(escolha == 1) {
                    arcondicionado = true;
                } else {
                    arcondicionado = false;
                }
                listaVeiculos.setArcondicionadoOnibus(placa, arcondicionado);
                System.out.println("Ar-condicionado alterado com sucesso");
            }
        } while(escolha < 1 || escolha > 2);       
    }

    /* ALTERA DO CAMINHAO */

    /** 
     * Recebe um novo número de eixos e altera;
     * @param placa 
     */
    public void alteraEixoCaminhao(String placa) {
        int numeroEixos = 0;
        
        numeroEixos = lerInteiro("Digite o novo número de eixos: ");

        if (numeroEixos > 1 || numeroEixos > 10) {
            listaVeiculos.setNumeroEixoCaminhao(placa, numeroEixos);
            System.out.println("Número de eixos alterado com sucesso");
        } else {
            System.out.println("Número de eixos inválido!");
        }
            
    }

    /** 
     * Recebe uma nova carga máxima e altera;
     * @param placa 
     */
    public void alteraCargaMaximaCaminhao(String placa) {
        int cargaMaxima = 0;
        
        cargaMaxima = lerInteiro("Digite a carga máxima: ");

        if(cargaMaxima <= 0 || cargaMaxima > 100000) {
            System.out.println("Carga máxima inválida!");
        }
    }

    /** 
     * Recebe uma placa e verifica se ela existe;
     * Caso exista é removido, se não é informado que a placa do véiculo não existe.
     */
    public void removerVeiculo() {
        String placa = null;

        input.nextLine();

        System.out.print("\nA placa do veiculo que deseja remover: ");
        placa = input.nextLine();

        if(listaVeiculos.remove(placa)) {
            System.out.println("Veículo removido com sucesso!");
        }
    }

    /** 
     * Recebe uma placa e verifica se ela existe;
     * Se ela existir retorna a placa.
     * @return String
     */
    public String receberPlaca() {
        String placa = null;

        input.nextLine();
    
        System.out.print("\nDigite a placa do veiculo que deseja alterar: ");
        placa = input.nextLine();
    
        if(listaVeiculos.existe(placa)) {
            return placa;
        }
    
        throw new IllegalArgumentException("A placa do veículo não existe");
    }

    public int receberTipo(String placa) {
        try {
            Veiculo veiculo = listaVeiculos.get(placa);

            if(veiculo instanceof Carro) {
                return 1;
            } else if(veiculo instanceof Caminhao) {
                return 2;
            } else if(veiculo instanceof Onibus) {
                return 3;
            }
            return 0;
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
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
    
    private int lerInteiro() {
        return lerInteiro("");
    }
    
    private double lerDouble(String mensagem) {
        boolean flag = true;
        double numero = 0;

        do {
            try {
                System.out.print(mensagem);
                numero = input.nextDouble();
                flag = false;
            } catch(InputMismatchException e) {
                System.out.println("Digite um número valor decimal ou inteiro!");
                input.nextLine();
                flag = true;
            }
        } while(flag);

        return numero;
    }

}