package sprint1;

public class IdentificadorInvalidoException extends RuntimeException {
    public IdentificadorInvalidoException(){
        super("Erro: Identificador inválido!");
    }
    public IdentificadorInvalidoException(String msg){
        super(msg);
    }
}
