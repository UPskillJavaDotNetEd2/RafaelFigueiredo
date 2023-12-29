package sprint1;


public class NumeroHorasPermanecimentoException extends Exception  {
    public NumeroHorasPermanecimentoException(){
        super("Erro: Numero de Horas de Permanecimento Invalido!");
    }
    public NumeroHorasPermanecimentoException(String msg){
        super(msg);
    }

}
