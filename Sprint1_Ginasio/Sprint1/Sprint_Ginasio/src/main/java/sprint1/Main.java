package sprint1;

import org.upskill.utils.Data;

public class Main {
    public static void main(String[] args) {

        /**
         * Impressão da string "#####-:- GINÁSIO -:-####".
         */
        System.out.println("#####-:- GINÁSIO " + ginasio.getNome() + " -:-####");

        System.out.println();
        /**
         * Impressão da string "### SALDO DO GINÁSIO - RECEITAS E GASTOS ###".
         */
        System.out.println("### SALDO DO GINÁSIO - RECEITAS E GASTOS ###");
        System.out.println();
        /**
         * Impressão das receitas, gastos e o saldo do ginásio.
         */
        ginasio.calcularEApresentarSaldo();

        System.out.println();
        /**
         * Impressão da string "### PESSOAS DO GINÁSIO ###"
         */
        System.out.println("### PESSOAS DO GINÁSIO ###");
        System.out.println();
        /**
         * Impressão da lista de pessoas que frequentam o ginásio.
         */
        System.out.println(ginasio);

        System.out.println();
        /**
         * Impressão da string "### LISTA DAS PESSOAS QUE FREQUENTAM O GINÁSIO POR ORDEM ALFABÉTICA DO NOME ###".
         */
        System.out.println("### LISTA DAS PESSOAS QUE FREQUENTAM O GINÁSIO POR ORDEM ALFABÉTICA DO NOME ###");
        System.out.println();
        /**
         * Impressão de uma lista das pessoas que frequentam o ginásio por ordem alfabética do nome.
         */
        ginasio.pessoasOrdemAlfab();
        /**
         * Impressão da string "### LISTA DE TREINADORES - NOME, IDADE, NºSESSÕES, VENCIMENTO ###".
         */
        System.out.println("### LISTA DE TREINADORES - NOME, IDADE, NºSESSÕES, VENCIMENTO ###");
        System.out.println();
        /**
         * Impressão de uma lista dos treinadores, com o nome, idade , nº de sessões e vencimento
         */
        ginasio.listarTreinadores();

        System.out.println();
        /**
         * Impressão da string "### VENCIMENTO TOTAL DOS TREINADORES ###"
         */
        System.out.println("### VENCIMENTO TOTAL DOS TREINADORES ###");

        System.out.println();

        /**
         * Impressão da string "Vencimento total dos treinadores: " e o valor total do vencimento dos treinadores
         */
        System.out.printf("Vencimento total dos treinadores: %.2f€%n\n",ginasio.vencimentoTreinadores());

        System.out.println();
        /**
         * Impressão da string "### VENCIMENTO TOTAL DOS FUNCIONÁRIOS ###"
         */

        System.out.println("### VENCIMENTO TOTAL DOS FUNCIONÁRIOS ###");

        System.out.println();
        /**
         * Impressão da string "Vencimento total dos funcionários: " e o vencimento total dos treinadores
         */

        System.out.printf("Vencimento total dos funcionários: %.2f€%n\n",ginasio.vencimentoFuncionarios());

        System.out.println();
        /**
         * Impressão da string "### TOTAL DE CLIENTES QUE FREQUENTARAM O GINÁSIO ###"
         */

        System.out.println("### TOTAL DE CLIENTES QUE FREQUENTARAM O GINÁSIO ###");

        System.out.println();
        /**
         * Impressão da string "Total de clientes deste mês: " e total de clientes.
         */

        System.out.printf("Total de clientes deste mês: %d\n",ginasio.contarClientes());

        System.out.println();
        /**
         * Impressão da string "### VALOR A PAGAR POR CADA CLIENTE E RESPECTIVO TOTAL ###"
         */

        System.out.println("### VALOR A PAGAR POR CADA CLIENTE E RESPECTIVO TOTAL ###");
        System.out.println();
        /**
         * Impressão de uma lista dos clientes com o valor a pagar por cada cliente e o valor
         * total de todos os clientes
         */
        ginasio.calcularPagamentoClientes();

        System.out.println();
        /**
         * Impressão da string "### LISTA DE CLIENTES REGULARES ATIVOS POR ORDEM DECRESCENTE DO VALOR DE PAGAMENTO TOTAL ###"
         */

        System.out.println("### LISTA DE CLIENTES REGULARES ATIVOS POR ORDEM DECRESCENTE DO VALOR DE PAGAMENTO TOTAL ###");
        System.out.println();
        /**
         * Impressão de uma lista dos clientes regulares ativos por ordem decrescente do valor de pagamento total
         */
        ginasio.clientesAtivos();

        System.out.println();

        /**
         * Impressão da string "### MOSTRAR LISTA DE CLIENTES POR ORDEM CRESCENTE DE IMC -> NUMERO AULAS -> ORDEM ALFABÉTICA DE NOME ###"
         */
        System.out.println("### MOSTRAR LISTA DE CLIENTES POR ORDEM CRESCENTE DE IMC -> NUMERO AULAS -> ORDEM ALFABÉTICA DE NOME ###");
        System.out.println();
        /**
         * Impressão de uma lista dos clientes por ordem crescente de IMC e em caso de terem o mesmo IMC, por ordem decrescente
         * do número de aulas e no caso de terem o mesmo IMC e o mesmo número de aulas, por ordem alfabética do nome.
         */

        ginasio.mostrarClientesPorOrdemIMC();

        System.out.println();
        /**
         * Impressão da string "### MÉDIA DE IMC POR GÉNERO ###"
         */

        System.out.println("### MÉDIA DE IMC POR GÉNERO ###");
        System.out.println();
        /**
         * Impressão da média do IMC para o género masculino e para o género feminino.
         */

        ginasio.calcularMediaIMC();

        System.out.println();

        System.out.println("### ADICIONAR UMA NOVA PESSOA A GINÁSIO DEPOIS DE VERIFICAR SE ESTA JA SE ENCONTRA NO GINÁSIO ###");

        System.out.println();

        /**
         * Criação de 1 objeto do tipo Treinador
         */

        Treinador t4 = new Treinador("Laura Silva", "Avenida Municipal", Genero.FEMININO, d7, 900.0, 10, 9.0);

        System.out.println("### ADICIONAR O CLIENTE DAVID GOMES ###");

        System.out.println();

        /**
         * Adiciona uma nova pessoa ao ginásio após verificar se ela já se encontra no ginásio.
         * Se a pessoa já existir, a adição não é realizada e é exibida uma mensagem indicando que a pessoa já está na lista do ginásio.
         * Se a pessoa não existir, ela é adicionada  à lista do ginásio.
         *
         * @param cr1 A pessoa a ser adicionada ao ginásio.
         * @return {@code true} se a pessoa foi adicionada com sucesso, {@code false} se a pessoa já existir na lista do ginásio.
         */

        if (ginasio.adicionarPessoa(cr1)) {
            System.out.println("Pessoa adicionada com sucesso!");
        } else {
            System.out.println("Pessoa já existe na lista do ginásio!");
        }

        System.out.println();

        System.out.println("### ADICIONAR A NOVA TREINADORA DO GINÁSIO ###");

        System.out.println();

        /**
         * Adiciona uma nova pessoa ao ginásio após verificar se ela já se encontra no ginásio.
         * Se a pessoa já existir, a adição não é realizada e é exibida uma mensagem indicando que a pessoa já está na lista do ginásio.
         * Se a pessoa não existir, ela é adicionada  à lista do ginásio.
         *
         * @param t4 A pessoa a ser adicionada ao ginásio.
         * @return {@code true} se a pessoa foi adicionada com sucesso, {@code false} se a pessoa já existir na lista do ginásio.
         */

        if (ginasio.adicionarPessoa(t4)) {
            System.out.println("Pessoa adicionada com sucesso!");
        } else {
            System.out.println("Pessoa já existe na lista do ginásio!");
        }

        System.out.println();

        System.out.println("### LISTA DE TREINADORES DO GINÁSIO ATUALIZADA ###");

        System.out.println();

        /**
         * Exibe a lista de treinadores do ginásio atualizada.
         */
         ginasio.listarTreinadores();
    }
}
