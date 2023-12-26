package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

/**

 Permite testar o método de cálculo do vencimento para os funcionarios

 **/


class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Nome", "Morada", Genero.MASCULINO, new Data(), 5);
    }

    @Test
    void testCalcularVencimento() {
        System.out.println("Cálculo do vencimento do Funcionario");

        double expectedVencimento = 900;

        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoSemClientesAngariados() {
        System.out.println("Cálculo do vencimento do Funcionario sem clientes angariado e salario base");

        funcionario.setNumeroClientesAngariados(0);

        double expectedVencimento =800;

        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoBaseZero() {
        System.out.println("Cálculo do vencimento do Funcionario com clientes angariado e salario zero");

        Funcionario.setVencimentoBase(0);

        double expectedVencimento = 100;

        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoZero() {
        System.out.println("Cálculo do vencimento do Funcionario sem clientes angariado e salario zero");

        Funcionario.setVencimentoBase(0);
        funcionario.setNumeroClientesAngariados(0);

        double expectedVencimento = 0;

        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }
}
