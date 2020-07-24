package bancocaelum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main (String[] args) {

        Conta minhaConta = new Conta(3456,986543, 500.00, criarPessoaFisica());
        Conta outraConta = new Conta(3456,123456, 200.00, criarTitularPessoaJuridica());

        ContaService contaService = new ContaService();

        printContas(minhaConta, outraConta);

        contaService.depositar(200, minhaConta);

        printContas(minhaConta, outraConta);

        double valorSaque = 100;
        boolean podeSacar = contaService.verificarSaldoDisponivel (valorSaque, minhaConta);
        if (podeSacar) {
            System.out.println("Valor disponível. Sacando...");
            contaService.sacar(valorSaque, minhaConta);
        } else {
            System.out.println("Não é possível realizar o saque");
        }

        printContas(minhaConta, outraConta);

        double valorTransferencia = 300;
        boolean podeTransferir = contaService.verificarSaldoDisponivel(valorTransferencia, minhaConta);
        if (podeTransferir) {
            System.out.println("Valor disponível. Transferindo...");
            contaService.transferir(valorTransferencia, minhaConta, outraConta);
        } else {
            System.out.println("Não é possível realizar transferência");
        }

        printContas(minhaConta, outraConta);
    }

    /**
     * Cria um titular Pessoa Jurídica
     * @return um novo titular Pessoa Jurídica
     */
    private static TitularPessoaJuridica criarTitularPessoaJuridica() {
        Endereco enderecoPessoaJuridica = new Endereco("Alfredo Lima", "Recife", "Madalena",
                "PE", "569045");

        List<String> socios = new ArrayList();
        socios.add("Paulo Torres");
        socios.add("Rosangela Torres");


        return new TitularPessoaJuridica("987654321", LocalDate.of(2015, 3, 04), socios,
                "Lady", "PJ", enderecoPessoaJuridica);
    }

    /**
     * Cria um titular Pessoa Física
     * @return um novo titular Pessoa Física
     */
    public static TitularPessoaFisica criarPessoaFisica () {
        Endereco enderecoPessoaFisica = new Endereco("Maria Ramos", "Olinda",
                "Bairro Novo", "PE", "540890");

        return new TitularPessoaFisica("12345678", "F",
                LocalDate.of(1988, 9, 18), "Daniela Perez", "PF",
                enderecoPessoaFisica);
    }

    /**
     * Imprime os dados do Titular e Conta
     */
    public static void printContas(Conta minhaConta, Conta outraConta) {
        System.out.println("A conta de " + minhaConta.getTitular().getNome() + " é: " + minhaConta.getAgencia() + " " + minhaConta.getContaBancaria() + " e saldo " + minhaConta.getSaldo());
        System.out.println("A outra conta de: " + outraConta.getTitular().getNome() + " é: "+ outraConta.getAgencia() + " " +  outraConta.getContaBancaria() + " e saldo " + outraConta.getSaldo());
    }
}
