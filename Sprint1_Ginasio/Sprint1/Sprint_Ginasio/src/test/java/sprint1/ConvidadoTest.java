package sprint1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvidadoTest {

    private Convidado convidado;

    @BeforeEach
    void setUp() {
        convidado = new Convidado("Nome", "Morada", Genero.MASCULINO, new Data(), 1.75f, 70, 5, 2, 10, 3, 5.0, 0);
    }

    @Test
    void testCalcularPagamento() {
        System.out.println("Calcular Pagamento");

        double expectedPagamento = (convidado.getNumeroHorasPermanecimento()-convidado.totalAulas()) * Convidado.getPrecoHora() +
                convidado.custoAulas() + convidado.pagamentoPt();

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoBancoHorasNegativo() {
        System.out.println("Calcular Pagamento com Banco de Horas a Negativo");
        convidado.setBancoHoras(-15);
        double expectedPagamento = (15+ convidado.getNumeroHorasPermanecimento()-convidado.totalAulas()) * Convidado.getPrecoHora() +
                convidado.custoAulas() + convidado.pagamentoPt();

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoBancoHorasPositivo() {
        System.out.println("Calcular Pagamento com Banco de Horas a Positivo");
        convidado.setBancoHoras(15);
        double expectedPagamento = convidado.custoAulas() + convidado.pagamentoPt();

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoBancoHorasZero() {
        System.out.println("Calcular Pagamento com Banco de Horas a Zero");
        convidado.setBancoHoras(0);
        double expectedPagamento = (convidado.getNumeroHorasPermanecimento()-convidado.totalAulas()) * Convidado.getPrecoHora() +
                convidado.custoAulas() + convidado.pagamentoPt();

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoHorasExtraAulas() {
        System.out.println("Calcular Pagamento Com Horas Extra Aulas");
        convidado.setNumeroHorasPermanecimento(20);
        double expectedPagamento = Math.abs(convidado.horasExtraAulas()) * Convidado.getPrecoHora() +
                convidado.custoAulas() + convidado.pagamentoPt();

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoSemHorasExtraAulas() {
        System.out.println("Calcular Pagamento Sem Horas Extra Aulas");
        convidado.setNumeroHorasPermanecimento(7);
        double expectedPagamento = convidado.custoAulas() + convidado.pagamentoPt();

        assertEquals(expectedPagamento, convidado.calcularPagamento());
    }

    @Test
    public void testCalcularIMCNormal() {
        System.out.println("calcularIMC peso e altura normal");

        float resultado = convidado.calcularIMC();
        assertEquals(22.857, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroAltura() {
        System.out.println("calcularIMC com 0 altura");

        convidado.setAltura(0);
        float resultado = convidado.calcularIMC();
        assertEquals(0.0f, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroPeso() {
        System.out.println("calcularIMC com 0 altura");

        convidado.setPeso(0);
        float resultado = convidado.calcularIMC();
        assertEquals(0.0f, resultado, 0.01);
    }
}