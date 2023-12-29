package sprint1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.upskill.utils.Data;

class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Nome", "Morada", Genero.MASCULINO, new Data(), 5);
    }

    @Test
    void testCalcularVencimento() {
        System.out.println("Caclculo do vencimento do Funcionario");

        double expectedVencimento = Funcionario.getVencimentoBase() + funcionario.getNumeroClientesAngariados() * Funcionario.getComissao();
        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoSemClientesAngariados() {
        System.out.println("Caclculo do vencimento do Funcionario sem clientes angariado e salario base");

        funcionario.setNumeroClientesAngariados(0);

        double expectedVencimento = Funcionario.getVencimentoBase();
        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoBaseZero() {
        System.out.println("Caclculo do vencimento do Funcionario com clientes angariado e salario zero");

        Funcionario.setVencimentoBase(0);

        double expectedVencimento = Funcionario.getVencimentoBase() + funcionario.getNumeroClientesAngariados() * Funcionario.getComissao();

        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }

    @Test
    void testCalcularVencimentoZero() {
        System.out.println("Caclculo do vencimento do Funcionario sem clientes angariado e salario zero");

        Funcionario.setVencimentoBase(0);
        funcionario.setNumeroClientesAngariados(0);

        double expectedVencimento = Funcionario.getVencimentoBase() + funcionario.getNumeroClientesAngariados() * Funcionario.getComissao();

        assertEquals(expectedVencimento, funcionario.calcularVencimento());
    }
}
