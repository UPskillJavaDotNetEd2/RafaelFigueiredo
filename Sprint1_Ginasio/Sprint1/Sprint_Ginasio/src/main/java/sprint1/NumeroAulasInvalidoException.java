package sprint1;

public class NumeroAulasInvalidoException extends RuntimeException {
    public NumeroAulasInvalidoException() {
        super("O Numero de Aulas é inválido!!");
    }

    public NumeroAulasInvalidoException(String mensagem) {
        super(mensagem);
    }
}
