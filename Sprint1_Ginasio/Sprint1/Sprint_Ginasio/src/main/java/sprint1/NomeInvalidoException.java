package sprint1;

public class NomeInvalidoException extends RuntimeException{
    public NomeInvalidoException() {
        super("Nome é inválido!!");
    }

    public NomeInvalidoException(String mensagem) {
        super(mensagem);
    }
}
