package sprint1;

public class VencimentoInvalidoException extends RuntimeException{
    public VencimentoInvalidoException() {
        super("O vencimento é inválido!!");
    }

    public VencimentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
