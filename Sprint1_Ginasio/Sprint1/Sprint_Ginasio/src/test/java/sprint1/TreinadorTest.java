package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

/**

 Permite testar o método de cálculo do vencimento para os treinadores

 **/


class TreinadorTest {

    private Treinador treinador;

    @BeforeEach
    void setUp() {

        treinador = new Treinador("Nome", "Morada", Genero.MASCULINO, new Data(), 1000, 5, 50);
    }

    @Test
    void testCalcularVencimento() {
        System.out.println("Cálculo do vencimento do Treinador");

        double expectedVencimento = 1250;

        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoSemSessoesPersonalTrainer() {
        System.out.println("Cálculo do vencimento do Treinador com zero sessões como personal trainer");

        treinador.setSessoesPersonalTrainer(0);

        double expectedVencimento = 1000;
        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoComVencimentoZero() {
        System.out.println("Cálculo do vencimento do Treinador com vencimento base a 0");

        treinador.setVencimento(0);

        double expectedVencimento = 250;
        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoComCustoSessaoZero() {
        System.out.println("Calculo do vencimento do Treinador com custo de sessão PT a 0");

        treinador.setCustoSessao(0);

        double expectedVencimento = 1000;

        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }
}