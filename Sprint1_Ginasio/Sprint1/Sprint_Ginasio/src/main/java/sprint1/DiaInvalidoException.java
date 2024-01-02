package sprint1;

public class DiaInvalidoException extends RuntimeException{
    public DiaInvalidoException() {
        super("Dia é inválido!!");
    }

    public DiaInvalidoException(String mensagem) {
        super(mensagem);
    }
}
