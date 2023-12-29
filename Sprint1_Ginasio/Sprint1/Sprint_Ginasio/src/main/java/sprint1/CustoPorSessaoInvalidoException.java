package sprint1;


public class CustoPorSessaoInvalidoException extends RuntimeException {
    public CustoPorSessaoInvalidoException() {
        super("Número inválido!!");
    }

    public CustoPorSessaoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
