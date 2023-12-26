package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

/**

 Permite testar o método de cálculo do pagamento e calculo do IMC para os clientes convidados

 **/


class ConvidadoTest {

    private Convidado convidado;

    @BeforeEach
    void setUp() {
        convidado = new Convidado("Nome", "Morada", Genero.MASCULINO, new Data(), 1.75f, 70, 5, 2, 10, 3, 5.0, 0);
    }

    @Test
    void testCalcularPagamento() {
        System.out.println("Calcular Pagamento");

        double expectedPagamento = 77;

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoBancoHorasNegativo() {
        System.out.println("Calcular Pagamento com Banco de Horas a Negativo");
        convidado.setBancoHoras(-15);

        double expectedPagamento = 167;

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoBancoHorasPositivo() {
        System.out.println("Calcular Pagamento com Banco de Horas a Positivo");
        convidado.setBancoHoras(15);

        double expectedPagamento = 59;

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoBancoHorasZero() {
        System.out.println("Calcular Pagamento com Banco de Horas a Zero");
        convidado.setBancoHoras(0);

        double expectedPagamento = 77;

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoHorasExtraAulas() {
        System.out.println("Calcular Pagamento Com Horas Extra Aulas");
        convidado.setNumeroHorasPermanecimento(20);

        double expectedPagamento = 137;

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoSemHorasExtraAulas() {
        System.out.println("Calcular Pagamento Sem Horas Extra Aulas");
        convidado.setNumeroHorasPermanecimento(7);

        double expectedPagamento = 59;

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    public void testCalcularIMCNormal() {
        System.out.println("calcular IMC peso e altura normal");

        float resultado = convidado.calcularIMC();

        assertEquals(22.857, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroAltura() {
        System.out.println("calcular IMC com 0 altura");

        convidado.setAltura(0);

        float resultado = convidado.calcularIMC();

        assertEquals(0.0f, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroPeso() {
        System.out.println("calcular IMC com 0 Peso");

        convidado.setPeso(0);
        float resultado = convidado.calcularIMC();
        assertEquals(0.0f, resultado, 0.01);
    }
}