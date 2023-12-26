package sprint1;

import org.upskill.utils.Data;
/**
 * A classe Regular representa um cliente regular de um ginásio, que estende a classe {@code Cliente}
 * e implementa a interface {@code PagamentoSessoesPT}.
 * Contém o atributo custo da Mensalidade, número de sessões, o custo por sessão e o estado.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public class Regular extends Cliente implements PagamentoSessoesPT{
    /**
     * O custo da Mensalidade
     */
    private double custoMensalidade;
    /**
     * O número de sessões
     */
    private int numeroSessoes;
    /**
     * O custo por sessão
     */
    private double custoPorSessao;
    /**
     * O estado
     */
    private boolean estado;
    /**
     * O valor por omissão do custo da mensalidade.
     */
    private static final int CUSTO_MENSALIDADE_POR_OMISSAO = -1;
    /**
     * O valor por omissão do número de sessões.
     */
    private static final int NUMERO_SESSOES_POR_OMISSAO = -1;
    /**
     * O valor por omissão do custo por sessão.
     */
    private static final  int CUSTO_SESSAO_POR_OMISSAO = -1;
    /**
     * O estado por omissão.
     */
    private static final boolean ESTADO_POR_OMISSAO = true;
    /**
     * O preço das primeiras aulas de hidroginástica aplicado a todos os Regulares.
     */
    private static int precoPrimeirasAulasHidro = 5;
    /**
     * As primeiras aulas de hidroginástica aplicado a todos os Regulares.
     */
    private static int primeirasAulasHidro = 3;
    /**
     * O preço das restantes aulas de hidroginástica aplicado a todos os Regulares.
     */
    private static int precoRestantesAulasHidro =3;
    /**
     * O contador do numero de instâncias do tipo Regular.
     */
    private static int contador = 0;
    /**
     * Constrói uma instância Regular que recebe o identificador, o nome, a morada,
     * o genero, a data de nascimento, a altura, o peso, o número de aulas, o número
     * de aulas de hidroginástica, o custo da mensalidade, o número de sessões, o custo por sessão,
     * o estado
     *
     * @param nome o nome do cliente regular
     * @param morada a morada do cliente regular
     * @param genero o genero do cliente regular
     * @param dataNascimento a data de nascimento do cliente regular
     * @param altura a altura do cliente regular
     * @param peso o peso do cliente regular
     * @param numeroAulas o número de Aulas do cliente regular
     * @param numeroAulasHidroginastica o número de aulas de hidroginástica do cliente regular
     * @param custoMensalidade o custo da Mensalidade
     * @param numeroSessoes o número de sessões
     * @param custoPorSessao o custo por sessão
     * @param estado o estado
     */
    public Regular(String nome, String morada, Genero genero, Data dataNascimento, float altura, int peso, int numeroAulas, int numeroAulasHidroginastica, double custoMensalidade, int numeroSessoes, double custoPorSessao, boolean estado ){

        super(getPrefixoCliente() + Tipo.REGULAR+"-"+(++contador),nome, morada, genero, dataNascimento, altura, peso, numeroAulas, numeroAulasHidroginastica);

        this.custoMensalidade = custoMensalidade;
        this.numeroSessoes = numeroSessoes;
        this.custoPorSessao = custoPorSessao;
        this.estado = estado;
    }
    /**
     * Constrói uma instância Regular que recebe o identificador, o nome, a morada,
     * o genero, a data de nascimento, a altura, o peso, o número de aulas, o número
     * de aulas de hidroginástica, o custo da mensalidade, o número de sessões, o custo por sessão e
     * o estado por omissão
     *
     * @param nome o nome do cliente regular
     * @param morada a morada do cliente regular
     * @param genero o genero do cliente regular
     * @param dataNascimento a data de nascimento do cliente regular
     * @param altura a altura do cliente regular
     * @param peso o peso do cliente regular
     * @param numeroAulas o número de Aulas do cliente regular
     * @param numeroAulasHidroginastica o número de aulas de hidroginástica do cliente regular
     * @param custoMensalidade o custo da Mensalidade
     * @param numeroSessoes o número de sessões
     * @param custoPorSessao o custo por sessão
     *
     */

    public Regular(String nome, String morada, Genero genero, Data dataNascimento, float altura, int peso, int numeroAulas, int numeroAulasHidroginastica, double custoMensalidade, int numeroSessoes, double custoPorSessao){

        super(getPrefixoCliente() + Tipo.REGULAR+"-"+(++contador),nome, morada, genero, dataNascimento, altura, peso, numeroAulas, numeroAulasHidroginastica);

        this.custoMensalidade = custoMensalidade;
        this.numeroSessoes = numeroSessoes;
        this.custoPorSessao = custoPorSessao;
        estado = ESTADO_POR_OMISSAO;
    }
    /**
     * Constrói uma instância Regular atribuindo o identificador, atribuindo o custo de mensalidade
     * por omissão, o número de sessões por omissão, o custo por sessão por omissão e o estado  por omissão
     */
    public Regular(){
        super(getPrefixoCliente() + Tipo.REGULAR +"-"+(++contador));

        custoMensalidade = CUSTO_MENSALIDADE_POR_OMISSAO;
        numeroSessoes = NUMERO_SESSOES_POR_OMISSAO;
        custoPorSessao = CUSTO_SESSAO_POR_OMISSAO;
        estado = ESTADO_POR_OMISSAO;
    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Regular}
     * @param outroRegular
     */
    public Regular(Regular outroRegular) {
        super(outroRegular);

        this.custoMensalidade = outroRegular.custoMensalidade;
        this.numeroSessoes = outroRegular.numeroSessoes;
        this.custoPorSessao = outroRegular.custoPorSessao;
        this.estado = outroRegular.estado;
    }
    /**
     * Devolve o custo da mensalidade
     *
     * @return custo da mensalidade
     */

    public double getCustoMensalidade() {
        return custoMensalidade;
    }
    /**
     * Devolve o número de sessões
     *
     * @return número de sessões
     */
    public int getNumeroSessoes() {
        return numeroSessoes;
    }
    /**
     * Devolve o custo por sessão
     *
     * @return custo por sessão
     */
    public double getCustoPorSessao() {
        return custoPorSessao;
    }
    /**
     * Devolve o estado
     *
     * @return estado
     */
    public boolean getEstado() {
        return estado;
    }
    /**
     * Modifica o custo da mensalidade
     *
     * @param custoMensalidade o custo da mensalidade
     */
    public void setCustoMensalidade(double custoMensalidade) {
        this.custoMensalidade = custoMensalidade;
    }
    /**
     * Modifica o Numero de Sessões
     *
     * @param numeroSessoes o número de sessões
     */
    public void setNumeroSessoes(int numeroSessoes) {this.numeroSessoes = numeroSessoes;}
    /**
     * Modifica o Custo por sessão
     *
     * @param custoPorSessao o custo por sessão
     */
    public void setCustoPorSessao(double custoPorSessao) {
        this.custoPorSessao = custoPorSessao;
    }
    /**
     * Modifica o estado
     *
     * @param estado o estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    /**
     * Devolve a descrição textual do Regular
     *
     * @return caraterísticas do regular
     */

    @Override
    public String toString() {
        return  String.format("CLIENTE REGULAR: \n%sCUSTO DA MENSALIDADE: %.2f€%nNÚMERO DE SESSÕES: %d%nCUSTO POR SESSÃO: %.2f€%nESTADO ATIVO: %s%n%nTOTAL A PAGAR ESTE MÊS: %.2f%n",super.toString(), custoMensalidade, numeroSessoes, custoPorSessao, estado, calcularPagamento());
    }
    /**
     * Compara este objeto Esporadico com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Regular.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        // Chama o método equals da superclasse (Object) para verificar igualdade
        if (!super.equals(outroObjeto)) {
            return false;
        }
        // Converte o objeto para a classe Regular
        Regular regular = (Regular) outroObjeto;
        // Compara o atributo de instância da classe Regular
        return this.custoMensalidade == regular.custoMensalidade && this.numeroSessoes == regular.numeroSessoes && this.custoPorSessao == regular.custoPorSessao && this.estado == regular.estado;
    }
    /**
     * Calcula o pagamento das aulas de hidroginástica, considerando o número de aulas frequentadas,
     *incluindo aulas de hidroginástica e o preço das mesmas.
     * @return O valor a ser pago com base na quantidade de aulas de hidroginástica frequentadas.
     */
    public double pagamentoAulasHidro(){
        double valorPagar;

        if(getNumeroAulasHidroginastica() <= primeirasAulasHidro){
            valorPagar = getNumeroAulasHidroginastica() * precoPrimeirasAulasHidro;
        }else {
            valorPagar = (getNumeroAulasHidroginastica()-primeirasAulasHidro) * precoRestantesAulasHidro + getNumeroAulasHidroginastica() * precoPrimeirasAulasHidro;
        }
        return valorPagar;
    }
    /**
     * Devolve o pagamento por parte cliente regular, considerando custo da mensalidade,
     * o pagamento de aulas de hidroginástica e o pagamento por sessões do Personal Trainer
     * @return o total a pagar
     */

    @Override
    public double calcularPagamento() {
        return custoMensalidade+pagamentoAulasHidro()+pagamentoPt();
    }
    /**
     * Devolve o pagamento das sessões com Personal Trainer por parte do cliente regular, considerando
     * o número de sessões e o custo por sessão
     * @return o total do pagamento de personal trainer
     */

    @Override
    public double pagamentoPt() {
        return numeroSessoes * custoPorSessao;
    }
    /**
     * Devolve o estado do cliente regular
     * @return o estado do cliente regular
     */

    public boolean isEstado(){
        return estado;
    }
    /**
     * Devolve o contador do número de instâncias.
     *
     * @return contador
     */

    public static int getContador() {
        return contador;
    }
    /**
     * Devolve as primeiras aulas de hidroginástica.
     *
     * @return primeiras aulas de hidroginástica
     */
    public static int getPrimeirasAulasHidro() {
        return primeirasAulasHidro;
    }
    /**
     * Devolve o preço das primeiras aulas de hidroginástica.
     *
     * @return preço das primeiras aulas de hidroginástica
     */
    public static int getPrecoPriemeirasAulasHidro() {
        return precoPrimeirasAulasHidro;
    }
    /**
     * Devolve o preço das restantes aulas de hidroginástica.
     *
     * @return preço das restantes aulas de hidroginástica
     */
    public static int getPrecoRestantesAulasHidro() {
        return precoRestantesAulasHidro;
    }
    /**
     * Modifica o número das primeiras aulas de hidroginástica
     *
     * @param primeirasAulasHidro as primeiras aulas de hidroginástica
     */

    public static void setPrimeirasAulasHidro(int primeirasAulasHidro) {
        Regular.primeirasAulasHidro = primeirasAulasHidro;
    }
    /**
     * Modifica o preço das primeiras três aulas de hidroginástica
     *
     * @param precoPrimeirasAulasHidro o preço pelas primeiras três aulas de hidroginástica
     */
    public static void setPrecoPrimeirasAulasHidro(int precoPrimeirasAulasHidro) {
        Regular.precoPrimeirasAulasHidro = precoPrimeirasAulasHidro;
    }
    /**
     * Modifica o preço das restantes aulas de hidroginástica.
     *
     * @param precoRestantesAulasHidro o preço das restantes aulas de hidroginástica
     */
    public static void setPrecoRestantesAulasHidro(int precoRestantesAulasHidro) {
        Regular.precoRestantesAulasHidro = precoRestantesAulasHidro;
    }
}


