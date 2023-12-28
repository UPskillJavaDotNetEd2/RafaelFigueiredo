package sprint1;
/**
 * A classe do tipo Enumerado Genero representa uma enumeração com os géneros masculino e feminino.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public enum Genero {
    /**
     * Representa o género masculino.
     */
    MASCULINO ("Maculino"),
    /**
     * Representa o género feminino.
     */
    FEMININO ("Feminino");

    public final String nome;

    Genero(String string){
        this.nome=string;
    }

    @Override
    public String toString() {
        return nome;
    }
}
