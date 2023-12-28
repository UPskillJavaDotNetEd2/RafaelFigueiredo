package sprint1;


public class CustoPorSessaoInvalidoException extends Exception{
    public CustoPorSessaoInvalidoException(){
        super("Erro: Custo por Sessao Invalido!");
    }
    public CustoPorSessaoInvalidoException(String msg){
        super(msg);
    }
}
