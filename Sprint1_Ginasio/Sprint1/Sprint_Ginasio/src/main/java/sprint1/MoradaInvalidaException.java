package sprint1;

public class MoradaInvalidaException extends RuntimeException{
    public MoradaInvalidaException() {
        super("Morada é inválida!!");
    }

    public MoradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
