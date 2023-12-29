package sprint1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EsporadicoTest {

    private Esporadico esporadico;

    @BeforeEach
    void setUp() throws NumeroHorasPermanecimentoException {
        esporadico = new Esporadico("Nome", "Morada", Genero.MASCULINO, new Data(), 1.90f, 170, 5, 2, 10);
    }


    @Test
    void testCalcularPagamentoComHorasExtras() {
        System.out.println("Calculo do pagamento com horas extras aulas");

        esporadico.setNumeroHorasPermanecimento(15);

        double expectedPagamento = Math.ceil(esporadico.horasExtraAulas()) * Esporadico.getPrecoHora() + esporadico.custoAulas();
        assertEquals(expectedPagamento, esporadico.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoSemHorasExtras() {
        System.out.println("Calculo do pagamento sem horas extras aulas");

        esporadico.setNumeroHorasPermanecimento(7);

        double expectedPagamento = esporadico.custoAulas();
        assertEquals(expectedPagamento, esporadico.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoComAulasZero() {
        System.out.println("Calculo do pagamento com zero aulas");

        esporadico.setNumeroHorasPermanecimento(15);
        esporadico.setNumeroAulas(0);
        esporadico.setNumeroAulasHidroginastica(0);

        double expectedPagamento = Math.ceil(esporadico.horasExtraAulas()) * Esporadico.getPrecoHora();
        assertEquals(expectedPagamento, esporadico.calcularPagamento());
    }

    @Test
    public void testCalcularIMCNormal() {
        System.out.println("calcularIMC peso e altura normal");

        float resultado = esporadico.calcularIMC();
        assertEquals(47.09, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroAltura() {
        System.out.println("calcularIMC com 0 altura");

        esporadico.setAltura(0);

        float resultado = esporadico.calcularIMC();
        assertEquals(0.0f, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroPeso() {
        System.out.println("calcularIMC com 0 peso");

        esporadico.setPeso(0);

        float resultado = esporadico.calcularIMC();
        assertEquals(0, resultado, 0.01);
    }
}