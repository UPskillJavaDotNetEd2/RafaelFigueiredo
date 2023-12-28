package sprint1;

public class NumeroDeSessoesInvalidoException extends Exception  {
        public NumeroDeSessoesInvalidoException(){
            super("Erro: Numero de Sessoes Invalido!");
        }
        public NumeroDeSessoesInvalidoException(String msg){
            super(msg);
        }

}
