package sprint1;

public class GeneroInvalidoException extends RuntimeException{
    public GeneroInvalidoException(){
        super("Erro: Género inválido!");
    }
    public GeneroInvalidoException(String msg){
        super(msg);
    }
}
