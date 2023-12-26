package sprint1;
/**
 * A classe do tipo Enumerado Tipo representa uma enumeração com os tipos de clientes que frequentam o ginásio.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public enum Tipo {
    /**
     * Representa o tipo Regular.
     */
    REGULAR {
        /**
         * Retorna uma representação de string para o tipo regular.
         *
         * @return Uma string representando o tipo de cliente como "Regular".
         */
        @Override
        public String toString(){
            return "REGULAR";
        }
    },
    /**
     * Representa o tipo Esporádico.
     */
    ESPORADICO {
        /**
         * Retorna uma representação de string para o tipo esporádico.
         *
         * @return Uma string representando o tipo de cliente como "Esporádico".
         */
        @Override
        public String toString() {
            return "ESPORADICO";
        }
    },
    /**
     * Representa o tipo Convidado.
     */
    CONVIDADO {
        /**
         * Retorna uma representação de string para o tipo convidado.
         *
         * @return Uma string representando o tipo de cliente como "Convidado".
         */
        @Override
        public String toString() {
            return "CONVIDADO";
        }
    }
}
