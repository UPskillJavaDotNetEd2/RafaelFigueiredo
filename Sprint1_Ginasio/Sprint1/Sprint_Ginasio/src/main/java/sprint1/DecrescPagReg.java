package sprint1;

import java.util.Comparator;
/**
 * A classe DecrescPagReg implementa a interface Comparator para ordenar objetos do tipo Regular com base no pagamento
 * que devem efetuar no final do mês, por ordem decrescente.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 *
 */
public class DecrescPagReg implements Comparator {

    /**
     * Compara dois objetos Regular com base no pagamento, por ordem descrescente.
     *
     * @param o1 O primeiro objeto Regular a ser comparado.
     * @param o2 O segundo objeto Regular a ser comparado.
     * @return Um valor negativo, -1,  se o pagamento de o1 é maior que o pagamento de o2,
     *         um valor positivo, 1, se o pagamento de o1 é menor que o pagamento de o2,
     *         zero,0, se os pagamentos são iguais.
     */

    @Override
    public int compare(Object o1, Object o2) {

        double pagamento1 = ((Regular) o1).calcularPagamento();
        double pagamento2 = ((Regular) o1).calcularPagamento();

        if(pagamento1 > pagamento2)
            return -1;

        else if(pagamento1 < pagamento2)
            return 1;

        else
            return 0;
    }
}
