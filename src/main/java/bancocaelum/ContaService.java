package bancocaelum;

public class ContaService {

    public boolean verificarSaldoDisponivel (double valor, Conta minhaConta) {
        boolean temSaldo = true;
        if (minhaConta.getSaldo() < valor) {
            temSaldo = false;
        }
        return temSaldo;

    }
    public void sacar(double valor, Conta minhaConta) {
        double novoSaldo = minhaConta.getSaldo() - valor;
        minhaConta.setSaldo(novoSaldo);
    }

    public void depositar(double valor, Conta minhaConta) {
        double novoSaldo = minhaConta.getSaldo() + valor;
        minhaConta.setSaldo(novoSaldo);
    }

    public void transferir(double valor, Conta minhaConta, Conta outraConta ) {
        sacar(valor, minhaConta);
        depositar(valor, outraConta);
    }
}
