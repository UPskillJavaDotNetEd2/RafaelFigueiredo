package sprint1;

import org.upskill.utils.Data;
import sprint1.Genero;
import sprint1.Pessoa;

/**
 * A classe Cliente representa um cliente de um ginásio, estendende a classe {@code Pessoa}
 *
 * Contém os atributos altura, peso, número de aulas e número de aulas de hidroginástica.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public abstract class Cliente extends Pessoa {
    /**
     * A altura do cliente.
     */
    private float altura;
    /**
     * O peso do cliente.
     */
    private int peso;
    /**
     * O número de aulas.
     */
    private int numeroAulas;
    /**
     * O número de aulas de hidroginática.
     */
    private int numeroAulasHidroginastica;
    /**
     * O valor por omissão da altura do cliente.
     */
    private static final float ALTURA_POR_OMISSAO = 0f;
    /**
     * O valor por omissão do peso do cliente.
     */
    private static final int PESO_POR_OMISSAO = 0;
    /**
     * O valor por omissão do número de aulas.
     */
    private static final int NUMERO_AULAS_POR_OMISSAO = -1;
    /**
     * O valor por omissão do número de aulas de hidroginástica.
     */
    private static final int NUMERO_AULAS_HIDROGINASTICA_POR_OMISSAO = -1;
    /**
     * O prefixo de cliente.
     */
    private static final String PREFIXO_CLIENTE = "CLI-";
    /**
     * O tempo de aula aplicado a todos os clientes.
     */

    private static double tempoDeAula = 1;

    /**
     * Constrói uma instância Cliente recebendo o identificador, o nome, a morada,
     * o genero, a data de nascimento, a altura, o peso, o número de aulas, o número
     * de aulas de hidroginástica.
     *
     * @param identificador o identificador do cliente
     * @param nome o nome do cliente
     * @param morada a morada do cliente
     * @param genero o genero do cliente
     * @param dataNascimento a data de nascimento do cliente
     * @param altura a altura do cliente
     * @param peso o peso do cliente
     * @param numeroAulas o número de Aulas do cliente
     * @param numeroAulasHidroginastica o número de aulas de hidroginástica do cliente
     */


    public Cliente(String identificador, String nome, String morada, Genero genero, Data dataNascimento, float altura, int peso, int numeroAulas, int numeroAulasHidroginastica){
        super(identificador,nome, morada, genero, dataNascimento);
        setAltura(altura);
        setPeso(peso);
        setNumeroAulas(numeroAulas);
        setNumeroAulasHidroginastica(numeroAulasHidroginastica);
    }
    /**
     * Constrói uma instância de Cliente recebendo o identificador e atribuindo
     * a altura por omissão, o peso por omissão, o número de aulas por omissão e o
     * número de aulas de hidroginástica por omissão.
     *
     * @param identificador identificador do cliente
     */
    public Cliente(String identificador){
        super(identificador);
        altura=ALTURA_POR_OMISSAO;
        peso=PESO_POR_OMISSAO;
        numeroAulas=NUMERO_AULAS_POR_OMISSAO;
        numeroAulasHidroginastica=NUMERO_AULAS_HIDROGINASTICA_POR_OMISSAO;
    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Cliente}
     * @param outroCliente
     */
    public Cliente(Cliente outroCliente) {
        super(outroCliente);
        altura = outroCliente.altura;
        peso = outroCliente.peso;
        numeroAulas = outroCliente.numeroAulas;
        numeroAulasHidroginastica = outroCliente.numeroAulasHidroginastica;
    }
    /**
     * Devolve a altura do cliente.
     *
     * @return altura
     */

    public float getAltura() {
        return altura;
    }
    /**
     * Devolve o peso do cliente.
     *
     * @return peso
     */
    public float getPeso() {
        return peso;
    }
    /**
     * Devolve o número de aulas.
     *
     * @return número de aulas
     */
    public int getNumeroAulas() {
        return numeroAulas;
    }
    /**
     * Devolve o número de aulas de hidroginástica.
     *
     * @return número de aulas de hidroginástica.
     */
    public int getNumeroAulasHidroginastica() {
        return numeroAulasHidroginastica;
    }

    /**
     * Modifica a altura do cliente.
     *
     * @param altura a altura
     */
    public void setAltura(float altura) {
        if (altura <=0 || altura > 3){
            throw new AlturaInvalidaException(String.format("Altura %s é inválida!", altura));
        }
        this.altura = altura;
    }
    /**
     * Modifica o peso do cliente.
     *
     * @param peso o peso
     */
    public void setPeso(int peso) {
        if (peso <= 0)  {
            throw new PesoInvalidoException(String.format("Peso %s é inválido!", peso));
        }
        this.peso = peso;
    }
    /**
     * Modifica o número de aulas.
     *
     * @param numeroAulas o número de aulas.
     */
    public void setNumeroAulas(int numeroAulas) {
        if (numeroAulas < 0) {
            throw new NumeroAulasInvalidoException(String.format("O número %s é inválido", numeroAulas));
        }
        this.numeroAulas = numeroAulas;
    }
    /**
     * Modifica o número de aulas de hidroginástica
     *
     * @param numeroAulasHidroginastica o número de aulas de hidroginástica
     */
    public void setNumeroAulasHidroginastica(int numeroAulasHidroginastica) {
        if (numeroAulasHidroginastica < 0) {
            throw new NumeroAulasHidroginasticaInvalidoException(String.format("O número %s é inválido", numeroAulasHidroginastica));
        }
        this.numeroAulasHidroginastica = numeroAulasHidroginastica;
    }
    /**
     * Devolve a descrição textual do cliente.
     *
     * @return caraterísticas do cliente
     */

    @Override
    public String toString() {
        return String.format("%n%sALTURA: %.2fm%nPESO: %dKg%nIMC: %.2f%nNÚMERO DE AULAS: %d%nNÚMERO DE AULAS DE HIDROGINÁSTICA: %d%n", super.toString(),altura, peso, calcularIMC(),numeroAulas, numeroAulasHidroginastica);
    }
    /**
     * Compara este objeto Cliente com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com este Cliente.
     * @return true se os objetos são iguais, false caso contrário.
     */

    @Override
    public boolean equals(Object outroObjeto) {
        // Chama o método equals da superclasse (Object) para verificar igualdade
        if (!super.equals(outroObjeto)) {
            return false;
        }
        //Converte o objeto para a classe Cliente
        Cliente cliente = (Cliente) outroObjeto;
        //Compara os atributos de instância da classe Cliente
        return this.altura == cliente.altura && this.peso == cliente.peso && this.numeroAulas == cliente.numeroAulas && this.numeroAulasHidroginastica == cliente.numeroAulasHidroginastica;
    }
    /**
     * Devolve o total de aulas, considerando o número de aulas e
     * o número de aulas de hidroginástica
     * @return o total de aulas
     */

    public int totalAulas (){
        return numeroAulas + numeroAulasHidroginastica;
    }
    /**
     * Devolve o calculo do IMC considerando a altura e o peso do cliente
     *
     * @return IMC
     */

    public float calcularIMC(){
        return altura!=0 ? peso / ((float) Math.pow(altura, 2)) : 0;
    }
    /**
     * Método abstrato para o cálculo do pagamento.
     *
     * Este método deve ser implementado pelas subclasses desta classe abstrata.
     *
     * @return O valor do pagamento calculado.
     */

    public abstract double calcularPagamento();
    /**
     * Devolve o prefixo do cliente.
     *
     * @return prefixo cliente
     */
    public static String getPrefixoCliente() {
        return PREFIXO_CLIENTE;
    }
    /**
     * Devolve o tempo de aulas.
     *
     * @return tempo de aulas
     */
    public double getTempoDeAula() {
        return tempoDeAula;
    }
    /**
     * Modifica o tempo de aula
     *
     * @param tempoDeAula o tempo de aula
     */

    public void setTempoDeAula(double tempoDeAula) {
        this.tempoDeAula = tempoDeAula;
    }

}
