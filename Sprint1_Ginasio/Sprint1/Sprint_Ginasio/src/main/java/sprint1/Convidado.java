package sprint1;

import org.upskill.utils.Data;
/**
 * A classe Convidado representa um convidado de um ginásio, estendende a classe {@code Cliente}
 * e implementa as interfaces {@code PagamentoSessoesPT}, {@code HorasExtraAulas} e {@code CustoAulas}.
 * Contém os atributos número de horas de permanecimento, número de sessões, custo por sessão e banco de horas.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public class  Convidado extends Cliente implements  PagamentoSessoesPT, HorasExtraAulas, CustoAulas{
    /**
     * O número de horas de permanecimento no ginásio.
     */
    private int numeroHorasPermanecimento;
    /**
     * O número de Sessões.
     */
    private int numeroSessoes;
    /**
     * O custo por Sessão.
     */
    private double custoPorSessao;
    /**
     * O banco de horas que corresponde ao montante de horas fornecidas ao Convidado.
     */
    private int bancoHoras;
    /**
     * O valor por omissão do número de horas de permanecimento no ginásio.
     */
    private static final int NUMERO_HORAS_PERMANECIMENTO_POR_OMISSAO = -1;
    /**
     * O valor por omissão do número de sessões.
     */
    private static final int NUMERO_SESSOES_POR_OMISSAO = -1;
    /**
     * O valor por omissão do custo por sessão.
     */
    private static final  int CUSTO_POR_SESSAO_POR_OMISSAO = -1;
    /**
     * O valor por omissão do banco de horas.
     */
    private static final int BANCO_HORAS_POR_OMISSAO = -1;
    /**
     * O preço por aula aplicado a todos os Convidados.
     */
    private static double precoAula = 6;
    /**
     * O preço por hora aplicado a todos os Convidados.
     */
    private static double precoHora = 6;
    /**
     * O preço por aula de hidroginástica aplicado a todos os Convidados.
     */
    private static double precoAulaHidroginastica = 7;
    /**
     * O contador do numero de instâncias do tipo Convidado.
     */
    private static int contador = 0;
    /**
     * Constrói uma instância Convidado que recebe o identificador, o nome, a morada,
     * o genero, a data de nascimento, a altura, o peso, o número de aulas, o número
     * de aulas de hidroginástica, o número de horas de permanecimento no ginásio, o
     * número de sessões, o custo por sessão e o banco de horas.
     *
     * @param nome o nome do convidado
     * @param morada a morada do convidado
     * @param genero o genero do convidado
     * @param dataNascimento a data de nascimento do convidado
     * @param altura a altura do convidado
     * @param peso o peso do convidado
     * @param numeroAulas o número de Aulas do convidado
     * @param numeroAulasHidroginastica o número de aulas de hidroginástica do convidado
     * @param numeroHorasPermanecimento o número de horas de permanecimento do convidado
     * @param numeroSessoes o número de sessões do convidado
     * @param custoPorSessao o custo por sessão do convidado
     * @param bancoHoras o banco de horas do convidado
     */

    public Convidado(String nome, String morada, Genero genero, Data dataNascimento, float altura, int peso, int numeroAulas, int numeroAulasHidroginastica, int numeroHorasPermanecimento, int numeroSessoes, double custoPorSessao, int bancoHoras){

        super(getPrefixoCliente() + Tipo.CONVIDADO +"-"+(++contador),nome, morada, genero, dataNascimento, altura, peso, numeroAulas, numeroAulasHidroginastica);

        this.numeroHorasPermanecimento=numeroHorasPermanecimento;
        this.numeroSessoes = numeroSessoes;
        this.custoPorSessao = custoPorSessao;
        this.bancoHoras = bancoHoras;
    }
    /**
     * Constrói uma instância Convidado atribuindo o identificador, atribuindo
     * o número de horas de permanecimento por omissão, o numero de sessões por
     * omissão, o custo por sessão por omissão e o banco de horas por omissão.
     */

    public Convidado(){
        super(getPrefixoCliente() + Tipo.CONVIDADO +"-"+(++contador));
        numeroHorasPermanecimento= NUMERO_HORAS_PERMANECIMENTO_POR_OMISSAO;
        numeroSessoes = NUMERO_SESSOES_POR_OMISSAO;
        custoPorSessao = CUSTO_POR_SESSAO_POR_OMISSAO;
        bancoHoras = BANCO_HORAS_POR_OMISSAO;


    }

    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Convidado}
     * @param outroConvidado
     */

    public Convidado(Convidado outroConvidado){
        super(outroConvidado);
        numeroHorasPermanecimento = outroConvidado.numeroHorasPermanecimento;
        this.numeroSessoes = outroConvidado.numeroSessoes;
        this.custoPorSessao = outroConvidado.custoPorSessao;
        this.bancoHoras = outroConvidado.bancoHoras;
    }
    /**
     * Devolve o número de horas de permanecimento no ginásio.
     *
     * @return número de horas de permanecimento.
     */

    public int getNumeroHorasPermanecimento() {
        return numeroHorasPermanecimento;
    }
    /**
     * Devolve o número de sessões.
     *
     * @return número de sessões.
     */
    public int getNumeroSessoes() {
        return numeroSessoes;
    }
    /**
     * Devolve o custo por sessão.
     *
     * @return custo por sessão.
     */
    public double getCustoPorSessao() {
        return custoPorSessao;
    }
    /**
     * Devolve o banco de horas.
     *
     * @return banco de horas.
     */
    public int getBancoHoras() {
        return bancoHoras;
    }
    /**
     * Modifica o Numero Horas  de Permanecimento
     *
     * @param numeroHorasPermanecimento o número de horas de permanecimento no ginásio.
     */

    public void setNumeroHorasPermanecimento(int numeroHorasPermanecimento) {
        this.numeroHorasPermanecimento = numeroHorasPermanecimento;}
    /**
     * Modifica o Numero de Sessoes
     *
     * @param numeroSessoes o numero de Sessoes
     */
    public void setNumeroSessoes(int numeroSessoes) {
        this.numeroSessoes = numeroSessoes;
    }
    /**
     * Modifica o custo por Sessão
     *
     * @param custoPorSessao o custo por sessão
     */
    public void setCustoPorSessao(double custoPorSessao) {
        this.custoPorSessao = custoPorSessao;
    }
    /**
     * Modifica o banco de horas
     *
     * @param bancoHoras o banco de horas.
     */
    public void setBancoHoras(int bancoHoras) {
        this.bancoHoras = bancoHoras;
    }
    /**
     * Devolve a descrição textual do convidado.
     *
     * @return caraterísticas do convidado
     */

    @Override
    public String toString() {
        return  String.format("CLIENTE CONVIDADO: \n%sNÚMERO DE HORAS QUE PERMANECEU NO GINÁSIO: %d%nNÚMERO DE SESSÕES: %d%nCUSTO POR SESSÃO: %.2f€%nBANCO DE HORAS: %d%n%nTOTAL A PAGAR ESTE MÊS: %.2f%n",super.toString(), numeroHorasPermanecimento, numeroSessoes, custoPorSessao, bancoHoras, calcularPagamento());
    }
    /**
     * Compara este objeto Convidado com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Convidado.
     * @return true se os objetos são iguais, false caso contrário.
     */

    @Override
    public boolean equals(Object outroObjeto) {
        // Chama o método equals da superclasse (Object) para verificar igualdade
        if (!super.equals(outroObjeto)) {
            return false;
        }
        //Converte o objeto para a classe Convidado
        Convidado convidado = (Convidado) outroObjeto;
        //Compara os atributos de instância da classe Convidado
        return this.numeroHorasPermanecimento == convidado.numeroHorasPermanecimento && this.numeroSessoes == convidado.numeroSessoes && this.custoPorSessao == convidado.custoPorSessao && this.bancoHoras == convidado.bancoHoras;
    }

    /**
     * Devolve o pagamento por parte do convidado, considerando horas extra,
     * custo de aulas e o pagamento por sessões de personal trainer.
     * @return o total a pagar
     */
    @Override
    public double calcularPagamento() {
        double pagamentoTotal;

        bancoHoras -= horasExtraAulas();

        if (bancoHoras <=0){

            double pagamentoExtra = Math.abs(bancoHoras) * precoHora;

            pagamentoTotal = pagamentoExtra + custoAulas() + pagamentoPt();

        }else {

            pagamentoTotal = custoAulas() + pagamentoPt();
        }

        return pagamentoTotal;
    }

    /**
     * Devolve o número de horas extra aulas, considerando o número de horas de permanecimento,
     * o número de horas das aulas e o número de horas das aulas de hidroginástica.
     * @return horas extra aulas
     */

    @Override
    public double horasExtraAulas() {
        double horasExtraAulas = 0;
        if (numeroHorasPermanecimento > (getNumeroAulas()*getTempoDeAula()) + (getNumeroAulasHidroginastica()*getTempoDeAula())){

            horasExtraAulas = numeroHorasPermanecimento - (getNumeroAulas()*getTempoDeAula()) - (getNumeroAulasHidroginastica()*getTempoDeAula());
        }

        horasExtraAulas = Math.ceil(horasExtraAulas);

        return horasExtraAulas;
    }
    /**
     * Devolve o custo de aulas, tendo em conta o número e preço das aulas e o número
     * e preço das aulas de hidroginástica
     * @return custo de aulas
     */

    @Override
    public double custoAulas() {
        double custoAulas = 0;
        if (getNumeroAulas() > 0 || getNumeroAulasHidroginastica() > 0 ) {
            custoAulas = getNumeroAulas() * precoAula + precoAulaHidroginastica * getNumeroAulasHidroginastica();
        }
        return custoAulas;
    }
    /**
     * Devolve o pagamento de sessões de personal trainer, tendo em conta o número e o custo
     * das sessões.
     * @return pagamento por sessões de pt
     */

    @Override
    public double pagamentoPt() {
        return numeroSessoes * custoPorSessao;
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
     * Devolve o preço por hora
     *
     * @return preço por hora
     */
    public static double getPrecoHora() {
        return precoHora;
    }
    /**
     * Devolve o preço por aula.
     *
     * @return preço por aula.
     */
    public static double getPrecoAula() {
        return precoAula;
    }

    /**
     * Devolve o preço por aula de hidroginástica.
     *
     * @return preço por aula de hidroginástica.
     */
    public static double getPrecoAulaHidroginastica() {
        return precoAulaHidroginastica;
    }

    /**
     * Modifica o preço por hora
     *
     * @param precoHora o preço por hora
     */
    public static void setPrecoHora(double precoHora) {
        Convidado.precoHora = precoHora;
    }

    /**
     * Modifica o preço por aula
     *
     * @param precoAula o preço por aula
     */
    public static void setPrecoAula(double precoAula) {
        Convidado.precoAula = precoAula;
    }

    /**
     * Modifica o preço por aula de hidroginástica
     *
     * @param precoAulaHidroginastica o preço por aula de hidroginástica
     */
    public static void setPrecoAulaHidroginastica(double precoAulaHidroginastica) {
        Convidado.precoAulaHidroginastica = precoAulaHidroginastica;
    }
}