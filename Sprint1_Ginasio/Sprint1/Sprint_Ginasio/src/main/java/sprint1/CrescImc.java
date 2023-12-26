package sprint1;

import java.util.Comparator;
/**
 * Classe CrescImc implementa a interface Comparator para ordenar objetos do tipo Cliente com base no IMC por ordem crescente,
 * número total de aulas por ordem decrescente e nome dos clientes por ordem alfabética.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 *
 */
public class CrescImc implements Comparator {

    /**
     * Compara dois objetos do tipo Cliente com base no IMC, número total de aulas e nome.
     *
     * @param o1 O primeiro objeto Cliente a ser comparado.
     * @param o2 O segundo objeto Cliente a ser comparado.
     * @return Um valor negativo, -1, se o IMC de o1 é menor que o IMC de o2,
     *         um valor positivo, 1, se o IMC de o1 é maior que o IMC de o2,
     *         no caso de terem o mesmo IMC, um valor negativo se o número total de aulas de o1 é maior que o de o2,
     *         um valor positivo se o número total de aulas de o1 é menor que o de o2,
     *         e no caso de terem o mesmo IMC e o mesmo número total de aulas, compara os nomes ordenando-os por ordem alfabética.
     */

    public int compare(Object o1, Object o2) {
        float imc1 = ((Cliente) o1).calcularIMC();
        float imc2 = ((Cliente) o2).calcularIMC();
        int numAulas1 = ((Cliente) o1).totalAulas();
        int numAulas2 = ((Cliente) o2).totalAulas();

        if (imc1 < imc2)
            return -1;
        else if (imc1 > imc2)
            return 1;
        else
        if(numAulas1 > numAulas2 )
            return -1;
        else if(numAulas1 < numAulas2)
            return 1;
        else return ((Cliente) o1).getNome().compareToIgnoreCase(((Cliente)  o2).getNome());
    }
}

