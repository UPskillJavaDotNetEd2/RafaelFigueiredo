package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;


/**

 Permite testar o método de cálculo do pagamento e calculo do IMC para os clientes esporádicos

 **/

class EsporadicoTest {

    private Esporadico esporadico;

    @BeforeEach
    void setUp() {
        esporadico = new Esporadico("Nome", "Morada", Genero.MASCULINO, new Data(), 1.90f, 170, 5, 2, 10);
    }


    @Test
    void testCalcularPagamentoComHorasExtras() {
        System.out.println("Cálculo do pagamento com horas extras aulas");

        esporadico.setNumeroHorasPermanecimento(15);

        double expectedPagamento = 84;

        assertEquals(expectedPagamento, esporadico.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoSemHorasExtras() {
        System.out.println("Cálculo do pagamento sem horas extras aulas");

        esporadico.setNumeroHorasPermanecimento(7);

        double expectedPagamento = 44;

        assertEquals(expectedPagamento, esporadico.calcularPagamento());
    }

    @Test
    void testCalcularPagamentoComAulasZero() {
        System.out.println("Cálculo do pagamento com zero aulas");

        esporadico.setNumeroHorasPermanecimento(15);
        esporadico.setNumeroAulas(0);
        esporadico.setNumeroAulasHidroginastica(0);

        double expectedPagamento = 75;
        assertEquals(expectedPagamento, esporadico.calcularPagamento());
    }

    @Test
    public void testCalcularIMCNormal() {
        System.out.println("calcular IMC com peso e altura normal");

        float resultado = esporadico.calcularIMC();
        assertEquals(47.09, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroAltura() {
        System.out.println("calcular IMC com 0 altura");

        esporadico.setAltura(0);

        float resultado = esporadico.calcularIMC();
        assertEquals(0.0f, resultado, 0.01);
    }

    @Test
    public void testCalcularIMCZeroPeso() {
        System.out.println("calcular IMC com 0 peso");

        esporadico.setPeso(0);

        float resultado = esporadico.calcularIMC();
        assertEquals(0, resultado, 0.01);
    }
}