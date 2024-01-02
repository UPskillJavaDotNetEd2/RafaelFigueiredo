package sprint1;

import org.upskill.utils.Data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual das opções corresponde à sua categoria de pessoa, que frequenta o ginásio?");
        System.out.println();
        String opcao1 = "Treinador";
        String opcao2 = "Funcionário";
        String opcao3 = "Cliente Convidado";
        String opcao4 = "Cliente Regular";
        String opcao5 = "Cliente Exporádico";
        System.out.printf("[1] %s%n[2] %s%n[3] %s%n[4] %s%n[5] %s%n", opcao1, opcao2, opcao3, opcao4, opcao5);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        int contador = 1;
        switch (escolha) {
            case 1:
                Treinador[] treinadores = new Treinador[3];
                do {

                    try {
                        System.out.printf("### Treinador %d ###\n", contador);
                        Treinador treinador = new Treinador();
                        System.out.printf("Identificador: TREI-%d\n",contador);
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        treinador.setNome(nome);
                        System.out.println("Morada: ");
                        String morada = scanner.nextLine();
                        treinador.setMorada(morada);
                        System.out.println("Género (Masculino/Feminino): ");
                        String genero = scanner.nextLine();
                        treinador.setGenero(genero);
                        Data data = lerData();
                        System.out.println("Vencimento: ");
                        String vencimento = scanner.nextLine();
                        treinador.setVencimento(Double.parseDouble(vencimento));
                        System.out.println("Número de sessões como Personal Trainer: ");
                        String sessoesPersonalTrainer = scanner.nextLine();
                        treinador.setSessoesPersonalTrainer(Integer.parseInt(sessoesPersonalTrainer));
                        System.out.println("Custo por sessão como Personal Trainer: ");
                        String custoSessao = scanner.nextLine();
                        treinador.setCustoSessao(Double.parseDouble(custoSessao));

                        treinadores[contador] = treinador;
                        contador++;

                    } catch (IdentificadorInvalidoException e) {
                        System.out.printf("** Erro no identificador ** \n%s\n", e.getMessage());
                    } catch (NomeInvalidoException e) {
                        System.out.printf("** Erro no nome ** \n%s\n", e.getMessage());
                    } catch (MoradaInvalidaException e) {
                        System.out.printf("** Erro na morada ** \n%s\n", e.getMessage());
                    } catch (GeneroInvalidoException e) {
                        System.out.printf("** Erro no gênero ** \n%s\n", e.getMessage());
                    } catch (VencimentoInvalidoException e) {
                        System.out.printf("** Erro no vencimento ** \n%s\n", e.getMessage());
                    } catch (SessoesPersonalTrainerInvalidException e) {
                        System.out.printf("** Erro no número de sessões ** \n%s\n", e.getMessage());
                    } catch (CustoPorSessaoInvalidoException e) {
                        System.out.printf("** Erro no custo por sessão ** \n%s\n", e.getMessage());

                    }
                } while (contador <= 3);
                break;
            case 2:

                Funcionario[] funcionarios = new Funcionario[3];
                do {

                    try {
                        System.out.printf("### Funcionário %d ###\n", contador);
                        Funcionario funcionario = new Funcionario();
                        System.out.printf("Identificador: FUNC-%d\n", contador);
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        funcionario.setNome(nome);
                        System.out.println("Morada: ");
                        String morada = scanner.nextLine();
                        funcionario.setMorada(morada);
                        System.out.println("Género (Masculino/Feminino): ");
                        String genero = scanner.nextLine();
                        funcionario.setGenero(genero);
                        Data data = lerData();
                        System.out.println("Número de clientes angariados: ");
                        String numeroClientesAngariados = scanner.nextLine();
                        funcionario.setNumeroClientesAngariados(Integer.parseInt(numeroClientesAngariados));

                        funcionarios[contador] = funcionario;
                        contador++;

                    } catch (IdentificadorInvalidoException e) {
                        System.out.printf("** Erro no identificador ** \n%s\n", e.getMessage());
                    } catch (NomeInvalidoException e) {
                        System.out.printf("** Erro no nome ** \n%s\n", e.getMessage());
                    } catch (MoradaInvalidaException e) {
                        System.out.printf("** Erro na morada ** \n%s\n", e.getMessage());
                    } catch (GeneroInvalidoException e) {
                        System.out.printf("** Erro no gênero ** \n%s\n", e.getMessage());
                    } catch (NumeroClientesAngariadosInvalidException e) {
                        System.out.printf("** Erro no número de clientes angariados ** \n%s\n", e.getMessage());
                    }
                } while (contador <= 3);
                break;
            case 3:
                Convidado[] convidados = new Convidado[3];
                do {

                    try {
                        System.out.printf("### Cliente Convidado %d ###\n", contador);
                        Convidado convidado = new Convidado();
                        System.out.printf("Identificador: CLI-CONVIDADO-%d\n", contador);
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        convidado.setNome(nome);
                        System.out.println("Morada: ");
                        String morada = scanner.nextLine();
                        convidado.setMorada(morada);
                        System.out.println("Género (Masculino/Feminino): ");
                        String genero = scanner.nextLine();
                        convidado.setGenero(genero);
                        Data data = lerData();
                        System.out.println("Número de horas de permanecimento: ");
                        String numeroHorasPermanecimento = scanner.nextLine();
                        convidado.setNumeroHorasPermanecimento(Integer.parseInt(numeroHorasPermanecimento));
                        System.out.println("Número de sessões: ");
                        String numeroSessoes = scanner.nextLine();
                        convidado.setNumeroSessoes(Integer.parseInt(numeroSessoes));
                        System.out.println("Custo por sessão: ");
                        String custoSessao = scanner.nextLine();
                        convidado.setCustoPorSessao(Integer.parseInt(custoSessao));
                        System.out.println("Banco de Horas: ");
                        String bancoHoras = scanner.nextLine();
                        convidado.setBancoHoras(Integer.parseInt(bancoHoras));

                        convidados[contador] = convidado;
                        contador++;

                    } catch (IdentificadorInvalidoException e) {
                        System.out.printf("** Erro no identificador ** \n%s\n", e.getMessage());
                    } catch (NomeInvalidoException e) {
                        System.out.printf("** Erro no nome ** \n%s\n", e.getMessage());
                    } catch (MoradaInvalidaException e) {
                        System.out.printf("** Erro na morada ** \n%s\n", e.getMessage());
                    } catch (GeneroInvalidoException e) {
                        System.out.printf("** Erro no gênero ** \n%s\n", e.getMessage());
                    } catch (NumeroHorasPermanecimentoInvalidoException e) {
                        System.out.printf("** Erro no número de horas de permanecimento ** \n%s\n", e.getMessage());
                    } catch (NumeroSessoesInvalidoException e) {
                        System.out.printf("** Erro no número de sessões ** \n%s\n", e.getMessage());
                    } catch (CustoPorSessaoInvalidoException e) {
                        System.out.printf("** Erro no custo por sessão ** \n%s\n", e.getMessage());
                    }

                } while (contador <= 3);
                break;
            case 4:
                Regular[] regulares = new Regular[3];
                do {

                    try {
                        System.out.printf("### Cliente Regular %d ###\n", contador);
                        Regular regular = new Regular();
                        System.out.printf("Identificador: CLI-REGULAR-%d\n", contador);
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        regular.setNome(nome);
                        System.out.println("Morada: ");
                        String morada = scanner.nextLine();
                        regular.setMorada(morada);
                        System.out.println("Género (Masculino/Feminino): ");
                        String genero = scanner.nextLine();
                        regular.setGenero(genero);
                        Data data = lerData();
                        System.out.println("Custo da mensalidade: ");
                        String custoMensalidade = scanner.nextLine();
                        regular.setCustoMensalidade(Integer.parseInt(custoMensalidade));
                        System.out.println("Número de sessões: ");
                        String numeroSessoes = scanner.nextLine();
                        regular.setNumeroSessoes(Integer.parseInt(numeroSessoes));
                        System.out.println("Custo por sessão: ");
                        String custoSessao = scanner.nextLine();
                        regular.setCustoPorSessao(Integer.parseInt(custoSessao));
                        System.out.println("Estado: ");
                        String estado = scanner.nextLine();
                        regular.setEstado(estado);

                        regulares[contador] = regular;
                        contador++;

                    } catch (IdentificadorInvalidoException e) {
                        System.out.printf("** Erro no identificador ** \n%s\n", e.getMessage());
                    } catch (NomeInvalidoException e) {
                        System.out.printf("** Erro no nome ** \n%s\n", e.getMessage());
                    } catch (MoradaInvalidaException e) {
                        System.out.printf("** Erro na morada ** \n%s\n", e.getMessage());
                    } catch (GeneroInvalidoException e) {
                        System.out.printf("** Erro no gênero ** \n%s\n", e.getMessage());
                    } catch (CustoMensalidadeInvalidException e) {
                        System.out.printf("** Erro no custo da mensalidade ** \n%s\n", e.getMessage());
                    } catch (NumeroSessoesInvalidoException e) {
                        System.out.printf("** Erro no número de sessões ** \n%s\n", e.getMessage());
                    } catch (CustoPorSessaoInvalidoException e) {
                        System.out.printf("** Erro no custo por sessão ** \n%s\n", e.getMessage());
                    }catch (EstadoInvalidoException e) {
                        System.out.printf("** Erro no estado ** \n%s\n", e.getMessage());
                    }

                } while (contador <= 3);
                break;
            case 5:
                Esporadico[] esporadicos = new Esporadico[3];
                do {

                    try {
                        System.out.printf("### Cliente Esporádico %d ###\n", contador);
                        Esporadico esporadico = new Esporadico();
                        System.out.printf("Identificador: CLI-ESPORÁDICO-%d\n", contador);
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        esporadico.setNome(nome);
                        System.out.println("Morada: ");
                        String morada = scanner.nextLine();
                        esporadico.setMorada(morada);
                        System.out.println("Género (Masculino/Feminino): ");
                        String genero = scanner.nextLine();
                        esporadico.setGenero(genero);
                        Data data = lerData();
                        System.out.println("Número de horas de permanecimento: ");
                        String numeroHorasPermanecimento = scanner.nextLine();
                        esporadico.setNumeroHorasPermanecimento(Integer.parseInt(numeroHorasPermanecimento));

                        esporadicos[contador] = esporadico;
                        contador++;

                    } catch (IdentificadorInvalidoException e) {
                        System.out.printf("** Erro no identificador ** \n%s\n", e.getMessage());
                    } catch (NomeInvalidoException e) {
                        System.out.printf("** Erro no nome ** \n%s\n", e.getMessage());
                    } catch (MoradaInvalidaException e) {
                        System.out.printf("** Erro na morada ** \n%s\n", e.getMessage());
                    } catch (GeneroInvalidoException e) {
                        System.out.printf("** Erro no gênero ** \n%s\n", e.getMessage());
                    }catch (NumeroHorasPermanecimentoInvalidoException e) {
                        System.out.printf("** Erro no número de horas de Permanecimento ** \n%s\n", e.getMessage());
                    }

                } while (contador <= 3);
                break;
            default:
                System.out.println("Opção inválida!");
        }


    }
    public static Data lerData() {

        Scanner ler = new Scanner(System.in);
        Data d = new Data();
        boolean dataInvalida = true;

        System.out.print("Data de nascimento (ano/mes/dia): ");
        do {
            try {
                String[] data = ler.nextLine().split("/");
                if (data.length != 3) {
                    throw new NumberFormatException();
                }
                int ano = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[2]);

                d.setData(ano, mes, dia);

                dataInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Formato é inválido!!");
                System.out.print("Digite novamente a data de nascimento (ano/mes/dia): ");
            } catch (DiaInvalidoException | MesInvalidoException e) {
                System.out.println(e.getMessage());
                System.out.print("Digite novamente a data de nascimento (ano/mes/dia): ");
            }
        } while (dataInvalida);

        return d;
    }

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
