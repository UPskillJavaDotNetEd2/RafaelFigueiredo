package sprint1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

class TreinadorTest {

    private Treinador treinador;

    @BeforeEach
    void setUp() {

        treinador = new Treinador("Nome", "Morada", Genero.MASCULINO, new Data(), 1000, 5, 50);
    }

    @Test
    void testCalcularVencimento() {
        System.out.println("Calculo do vencimento do Treinador");

        double expectedVencimento = treinador.getVencimento() + treinador.pagamentoPt();
        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoSemSessoesPersonalTrainer() {
        System.out.println("Calculo do vencimento do Treinador com zero sessoes de personal trainer");

        treinador.setSessoesPersonalTrainer(0);

        double expectedVencimento = treinador.getVencimento() + treinador.pagamentoPt();
        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoComVencimentoZero() {
        System.out.println("Calculo do vencimento do Treinador com vencimento base a 0");

        treinador.setVencimento(0);

        double expectedVencimento = treinador.getVencimento() + treinador.pagamentoPt();
        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoComCustoSessaoZero() {
        System.out.println("Calculo do vencimento do Treinador com custo de sessao PT a 0");

        treinador.setCustoSessao(0);

        double expectedVencimento = treinador.getVencimento() + treinador.pagamentoPt();

        assertEquals(expectedVencimento, treinador.calcularVencimento());
    }
}