package sprint1;

public class PesoInvalidoException extends RuntimeException{
    public PesoInvalidoException() {
        super("Peso inválido!!");
    }

    public PesoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
