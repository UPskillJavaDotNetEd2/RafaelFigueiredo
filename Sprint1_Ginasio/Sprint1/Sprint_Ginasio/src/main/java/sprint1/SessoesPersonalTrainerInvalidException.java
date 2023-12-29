package sprint1;

public class SessoesPersonalTrainerInvalidException extends RuntimeException{
    public SessoesPersonalTrainerInvalidException() {
        super("O Numero de sessões como Personal Trainer inválido!!");
    }

    public SessoesPersonalTrainerInvalidException(String mensagem) {
        super(mensagem);
    }
}
