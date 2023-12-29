package sprint1;


public class CustoMensalidadeException extends Exception {
    public CustoMensalidadeException() {
        super("Custo inválido!!");
    }

    public CustoMensalidadeException(String mensagem) {
        super(mensagem);
    }
}
