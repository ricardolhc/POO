# Universidade Federal do Pampa - Unipampa
## Engenharia de Software - 2º Semestre

### Disciplina de Programação Orientada a Objetos
### Atividade Prática em Grupo 1 (AG1) 

**PROPOSTA:**

A atividade prática em grupo 1 aborda os seguintes assuntos: classes, objetos, classes abstratas, herança, polimorfismo, interface e pacotes.

**INTEGRANTES:**
* [Mateus Coelho Vitória](https://github.com/M4t3usC0)
* [Mauricio Lamberti da Silva Beutler](https://github.com/Beutler28)  
* [Ricardo Luiz Hentges Costa](https://github.com/ricardolhc)
* [Tales Schifelbein Soares](https://github.com/talessoares) 

**ENUNCIADO:**
<br>
O aluguel de automóveis no Brasil tem uma história recente. Começou na década de 1950, após a indústria automobilística ter sido impulsionada pelo Plano de Metas de Juscelino Kubitschek. Os primeiros negócios surgiram na região central de São Paulo, onde alguns empresários de revendas de carros usados começaram a alugar os automóveis como atividade suplementar. Em 1956, foi fundada a primeira empresa criada exclusivamente com a finalidade de alugar carros. A partir dessa iniciativa pioneira, surgiram outras locadoras. Na metade da década de 1960, a atividade teve um grande impulso, ao importar a experiência norte-americana, necessária na época, e começou a se profissionalizar rapidamente. O perfil da locação deixou de ser exclusivamente transitório, para incluir contratos feitos com empresas que utilizavam frotas, o que deu início ao aluguel a longo prazo. [Fonte](http://www.abla.com.br/beneficios-aos-associados/) <br>
Neste contexto, propõem-se a simulação do funcionamento de uma locadora de veículos. O programa desenvolvido deverá estar de acordo com os seguintes requisitos e especificações.

1. A locadora trabalha com o aluguel de veículos, onde cada veículo tem, no mínimo, os seguintes dados: placa, ano e valor da diária. Carro, ônibus e caminhão são tipos de veículos que atualmente podem ser locados. Além dos atributos comuns de todos os veículos, cada tipo possui um conjunto extra de dados:

| **Tipo De Veículo** | **Dados extras**                                                                                                                              |
|:-------------------:|-----------------------------------------------------------------------------------------------------------------------------------------------|
|        Carro        | número de passageiros, número de portas, média de quilômetros por litro e ar-condicionado (sim ou não).                                       |
|        Ônibus       | número de passageiros, categoria (leito, executivo ou convencional), serviço de internet sem fio (sim ou não) e ar-condicionado (sim ou não). |
|       Caminhão      | número de eixos e carga máxima.                                                                                                               |                                             |

2. A relação de todos os veículos para locação, assim como os métodos para incluir, alterar e capturar os dados de um ou mais veículos devem ser implementados por uma classe A de processamento que implementa a interface IVeiculos (disponível no Moodle). A interação entre o usuário e essa classe A deve ser implementada por uma classe de interface console ou gráfica B.
3. Para realizar uma locação de veículo, um Cliente deve ser previamente cadastrado. Um Cliente deve informar os seguintes dados: nome, CPF, número da carteira de motorista, endereço e telefone.
4. A relação de todos os clientes, assim como os métodos para incluir, alterar e capturar os dados de um ou mais clientes devem ser implementados por uma classe C de processamento que implementa a interface IClientes (disponível no Moodle). A interação entre o usuário e essa classe C deve ser implementada por uma classe de interface console ou gráfica D.
5. Uma locação de veículo deve conter os seguintes dados: código da locação (que deve ser único), Cliente, Veiculo, seguro (sim ou não), data inicial e data final.
6. A relação de todas as locações, assim como os métodos para incluir, alterar e capturar os dados de uma ou mais locações devem ser implementados por uma classe E de processamento que implementa a interface ILocacoes (disponível no Moodle). A interação entre o usuário e essa classe E deve ser implementada por uma classe de interface console ou gráfica F.
7. Há inúmeras maneiras de simular o funcionamento da locadora de veículos. Utilizem a criatividade para usar as interfaces console ou gráfica implementadas pelas classes B, D e F.
8. Divida a sua aplicação em, pelo menos, dois pacotes.
9. Utilize o javadoc e faça comentários pertinentes no código.

**Cabe ressaltar que A, B, C, D, E e F são nomes fictícios de classes e devem ser
substituídos por nome de classes adequados ao comportamento das mesmas.**


**Cronograma**
<br>
13/10 - Enunciado, indicação dos grupos
<br>
17/10 - Acompanhamento 1 (25%): por grupo (Classes Cliente, Veiculo, Carro, Onibus, Caminhao e Locacao);
<br>
20/10 - Tira dúvidas
<br>
24/10 - Semana acadêmica
<br>
27/10 - Semana acadêmica
<br>
31/10 - Acompanhamento 2 (25%): por grupo (Classes relação de todos os clientes, relação de todas as locações)
<br>
03/11 - Atividade Individual 1 (AI1)
<br>
07/11 - Entrega até às 18:00. Apresentação para a professora (50%)

A frequência nessas aulas será mensurada pela participação nos acompanhamentos e entrega de atividades no MOODLE. Atenção: o trabalho é em grupo, mas a avaliação é individual. Portanto, todos devem demonstrar domínio sobre aquilo que foi desenvolvido pelo grupo.

**Grupo**<br>
O grupo deve ser composto por quatro integrantes.

**Acompanhamento**<br>
Cada grupo apresentará para a professora o software produzido até o momento, explicando o processo de desenvolvimento do código e tirando dúvidas.

**Apresentação**<br>
Cada grupo realizará uma apresentação do software produzido para a professora, explicando o processo de desenvolvimento do código e tirando dúvidas da professora. Adicionalmente a professora irá analisar partes de código escolhidas aleatoriamente.

**Avaliação**<br>
O AG1 vale 10 pontos e tem peso igual a 10% na nota final do componente curricular. Para receber a nota, o resultado final da atividade deve ser apresentado para a professora no dia 07/11/2022.

**Pontuação**<br>
Classes referentes aos veículos, cliente e locação [3 pontos]<br>
Classe referente a coleção de veículos [2 pontos]<br>
Classe referente à coleção de clientes [1 pontos]<br>
Classe referente à coleção de locações [2 pontos]<br>
Interface com o usuário que permita gerenciar a locadora de veículos [2 pontos]

**Todo o sistema deve observar os conceitos da orientação a objetos.**