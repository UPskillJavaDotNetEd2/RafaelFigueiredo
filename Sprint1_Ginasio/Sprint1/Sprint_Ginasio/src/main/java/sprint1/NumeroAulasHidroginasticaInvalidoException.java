package sprint1;

public class NumeroAulasHidroginasticaInvalidoException extends RuntimeException{
    public NumeroAulasHidroginasticaInvalidoException() {
        super("O Numero de Aulas é inválido!!");
    }

    public NumeroAulasHidroginasticaInvalidoException(String mensagem) {
        super(mensagem);
    }
}
