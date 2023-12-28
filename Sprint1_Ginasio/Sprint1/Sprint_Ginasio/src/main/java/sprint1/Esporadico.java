package sprint1;

import org.upskill.utils.Data;
/**
 * A classe Esporadico representa um cliente esporádico de um ginásio, que estende a classe {@code Cliente}
 * e implementa as interfaces {@code HorasExtraAulas}, {@code CustoAulas}.
 * Contém o atributo número de horas de permanecimento.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public class Esporadico extends Cliente implements HorasExtraAulas, CustoAulas{
    /**
     * O número de horas de permanecimento no ginásio.
     */
    private int numeroHorasPermanecimento;
    /**
     * O valor por omissão do número de horas de permanecimento no ginásio.
     */

    private static final int NUMERO_HORAS_PERMANECIMENTO = -1;
    /**
     * O preço por hora aplicado a todos os Esporádicos.
     */

    private static double precoHora = 5;
    /**
     * O preço por aula aplicado a todos os Esporádicos.
     */
    private static double precoAula = 6;
    /**
     * O preço por aula de hidroginástica aplicado a todos os Esporádicos.
     */
    private static double precoAulaHidro = 7;
    /**
     * O contador do numero de instâncias do tipo Esporádico.
     */
    private static int contador = 0;
    /**
     * Constrói uma instância Esporádico que recebe o identificador, o nome, a morada,
     * o genero, a data de nascimento, a altura, o peso, o número de aulas, o número
     * de aulas de hidroginástica, o número de horas de permanecimento no ginásio.
     *
     * @param nome o nome do cliente esporádico
     * @param morada a morada do cliente esporádico
     * @param genero o genero do cliente esporádico
     * @param dataNascimento a data de nascimento do cliente esporádico
     * @param altura a altura do cliente esporádico
     * @param peso o peso do cliente esporádico
     * @param numeroAulas o número de Aulas do cliente esporádico
     * @param numeroAulasHidroginastica o número de aulas de hidroginástica do cliente esporádico
     * @param numeroHorasPermanecimento o número de horas de permanecimento do cliente esporádico
     *
     */
    public Esporadico(String nome, String morada, Genero genero, Data dataNascimento, float altura, int peso, int numeroAulas, int numeroAulasHidroginastica, int numeroHorasPermanecimento){

        super(getPrefixoCliente() + Tipo.ESPORADICO +"-"+(++contador),nome, morada, genero, dataNascimento, altura, peso, numeroAulas, numeroAulasHidroginastica);


        if (altura <= 0) {
            throw new IllegalArgumentException("Altura tem de ser maior que 0");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso tem de ser maior que 0");
        }
        if (numeroAulas < 0) {
            throw new IllegalArgumentException("Numero de aulas nao pode ser um valor negativo");
        }
        if (numeroAulasHidroginastica < 0) {
            throw new IllegalArgumentException("Numero de aulas de hidroginastica nao pode ser um valor negativo");
        }
        if (numeroHorasPermanecimento < 0) {
            throw new IllegalArgumentException("Numero de horas permanecidas nao pode ser um valor negativo");
        }

        this.numeroHorasPermanecimento=numeroHorasPermanecimento;
    }
    /**
     * Constrói uma instância Esporádico atribuindo o identificador, atribuindo o número de horas de permanecimento
     * por omissão.
     */

    public Esporadico(){
        super(getPrefixoCliente() + Tipo.CONVIDADO +"-"+(++contador));

        numeroHorasPermanecimento=NUMERO_HORAS_PERMANECIMENTO;

    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Convidado}
     * @param outroEsporadico
     */
    public Esporadico (Esporadico outroEsporadico){
        super(outroEsporadico);
        this.numeroHorasPermanecimento = outroEsporadico.numeroHorasPermanecimento;
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
     * Modifica o Numero Horas  de Permanecimento
     *
     * @param numeroHorasPermanecimento o número de horas de permanecimento no ginásio.
     */

    public void setNumeroHorasPermanecimento(int numeroHorasPermanecimento) {
        this.numeroHorasPermanecimento = numeroHorasPermanecimento;
    }
    /**
     * Devolve a descrição textual do Esporadico
     *
     * @return caraterísticas do esporádico
     */

    @Override
    public String toString() {
        return  String.format("CLIENTE ESPORÁDICO: \n%sNÚMERO DE HORAS QUE PERMANECEU NO GINÁSIO: %d%n%nTOTAL A PAGAR ESTE MÊS: %.2f%n",super.toString(), numeroHorasPermanecimento, calcularPagamento());
    }
    /**
     * Compara este objeto Esporadico com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Esporadico.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        // Chama o método equals da superclasse (Object) para verificar igualdade
        if (!super.equals(outroObjeto)) {
            return false;
        }
        //Converte o objeto para a classe Esporadico
        Esporadico esporadico = (Esporadico) outroObjeto;
        //Compara o atributo de instância da classe Esporadico
        return this.numeroHorasPermanecimento == esporadico.numeroHorasPermanecimento;
    }

    /**
     * Devolve o pagamento por parte cliente esporádico, considerando horas extra,
     * custo das aulas e o preço por hora.
     * @return o total a pagar
     */

    @Override
    public double calcularPagamento() {

        return horasExtraAulas() * precoHora + custoAulas();
    }
    /**
     * Devolve o número de horas extra aulas, considerando o tempo das aula,
     * o tempo das aulas de hidroginástica e o tempo de permanecimento.
     * @return horas extra aulas
     */

    @Override
    public double horasExtraAulas() {
        double horasExtraAulas = 0;
        if (numeroHorasPermanecimento > ((getNumeroAulas()*getTempoDeAula()) + (getNumeroAulasHidroginastica()*getTempoDeAula()))){

            horasExtraAulas = numeroHorasPermanecimento - (getNumeroAulas()*getTempoDeAula()) - (getNumeroAulasHidroginastica()*getTempoDeAula());
        }

        horasExtraAulas = Math.ceil(horasExtraAulas);

        return horasExtraAulas;
    }
    /**
     * Devolve o custo de aulas, tendo em conta o preço e número das aulas e
     * o preço e número das aulas de hidroginástica.
     * @return custo de aulas
     */

    @Override
    public double custoAulas() {
        double custoAulas = 0;
        if (getNumeroAulas() > 0 || getNumeroAulasHidroginastica() > 0 ) {
            custoAulas = getNumeroAulas() * precoAula + precoAulaHidro * getNumeroAulasHidroginastica();
        }
        return custoAulas;
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
     * Devolve o preço por hora.
     *
     * @return preço por hora
     */
    public static double getPrecoHora() {
        return precoHora;
    }
    /**
     * Devolve o preço por aula
     *
     * @return preço por aula
     */
    public static double getPrecoAula() {
        return precoAula;
    }
    /**
     * Devolve o preço por aula de hidroginástica
     *
     * @return preço por aula de hidroginástica
     */
    public static double getPrecoAulaHidro() {
        return precoAulaHidro;
    }
    /**
     * Modifica o preço por hora
     *
     * @param precoHora o preço por hora
     */

    public static void setPrecoHora(double precoHora) {
        Esporadico.precoHora = precoHora;
    }
    /**
     * Modifica o preço por aula
     *
     * @param precoAula o preço por aula
     */
    public static void setPrecoAula(double precoAula) {
        Esporadico.precoAula = precoAula;
    }
    /**
     * Modifica o preço por aula de hidroginástica
     *
     * @param precoAulaHidro o preço por aula de hidroginástica
     */
    public static void setPrecoAulaHidro(double precoAulaHidro) {
        Esporadico.precoAulaHidro = precoAulaHidro;
    }

}
