package sprint1;

import org.upskill.utils.Data;
/**
 * A classe Pessoa representa uma pessoa que frequenta um ginásio.
 * Contém o atributo identificador, nome, morada, genero e data de nascimento.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public class Pessoa implements  Comparable <Pessoa> {
    /**
     * O identificador da pessoa.
     */
    private String identificador;
    /**
     * O nome da pessoa.
     */
    private String nome;
    /**
     * A morada da pessoa.
     */
    private String morada;
    /**
     * O género da pessoa.
     */
    private Genero genero;
    /**
     * A data de nascimento da pessoa
     */
    private Data dataNascimento;
    /**
     * O nome por omissão da pessoa.
     */
    private static final String NOME_POR_OMISSAO= "sem nome";
    /**
     * A morada por omissão da pessoa.
     */
    private static final String MORADA_POR_OMISSAO = "sem morada";
    /**
     * O género por omissão da pessoa.
     */
    private static final Genero GENERO_POR_OMISSAO = Genero.FEMININO;
    /**
     * Constrói uma instância Pessoa que recebe o identificador, o nome, a morada,
     * o genero e a data de nascimento
     *
     * @param identificador o identificador da pessoa
     * @param nome o nome da pessoa
     * @param morada a morada da pessoa
     * @param genero o genero da pessoa
     * @param dataNascimento a data de nascimento da pessoa
     *
     */
    public Pessoa(String identificador, String nome, String morada, Genero genero, Data dataNascimento){
        this.identificador = identificador;
        this.nome = nome;
        this.morada = morada;
        this.genero = genero;
        this.dataNascimento = new Data(dataNascimento);
    }
    /**
     * Constrói uma instância Pessoa atribuindo o identificador, atribuindo o nome
     * por omissão, a morada por omissão, o género por omissão e a data de nascimento por
     * omissão
     */
    public Pessoa(String identificador){
        this.identificador = identificador;
        nome=NOME_POR_OMISSAO;
        morada=MORADA_POR_OMISSAO;
        genero=GENERO_POR_OMISSAO;
        dataNascimento= new Data();
    }
    /**
     * Constroi um novo objeto como uma cópia de outro objeto {@code Pessoa}
     * @param outraPessoa
     */
    public Pessoa(Pessoa outraPessoa){
        this.identificador= outraPessoa.identificador;
        this.nome= outraPessoa.nome;
        this.morada= outraPessoa.morada;
        this.genero=outraPessoa.genero;
        this.dataNascimento= new Data(outraPessoa.dataNascimento);
    }
    /**
     * Devolve o identificador.
     *
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
    }
    /**
     * Devolve o nome .
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * Devolve a morada
     *
     * @return morada
     */
    public String getMorada() {
        return morada;
    }
    /**
     * Devolve o género
     * @return género
     */

    public Genero getGenero() {
        return genero;
    }
    /**
     * Devolve a data de nascimento
     *
     * @return data de nascimento
     */
    public Data getDataNascimento() {
        return new Data(dataNascimento);
    }
    /**
     * Modifica o identificador
     *
     * @param identificador o identificador
     */

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    /**
     * Modifica o nome
     *
     * @param nome o identificador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Modifica a morada
     *
     * @param morada a morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    /**
     * Modifica o género
     *
     * @param genero o género
     */

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    /**
     * Modifica a data de nascimento
     *
     * @param dataNascimento a data de nascimento
     */

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento.setData(dataNascimento.getAno(),dataNascimento.getMes(),dataNascimento.getDia());;
    }
    /**
     * Devolve a descrição textual da pessoa.
     *
     * @return caraterísticas da pessoa
     */

    @Override
    public String toString(){
        return String.format("IDENTIFICADOR: %s%nNOME: %s%nMORADA: %s%nGÉNERO: %s%nDATA DE NASCIMENTO: %s%n", identificador, nome, morada, genero, dataNascimento);
    }
    /**
     * Compara este objeto Pessoa com outro objeto para verificar se são iguais.
     *
     * @param outroObjeto O objeto a ser comparado com esta Pessoa.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object outroObjeto){
        //Verifica se os objetos são a mesma referência

        if(this==outroObjeto){
            return true;
        }
        // Verifica se o objeto passado por parâmetro é nulo ou não é uma instância de Pessoa

        if(outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        //Converte o objeto para a classe Pessoa

        Pessoa pessoa = (Pessoa) outroObjeto;
        //Compara os atributos de instância da classe Pessoa

        return this.identificador.equalsIgnoreCase(pessoa.identificador) && this.nome.equalsIgnoreCase(pessoa.nome) && this.morada.equalsIgnoreCase(pessoa.morada) && this.genero==pessoa.genero && this.dataNascimento.equals(pessoa.dataNascimento);
    }
    /**
     * Compara esta pessoa com outra pessoa com base nos nomes, ignorando maiúsculas e minúsculas.
     *
     * @param outraPessoa A outra pessoa a ser comparada.
     * @return Um valor negativo, -1, se o nome desta Pessoa for lexicograficamente menor que o nome da outra Pessoa,
     *         um valor positivo, 1, se o nome desta Pessoa for lexicograficamente maior,
     *         zero, 0, se os nomes forem iguais.
     */

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareToIgnoreCase(outraPessoa.getNome());
    }
}
