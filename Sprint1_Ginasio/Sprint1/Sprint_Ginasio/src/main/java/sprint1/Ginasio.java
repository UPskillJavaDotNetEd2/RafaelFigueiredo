package sprint1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A classe Ginasio representa um ginásio.
 * Contém os atributos nome, morada e um ArrayList para armazenar as pessoas que frequentam o ginásio.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */

public class Ginasio implements Comparable <Pessoa> {
    /**
     * O nome do ginásio
     */
    private String nome;
    /**
     * A morada do ginásio
     */
    private String morada;
    /**
     * ArrayList do tipo List que armazena as pessoas que frequentam o ginásio
     */
    private List<Pessoa> pessoas;
    /**
     * O nome do ginásio por omissão
     */
    private static final String NOME_POR_OMISSAO = "sem nome";
    /**
     * A morada do ginásio por omissão
     */
    private static final String MORADA_POR_OMISSAO = "sem morada";
    /**
     * Constrói uma instância Ginasio que recebe o nome, a morada e um
     * ArrayList do tipo List que armazena as pessoas do ginásio
     *
     * @param nome o nome do ginásio
     * @param morada a morada do ginásio
     * @param pessoas o ArrayList tipo List das pessoas do ginásio
     */
    public Ginasio(String nome, String morada, List<Pessoa> pessoas) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }

        if (morada == null || morada.isEmpty()) {
            throw new IllegalArgumentException("A morada não pode ser nula ou vazia.");
        }

        this.nome = nome;
        this.morada = morada;
        this.pessoas = pessoas;
    }
    /**
     * Constrói uma instância Ginasio que recebe o nome e a morada.
     *
     * @param nome o nome do ginásio
     * @param morada a morada do ginásio
     *
     */

    public Ginasio(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        pessoas = new ArrayList<>();
    }
    /**
     * Constrói uma instância Ginasio atribuindo o nome por omissão, a morada por omissão,
     * o género por omissão, e um ArrayList do tipo List por omissão
     */

    public Ginasio(){
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        pessoas = new ArrayList<>();
    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Ginasio}
     * @param outroGinasio
     */

    public Ginasio(Ginasio outroGinasio){
        this.nome = outroGinasio.nome;
        this.morada = outroGinasio.morada;
        this.pessoas = new ArrayList<>(outroGinasio.pessoas);
    }
    /**
     * Devolve o nome do ginásio.
     *
     * @return nome do ginásio
     */

    public String getNome() {
        return nome;
    }
    /**
     * Devolve a morada do ginásio.
     *
     * @return morada do ginásio
     */
    public String getMorada() {
        return morada;
    }
    /**
     * Devolve o ArrayList do tipo List de pessoas do ginásio
     *
     * @return ArrayList do tipo List de pessoas do ginásio
     */
    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }
    /**
     * Modifica o nome do ginásio.
     *
     * @param nome o nome do ginásio.
     */

    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Modifica a morada do ginásio.
     *
     * @param morada a morada do ginásio.
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    /**
     * Modifica o ArrayList do tipo List de pessoas do ginásio.
     *
     * @param pessoas ArrayList do tipo List de pessoas do ginásio
     */
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    /**
     * Devolve a descrição textual do ginásio.
     *
     * @return caraterísticas do ginásio
     */

    @Override
    public String toString(){
        return String.format("GINÁSIO: %s%nMORADA: %s%n\n## PESSOAS QUE FREQUENTAM O GINÁSIO ## \n%n%s%n", nome, morada, listaToString());
    }

    /**
     * Converte a lista de pessoas numa string.
     *
     * @return Uma string contendo as representações de string de cada pessoa na lista,
     *         separadas por uma quebra de linha ("\n").
     */
    public String listaToString() {
        StringBuilder s = new StringBuilder();
        for (Pessoa i : this.pessoas) {
            if (i != null) {
                s.append(i.toString());
                s.append("\n");
            }
        }
        return s.toString();
    }
    /**
     * Compara este objeto Ginasio com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Ginasio.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        // Verifica se os objetos são a mesma referência

        if (this == outroObjeto) {
            return true;
        }
        // Verifica se o objeto passado por parâmetro é nulo ou não é uma instância de Ginasio

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        //Converte o objeto para a classe Ginasio

        Ginasio ginasio = (Ginasio) outroObjeto;
        //Compara os atributos de instância da classe Ginasio

        return this.nome.equalsIgnoreCase(ginasio.nome) && this.morada.equalsIgnoreCase(ginasio.morada) && this.pessoas.equals(ginasio.pessoas); //**
    }
    /**
     * Compara esta Pessoa com outra Pessoa que passa por parâmetro,
     * com base nos seus nomes, ignorando diferenças de maiúsculas e minúsculas.
     *
     * @param outraPessoa A outra Pessoa a ser comparada com esta.
     * @return Um valor negativo, -1, se o nome desta Pessoa for lexicograficamente menor que o nome da outra Pessoa,
     *         um valor positivo, 1, se o nome desta Pessoa for lexicograficamente maior,
     *         zero, 0, se os nomes forem iguais.
     */

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareToIgnoreCase(outraPessoa.getNome());
    }

    /**
     * Lista as pessoas presentes no contentor.
     * Pessoas nulas na contentor são ignoradas durante a listagem.
     */

    private void listarPessoas(){
        for(Pessoa pessoa : pessoas){
            if(pessoa != null) {
                System.out.println(pessoa);
            }
        }
    }

    /**
     * Adiciona uma nova pessoa ao contentor.
     *
     * @param novaPessoa A pessoa a ser adicionada ao contentor.
     */


    /**
     * Verifica se a pessoa já existe na lista. Se não existir, adiciona.
     *
     * @param pessoa A pessoa a ser adicionada, se não existir.
     * @return true se a pessoa foi adicionada, false se já existia na lista.
     */
    public boolean adicionarPessoa(Pessoa pessoa) {
        if (!pessoas.contains(pessoa)) {
            pessoas.add(pessoa);
            return true; // Pessoa adicionada com sucesso
        } else {
            return false; // Pessoa já existe na lista
        }
    }

    /**
     * Ordena as pessoas presentes no contentor por ordem alfabética (com base nos nomes)
     * e imprime uma lista.
    */

    public void pessoasOrdemAlfab(){
      //Ordena o contentor de pessoas por ordem alfabética

      Collections.sort(pessoas);
      //Lista as pessoas após a ordenação

      listarPessoas();
    }

    /**
     * Mostra os clientes presentes no contentor ordenados
     * por ordem crescente de IMC (Índice de Massa Corporal).
     *
     */

    public void mostrarClientesPorOrdemIMC() {
        // Cria um critério do tipo CrescImc para ordenar os clientes por ordem crescente de IMC

        CrescImc ordem = new CrescImc();
        //Lista para armazenar os clientes presentes no contentor

        List<Cliente> clientes = new ArrayList<>();
        //Filtra os clientes do contentor
        for (Pessoa p : pessoas) {
            if (p instanceof Cliente) {
                clientes.add((Cliente) p);
            }
        }
        //Ordena os clientes com base no critério criado

        Collections.sort(clientes, ordem);
        //Imprime o toString dos clientes após a ordenação

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    /**
     * Conta o número de clientes presentes no contentor.
     *
     * @return O número de clientes presentes na contentor.
     */

    public int contarClientes() {
        //Inicializa o contador

        int contador = 0;
        //Itera sobre as pessoas no contentor

        for (Pessoa pessoa : pessoas) {
            //Verifica se a pessoa é uma instância de Cliente

            if (pessoa instanceof Cliente) {
                //Incrementa o contador se a pessoa for um Cliente

                contador++;
            }
        }
        //Retorna o número de clientes contados

        return contador;
    }
    /**
     * Mostra os clientes regulares ativos presentes no contentor, ordenados por pagamento por ordem decrescente,
     * imprimindo toString desses clientes regulares ativos
     */

    public void clientesAtivos() {
        // Criação de um critério do tipo DecrescPagReg para ordenar os clientes
        // por pagamento por ordem decrescente

        DecrescPagReg ordem = new DecrescPagReg();
        // Lista para armazenar os clientes regulares ativos presentes no contentor

        List<Cliente> clientes = new ArrayList<>();

        // Filtra os clientes regulares ativos do contentor

        for (Pessoa p : pessoas) {
            if (p instanceof Regular) {
                if(((Regular) p).isEstado())
                     clientes.add((Cliente) p);
            }
        }
        //Ordena os clientes com base no critério ordem
        Collections.sort(clientes, ordem);
        //Imprime o toString dos clientes após a ordenação

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    /**
     * Calcula e imprime a média do Índice de Massa Corporal (IMC) para os géneros masculino e feminino,
     * considerando apenas os clientes presentes no contentor.
     */
    public void calcularMediaIMC() {

     // Inicializa as variáveis para a contagem de pessoas do
     // género masculino (countMasculino) e do género feminino (countFeminino)
     // Inicializa as variáveis para a soma do imc por género masculino (somaIMCMasculino) e
     // do género feminino (somaIMCFeminino)

        int countMasculino = 0;
        int countFeminino = 0;
        double somaIMCMasculino = 0;
        double somaIMCFeminino = 0;


         // Itera sobre as pessoas no contentor

        for (Pessoa pessoa : pessoas) {

             // Verifica se a pessoa é um Cliente

            if (pessoa instanceof Cliente) {

                 // Calcula o IMC da pessoa

                double imc = ((Cliente) pessoa).calcularIMC();

                 // Obtém o género da pessoa

                Genero genero = pessoa.getGenero();

                 // Atualiza a soma do IMC e a contagem com base no género da pessoa

                if (genero == Genero.MASCULINO) {
                    somaIMCMasculino += imc;
                    countMasculino++;
                } else if (genero == Genero.FEMININO) {
                    somaIMCFeminino += imc;
                    countFeminino++;
                }
            }
        }

         // Calcula a média do IMC para os gêneros masculino e feminino

        double mediaIMCMasculino = countMasculino > 0 ? somaIMCMasculino / countMasculino : 0;
        double mediaIMCFeminino = countFeminino > 0 ? somaIMCFeminino / countFeminino : 0;

         // Imprime as médias do IMC

        System.out.format("Média do IMC para o género MASCULINO: %.2f%n", mediaIMCMasculino);
        System.out.format("Média do IMC para o género FEMININO: %.2f%n", mediaIMCFeminino);
    }

    /**
     * Calcula e imprime o valor total a pagar por diferentes categorias de clientes
     * (regulares, convidados e esporádicos), bem como o valor total a pagar por todos os clientes.
     */
    public void calcularPagamentoClientes() {
        // Inicializa as variáveis para armazenar os valores totais de pagamento
        // por categoria e o valor total a pagar

        double totalPagar = 0;
        double totalPagarClientesRegulares = 0;
        double totalPagarClientesConvidados = 0;
        double totalPagarClientesEsporadicos = 0;


         // Itera sobre as pessoas no contentor

        for (Pessoa pessoa : pessoas) {

             // Verifica se a pessoa é um Cliente

            if (pessoa instanceof Cliente) {

                 // Calcula o pagamento do cliente

                double pagamento = ((Cliente) pessoa).calcularPagamento();

                 // Atualiza o valor total a pagar por todos os clientes

                totalPagar += pagamento;

                 // Verifica se a pessoa é um Cliente Regular

                if (pessoa instanceof Regular) {

                     // Atualiza o valor a pagar pelo Cliente Regular

                    totalPagarClientesRegulares += pagamento;

                     // Verifica se a pessoa é um Cliente Convidado

                } else if (pessoa instanceof Convidado) {

                     // Atualiza o valor a pagar pelo Cliente Convidado

                    totalPagarClientesConvidados += pagamento;

                     // Verifica se a pessoa é um Cliente Esporádico

                }else if (pessoa instanceof Esporadico){

                     // Atualiza o valor a pagar pelo Cliente Esporádico

                    totalPagarClientesEsporadicos +=pagamento;
                }

                 // Imprime o valor a pagar para cada cliente

                System.out.printf("Nome: %s%nValor a pagar: %.2f€%n\n",pessoa.getNome(), pagamento);
            }
        }

         // Imprime os totais por categoria e o valor total a pagar

        System.out.printf("Total a pagar por clientes regulares: %.2f€%n", totalPagarClientesRegulares);
        System.out.printf("Total a pagar por clientes ocasionais: %.2f€%n", totalPagarClientesConvidados);
        System.out.printf("Total a pagar por clientes esporadicos: %.2f€%n", totalPagarClientesEsporadicos);
        System.out.printf("Total a pagar por todos os clientes: %.2f€%n", totalPagar);
    }

    /**
     * Lista e imprime informações específicas dos treinadores presentes na contentor, incluindo o nome, a idade,
     * o número de sessões como Personal Trainer e o vencimento no final do mês.
     */
    public void listarTreinadores() {

         // Itera sobre as pessoas no contentor

        for (Pessoa pessoa : pessoas) {

             // Verifica se a pessoa é um Treinador

            if (pessoa instanceof Treinador) {

                 // Converte a pessoa para a classe Treinador

                Treinador treinador = (Treinador) pessoa;

                 // Imprime informações específicas do treinador

                System.out.printf("Nome: %s%n", treinador.getNome());
                System.out.printf("Idade: %d%n", treinador.calcularIdade());
                System.out.printf("Número de sessões como Personal Trainer: %d%n", treinador.getSessoesPersonalTrainer());
                System.out.printf("Vencimento no final do mês: %.2f€%n%n", treinador.calcularVencimento()); // Assumindo que há um método calcularVencimento() na classe Treinador

            }
        }
    }

    /**
     * Calcula e retorna o total acumulado dos vencimentos de todos os treinadores presentes no contentor.
     *
     * @return O total acumulado dos vencimentos dos treinadores.
     */
    public double vencimentoTreinadores() {

         // Inicializa a variável para armazenar o total acumulado dos vencimentos dos treinadores

        double acumuladoT = 0;

         // Itera sobre as pessoas no contentor

        for(Pessoa pessoa : pessoas) {

             // Verifica se a pessoa é um Treinador

            if (pessoa instanceof Treinador) {

                 // Adiciona o vencimento do treinador ao total acumulado

                acumuladoT += ((Treinador) pessoa).calcularVencimento();
            }
        }

         // Retorna o total acumulado dos vencimentos dos treinadores

        return acumuladoT;
    }

    /**
     * Calcula e retorna o total acumulado dos vencimentos de todos os funcionários presentes no contentor.
     *
     * @return O total acumulado dos vencimentos dos funcionários.
     */
    public double vencimentoFuncionarios() {

         // Inicializa a variável para armazenar o total acumulado dos vencimentos dos funcionários

        double acumuladoF = 0;

         // Itera sobre as pessoas no contentor

        for(Pessoa pessoa : pessoas) {

             // Verifica se a pessoa é um Funcionário

            if (pessoa instanceof Funcionario) {

                 // Adiciona o vencimento do funcionário ao total acumulado

                acumuladoF += ((Funcionario) pessoa).calcularVencimento();
            }
        }

         // Retorna o total acumulado dos vencimentos dos treinadores

        return acumuladoF;
    }

    /**
     * Calcula e apresenta o saldo do ginásio, considerando as receitas dos clientes,
     * os custos com funcionários e os custos com treinadores.
     */

    public void calcularEApresentarSaldo() {

         // Inicializa as variáveis que vão armazenar as receitas dos clientes,
         // custos com funcionários e custos com treinadores

        double receitasClientes = 0;
        double custosFuncionarios = 0;
        double custosTreinadores = 0;

         // Itera sobre as pessoas no contentor

        for (Pessoa pessoa : pessoas) {

             // Verifica o tipo de pessoa e acumula as receitas ou custos correspondentes

            if (pessoa instanceof Cliente) {
                receitasClientes += ((Cliente) pessoa).calcularPagamento();
            } else if (pessoa instanceof Funcionario) {
                custosFuncionarios += ((Funcionario) pessoa).calcularVencimento();
            } else if (pessoa instanceof Treinador) {
                custosTreinadores += ((Treinador) pessoa).calcularVencimento();
            }
        }

         // Calcula o saldo do ginásio

        double saldo = receitasClientes - (custosFuncionarios + custosTreinadores);

        System.out.printf("Receitas dos clientes: %.2f€%n", receitasClientes);
        System.out.printf("Custos com funcionários: %.2f€%n", custosFuncionarios);
        System.out.printf("Custos com treinadores: %.2f€%n", custosTreinadores);
        System.out.printf("Saldo do ginásio: %.2f€%n", saldo);
    }
}
