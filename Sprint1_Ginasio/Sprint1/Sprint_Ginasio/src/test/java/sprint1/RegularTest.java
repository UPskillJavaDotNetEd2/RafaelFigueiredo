package sprint1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularTest {

    private Regular regular;

    @BeforeEach
    void setUp() {
        regular = new Regular("Nome", "Morada", Genero.MASCULINO, new Data(), 1.75f, 70, 5, 2, 50.0, 10, 8.0, true);
    }

    @Test
    void testCalcularPagamento() {
        System.out.println("Calculo do pagemnto do Cliente Regular");

        double expectedPagamento = regular.getCustoMensalidade() + regular.pagamentoAulasHidro() + regular.pagamentoPt();
        assertEquals(expectedPagamento, regular.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoSemAulasHidro() {
        System.out.println("Calculo do pagemnto do Cliente Regular sem aulas hidro");

        regular.setNumeroAulasHidroginastica(0);

        double expectedPagamento = regular.getCustoMensalidade() + regular.pagamentoPt();
        assertEquals(expectedPagamento, regular.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoSemSessoesPt() {
        System.out.println("Calculo do pagemnto do Cliente Regular sem sessoes com PT");

        regular.setNumeroSessoes(0);

        double expectedPagamento = regular.getCustoMensalidade() + regular.pagamentoAulasHidro();
        assertEquals(expectedPagamento, regular.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoMensalidadeZero() {
        System.out.println("Calculo do pagemnto do Cliente Regular com custo de sessao com PT a zero");

        regular.setCustoMensalidade(0);

        double expectedPagamento = regular.getCustoMensalidade() + regular.pagamentoAulasHidro() + regular.pagamentoPt();
        assertEquals(expectedPagamento, regular.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoPTZero() {
        System.out.println("Calculo do pagemnto do Cliente Regular com custo de sessao com PT a zero");

        regular.setCustoPorSessao(0);

        double expectedPagamento = regular.getCustoMensalidade() + regular.pagamentoAulasHidro() + regular.pagamentoPt();
        assertEquals(expectedPagamento, regular.calcularPagamento());
    }

    @Test
    public void testCalcularIMCNormal() {
        System.out.println("calcularIMC peso e altura normal");

        float resultado = regular.calcularIMC();
        assertEquals(22.857, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroAltura() {
        System.out.println("calcularIMC com 0 altura");

        regular.setAltura(0);

        float resultado = regular.calcularIMC();
        assertEquals(0.0f, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroPeso() {
        System.out.println("calcularIMC com 0 altura");

        regular.setPeso(0);

        float resultado = regular.calcularIMC();
        assertEquals(0, resultado, 0.01);
    }
}
