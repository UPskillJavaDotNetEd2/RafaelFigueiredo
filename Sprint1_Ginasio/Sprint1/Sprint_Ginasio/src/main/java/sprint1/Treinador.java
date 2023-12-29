package sprint1;

import org.upskill.utils.Data;
import sprint1.*;

import java.util.Calendar;
/**
 * A classe Treinador representa um treinador de um ginásio, estendende a classe {@code Pessoa}
 * e implementa as interfaces {@code PagamentoSessoesPT} e {@code CalculoVencimento}.
 * Contém os atributos vencimento, sessões como Personal Trainer e custo por sessão.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public class Treinador extends Pessoa implements PagamentoSessoesPT, CalculoVencimento {
    /**
     * O vencimento.
     */
    private double vencimento;
    /**
     * O número de sessões como Personal Trainer.
     */
    private int sessoesPersonalTrainer;
    /**
     * O custo por sessão como Personal Trainer.
     */
    private double custoSessao;
    /**
     * O valor por omissão do vencimento.
     */
    private static final double VENCIMENTO_POR_OMISSAO = -1;
    /**
     * O valor por omissão do número de sessões como Personal Trainer.
     */
    private static final int SESSOES_PERSONAL_TRAINER_POR_OMISSAO = -1;
    /**
     * O valor por omissão do custo por sessão como Personal Trainer.
     */
    private static final int CUSTO_SESSAO_POR_OMISSAO = -1;
    /**
     * O prefixo de treinador.
     */
    private static final String PREFIXO_TREINADOR = "TREI-";
    /**
     * O contador do total de treinadores.
     */
    private static int totalTreinadores = 0;
    /**
     * Constrói uma instância Treinador que recebe o identificador, o nome, a morada,
     * o genero, a data de nascimento, o vencimento, o número de sessões como Personal
     * Trainer e o custo por sessão como Personal Trainer.
     *
     * @param nome o nome do treinador
     * @param morada a morada do treinador
     * @param genero o genero do treinador
     * @param dataNascimento a data de nascimento do treinador
     * @param vencimento o vencimento do treinador
     * @param sessoesPersonalTrainer o número de sessões como Personal Trainer
     * @param custoSessao o custo por sessão como Personal Trainer
     */
    public Treinador(String nome, String morada, Genero genero, Data dataNascimento, double vencimento, int sessoesPersonalTrainer, double custoSessao) {
        super(PREFIXO_TREINADOR + (++totalTreinadores), nome, morada, genero, dataNascimento);

        setVencimento(vencimento);
        setSessoesPersonalTrainer(sessoesPersonalTrainer);
        setCustoSessao(custoSessao);
    }
    /**
     * Constrói uma instância Treinador atribuindo o identificador, atribuindo o vencimento
     * por omissão, as sessões como Personal Trainer por omissão e o custo por sessão por
     * omissão.
     */
    public Treinador() {
        super(PREFIXO_TREINADOR + (++totalTreinadores));

        vencimento = VENCIMENTO_POR_OMISSAO;
        sessoesPersonalTrainer = SESSOES_PERSONAL_TRAINER_POR_OMISSAO;
        custoSessao = CUSTO_SESSAO_POR_OMISSAO;
    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Treinador}
     * @param outroTreinador
     */
    public Treinador(Treinador outroTreinador) {
        super(outroTreinador);
        this.vencimento = outroTreinador.vencimento;
        this.sessoesPersonalTrainer = outroTreinador.sessoesPersonalTrainer;
        this.custoSessao = outroTreinador.custoSessao;
    }
    /**
     * Devolve o vencimento.
     *
     * @return vencimento
     */
    public double getVencimento() {
        return vencimento;
    }
    /**
     * Devolve o número de sessões como Personal Trainer.
     *
     * @return o número de sessões como Personal Trainer
     */
    public int getSessoesPersonalTrainer() {
        return sessoesPersonalTrainer;
    }
    /**
     * Devolve o custo por sessão como Personal Trainer.
     *
     * @return o custo por sessão como Personal Trainer
     */
    public double getCustoSessao() {
        return custoSessao;
    }
    /**
     * Modifica o vencimento.
     *
     * @param vencimento o vencimento
     */

    public void setVencimento(double vencimento) {
        if (vencimento < 0){
            throw new VencimentoInvalidoException(String.format("Vencimento %s inválido", vencimento));
        }
        this.vencimento = vencimento;
    }
    /**
     * Modifica o número de sessões como Personal Trainer.
     *
     * @param sessoesPersonalTrainer o número de sessões como Personal Trainer
     */
    public void setSessoesPersonalTrainer(int sessoesPersonalTrainer) {
        if (sessoesPersonalTrainer < 0) {
            throw new SessoesPersonalTrainerInvalidException(String.format("O número de sessões com PT, %s, é inválido!", sessoesPersonalTrainer));
        }
        this.sessoesPersonalTrainer = sessoesPersonalTrainer;}
    /**
     * Modifica o custo por sessão como Personal Trainer.
     *
     * @param custoSessao o custo por sessão como Personal Trainer
     */
    public void setCustoSessao(double custoSessao) {
        if (custoSessao < 0) {
            throw new CustoPorSessaoInvalidoException(String.format("Número %s inválido!", custoSessao));
        }
        this.custoSessao = custoSessao;
    }
    /**
     * Devolve a descrição textual do treinador.
     *
     * @return caraterísticas do treinador
     */
    @Override
    public String toString(){
        return String.format("TREINADOR: \n%n%sVENCIMENTO: %.2f€%nNÚMERO DE SESSÕES COMO PERSONAL TRAINER: %d%nCUSTO POR SESSÃO: %.2f€%n", super.toString(), vencimento, sessoesPersonalTrainer, custoSessao);
    }
    /**
     * Compara este objeto Treinador com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Treinador.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        // Chama o método equals da superclasse (Object) para verificar igualdade
        if (!super.equals(outroObjeto)) {
            return false;
        }
        //Converte o objeto para a classe Treinador
        Treinador treinador = (Treinador) outroObjeto;
        //Compara os atributos de instância da classe Treinador
        return this.vencimento == treinador.vencimento && this.sessoesPersonalTrainer == treinador.sessoesPersonalTrainer && this.custoSessao == treinador.custoSessao;
    }
    /**
     * Devolve o vencimento por parte do treinador, considerando o vencimento e
     * o pagamento que recebe nas sessões que faz como Personal Trainer.
     * @return o total do vencimento
     */
    @Override
    public double calcularVencimento(){
        return vencimento + pagamentoPt();
    }
    /**
     * Calcula o pagamento para as sessões que faz como Personal Trainer,
     * multiplicando o número de sessões pelo custo por sessão.
     *
     * @return O valor a ser pago pelas sessões de Personal Trainer.
     */
    @Override
    public double pagamentoPt() {
        return sessoesPersonalTrainer * custoSessao;
    }
    /**
     * Calcula a idade do treinador, com base na sua data de nascimento em relação à data atual.
     *
     * @return A idade calculada.
     */
    public int calcularIdade() {

        //Obtém o ano, mês e dia atuais

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int mesAtual = Calendar.getInstance().get(Calendar.MONTH) + 1; // janeiro é representado por 0.
        int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        // Calcula a idade subtraindo o ano de nascimento ao ano atual
        int idade = anoAtual - getDataNascimento().getAno();


        // Verifica se já fez anos neste ano
        // Se não fez subtrai 1 ao valor da idade calculado acima
        if (mesAtual < getDataNascimento().getMes() || (mesAtual == getDataNascimento().getMes() && diaAtual < getDataNascimento().getDia())) {
            idade--;
        }
        // Retorna a idade calculada
        return idade;
    }
    /**
     * Devolve o total dos treinadores
     *
     * @return total dos treinadores
     */
    public static int getTotalTreinadores() {
        return totalTreinadores;
    }
}


