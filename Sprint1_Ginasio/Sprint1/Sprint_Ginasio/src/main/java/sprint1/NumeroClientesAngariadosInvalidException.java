package sprint1;

public class NumeroClientesAngariadosInvalidException extends RuntimeException {
    public NumeroClientesAngariadosInvalidException() {
        super("O Numero de clientes angariados é inválido!!");
    }

    public NumeroClientesAngariadosInvalidException(String mensagem) {
        super(mensagem);
    }
}