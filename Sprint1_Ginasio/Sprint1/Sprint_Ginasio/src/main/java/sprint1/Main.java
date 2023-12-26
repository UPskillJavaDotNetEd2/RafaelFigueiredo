package sprint1;

import org.upskill.utils.Data;

public class Main {
    public static void main(String[] args) {
        /**
         * Criação de 10 instâncias do tipo Data.
         */

        Data d1 = new Data(1992, 4, 6);
        Data d2 = new Data(1990, 12, 16);
        Data d3 = new Data(1982, 3, 15);
        Data d4 = new Data(2002, 1, 17);
        Data d5 = new Data(1999, 2, 3);
        Data d6 = new Data(1983, 3, 18);
        Data d7 = new Data(1996, 8, 14);
        Data d8 = new Data(1955, 4, 1);
        Data d9 = new Data(1974, 4, 25);
        Data d10 = new Data(2006, 11, 9);

        /**
         * Criação de uma instância da classe Ginásio
         */
        Ginasio ginasio = new Ginasio("Puxa-Ferro", "Travessa do Ferro, Peso da Regua - Portugal");
        /**
         * Criação de 3 objetos do tipo Convidado
         */
        Convidado cc1 = new Convidado("David Gomes", "Rua de São Paulo", Genero.MASCULINO, d1, 1.78f, 85, 23, 4, 50, 1, 50, 1000);
        Convidado cc2 = new Convidado("Paulo Lopes", "Rua de Direita", Genero.MASCULINO, d2, 1.93f, 102, 11, 10, 21, 0, 0, 359);
        Convidado cc3 = new Convidado("Ana Rita", "Travessa do Desconfiado", Genero.FEMININO, d3, 1.75f, 70, 9, 3, 27, 5, 20, 23);
        /**
         * Criação de 3 objetos do tipo Esporadico
         */
        Esporadico ce1 = new Esporadico("Carla Sousa", "Avenida Pricipal", Genero.FEMININO, d4, 1.55f, 56, 2, 0, 12);
        Esporadico ce2 = new Esporadico("João Silva", "Rua Secundária", Genero.MASCULINO, d5, 1.75f, 70, 3, 9, 15);
        Esporadico ce3 = new Esporadico("Ana Oliveira", "Travessa da Colina", Genero.FEMININO, d5, 1.60f, 65, 4, 6, 10);
        /**
         * Criação de 3 objetos do tipo Regular
         */
        Regular cr1 = new Regular("Pedro Costa", "Rua Principal", Genero.MASCULINO, d6, 1.80f, 145, 0, 0, 50.0, 0, 0, false);
        Regular cr2 = new Regular("Marta Santos", "Avenida Central", Genero.FEMININO, d7, 1.65f, 60, 4, 4, 45.0, 18, 10);
        Regular cr3 = new Regular("Ricardo Oliveira", "Travessa das Flores", Genero.MASCULINO, d8, 1.75f, 70, 0, 0, 35.0, 12, 13.5);
        /**
         * Criação de 3 objetos do tipo Treinador
         */
        Treinador t1 = new Treinador("Luís Mendes", "Rua dos Desportos", Genero.MASCULINO, d3, 1200.0, 90, 9.0);
        Treinador t2 = new Treinador("Ana Rocha", "Avenida do Fitness", Genero.FEMININO, d10, 1050.0, 30, 7.5);
        Treinador t3 = new Treinador("Sérigo Oliveira", "Travessa da Saúde", Genero.MASCULINO, d1, 850.0, 174, 4.5);
        /**
         * Criação de 3 objetos do tipo Funcionario
         */
        Funcionario f1 = new Funcionario("Miguel Silva", "Rua dos Negócios", Genero.MASCULINO, d2, 10);
        Funcionario f2 = new Funcionario("Inês Rodrigues", "Avenida Comercial", Genero.FEMININO, d4, 103);
        Funcionario f3 = new Funcionario("Carlos Pereira", "Travessa das Vendas", Genero.MASCULINO, d5, 0);

        /**
         * Armazenamento na instância ginasio,dos objetos acima criados.
         */
        ginasio.adicionarPessoa(cc1);
        ginasio.adicionarPessoa(cc2);
        ginasio.adicionarPessoa(cc3);

        ginasio.adicionarPessoa(cr1);
        ginasio.adicionarPessoa(cr2);
        ginasio.adicionarPessoa(cr3);

        ginasio.adicionarPessoa(ce1);
        ginasio.adicionarPessoa(ce2);
        ginasio.adicionarPessoa(ce3);

        ginasio.adicionarPessoa(t1);
        ginasio.adicionarPessoa(t2);
        ginasio.adicionarPessoa(t3);

        ginasio.adicionarPessoa(f1);
        ginasio.adicionarPessoa(f2);
        ginasio.adicionarPessoa(f3);
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
