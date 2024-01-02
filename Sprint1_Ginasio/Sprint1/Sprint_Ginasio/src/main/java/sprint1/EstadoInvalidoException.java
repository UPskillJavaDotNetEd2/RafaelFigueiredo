package sprint1;

public class EstadoInvalidoException extends RuntimeException{
    public EstadoInvalidoException() {
        super("Estado inválido!!");
    }
    public EstadoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
