package sprint1;
/**
 * A classe do tipo Enumerado Genero representa uma enumeração com os géneros masculino e feminino.
 *
 * @author [Rafael Figueiredo, Sónia Ribeiro]
 */
public enum Genero {
    /**
     * Representa o género masculino.
     */
    MASCULINO {
        /**
         * Retorna uma representação de string para o género masculino.
         *
         * @return Uma string representando o género como "Masculino".
         */
        @Override
        public String toString(){
            return "Masculino";
        }
    },
    /**
     * Representa o género feminino.
     */
    FEMININO {
        /**
         * Retorna uma representação de string para o género feminino.
         *
         * @return Uma string representando o género como "Feminino".
         */
        @Override
        public String toString() {
            return "Feminino";
        }
    }
}
