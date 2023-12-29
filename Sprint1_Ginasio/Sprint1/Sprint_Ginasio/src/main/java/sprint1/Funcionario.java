package sprint1;

import org.upskill.utils.Data;
import sprint1.CalculoVencimento;
import sprint1.Genero;
import sprint1.Pessoa;

/**
 * A classe Funcionario representa um funcionário de um ginásio, estendende a classe {@code Pessoa}
 * e implementa a interface {@code CalculoVencimento}.
 * Contém o atributo número de clientes angariados.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public class Funcionario extends Pessoa implements CalculoVencimento {
    /**
     * O número de clientes angariados.
     */
    private int numeroClientesAngariados;
    /**
     * O valor por omissão do número de clientes angariados.
     */

    private static final int NUMERO_CLIENTES_ANGARIADOS = -1;
    /**
     * O prefixo de funcionário.
     */
    private static final String PREFIXO_FUNCIONARIO = "FUNC-";
    /**
     * O vencimento base aplicado a todos os funcionários.
     */

    private static double vencimentoBase = 800;
    /**
     * A comissão aplicada a todos os funcionários.
     */
    private static double comissao = 20;
    /**
     * O contador do total de funcionários.
     */
    private static int totalFuncionarios = 0;
    /**
     * Constrói uma instância Funcionario que recebe o identificador, o nome, a morada,
     * o genero, a data de nascimento e o número de clientes angariados
     *
     * @param nome o nome do funcionário
     * @param morada a morada do funcionário
     * @param genero o genero do funcionário
     * @param dataNascimento a data de nascimento do funcionário
     * @param numeroClientesAngariados o número de clientes angariados
     */

    public Funcionario(String nome, String morada, Genero genero, Data dataNascimento, int numeroClientesAngariados) {
        super(PREFIXO_FUNCIONARIO + (++totalFuncionarios), nome, morada, genero, dataNascimento);

        setNumeroClientesAngariados(numeroClientesAngariados);

    }
    /**
     * Constrói uma instância Funcionario atribuindo o identificador e atribuindo o
     * número de clientes angariados por omissão.
     */

    public Funcionario() {
        super(PREFIXO_FUNCIONARIO + (++totalFuncionarios));

        numeroClientesAngariados = NUMERO_CLIENTES_ANGARIADOS;

    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Funcionario}
     * @param outroFuncionario
     */


    public Funcionario(Funcionario outroFuncionario) {
        super(outroFuncionario);

        this.numeroClientesAngariados = outroFuncionario.numeroClientesAngariados;
    }
    /**
     * Devolve o número de clientes angariados.
     *
     * @return número de clientes angariados
     */

    public int getNumeroClientesAngariados() {
        return numeroClientesAngariados;
    }
    /**
     * Modifica o número de clientes angariados.
     *
     * @param numeroClientesAngariados o número de clientes angariados
     */

    public void setNumeroClientesAngariados(int numeroClientesAngariados) {
        if (numeroClientesAngariados <0){
            throw new NumeroClientesAngariadosInvalidException(String.format("O número %s de clientes, é inválido!", numeroClientesAngariados));
        }
        this.numeroClientesAngariados = numeroClientesAngariados;
    }
    /**
     * Devolve a descrição textual do funcionário.
     *
     * @return caraterísticas do funcionário
     */

    @Override
    public String toString() {
        return String.format("FUNCIONÁRIO: \n%n%sNÚMERO DE CLIENTES ANGARIADOS: %d%n", super.toString(), numeroClientesAngariados);
    }
    /**
     * Compara este objeto Funcionario com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Funcionario.
     * @return true se os objetos são iguais, false caso contrário.
     */

    @Override
    public boolean equals(Object outroObjeto) {
        // Chama o método equals da superclasse (Object) para verificar igualdade
        if (!super.equals(outroObjeto)) {
            return false;
        }
        //Converte o objeto para a classe Funcionario
        Funcionario funcionario = (Funcionario) outroObjeto;
        //Compara o atributo de instância da classe Funcionario
        return this.numeroClientesAngariados == funcionario.numeroClientesAngariados;
    }
    /**
     * Devolve o vencimento por parte do funcionário, considerando o vencimento base,
     * o número de clientes angariados e a comissão por cada cliente angariado.
     * @return o total do vencimento
     */

    @Override
    public double calcularVencimento(){
        return vencimentoBase + numeroClientesAngariados*comissao;
    }

    /**
     * Devolve o vencimento base.
     *
     * @return vencimento base
     */
    public static double getVencimentoBase() {
        return vencimentoBase;
    }
    /**
     * Devolve a comissão
     *
     * @return comissão
     */
    public static double getComissao() {
        return comissao;
    }
    /**
     * Devolve o total dos funcionários
     *
     * @return total dos funcionários
     */
    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
    /**
     * Modifica o vencimento base
     *
     * @param vencimentoBase o vencimento base
     */

    public static void setVencimentoBase(double vencimentoBase) {
        Funcionario.vencimentoBase = vencimentoBase;
    }
    /**
     * Modifica a comissão
     *
     * @param comissao a comissão
     */
    public static void setComissao(double comissao) {
        Funcionario.comissao = comissao;
    }
}
