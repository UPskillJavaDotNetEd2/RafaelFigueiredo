package org.upskill.utils;

public class MesInvalidoException extends RuntimeException{
    public MesInvalidoException() {
        super("Mês é inválido!!");
    }

    public MesInvalidoException(String mensagem) {
        super(mensagem);
    }
}
