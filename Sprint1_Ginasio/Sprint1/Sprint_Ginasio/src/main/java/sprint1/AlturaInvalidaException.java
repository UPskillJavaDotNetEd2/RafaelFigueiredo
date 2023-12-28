package sprint1;

public class AlturaInvalidaException extends RuntimeException{
    public AlturaInvalidaException() {
        super("Altura inválida!!");
    }

    public AlturaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
