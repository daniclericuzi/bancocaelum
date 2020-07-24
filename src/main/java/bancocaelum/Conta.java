package bancocaelum;

public class Conta {
    private int agencia;
    private int contaBancaria;
    private double saldo;
    private Titular titular;

    public Conta(int agencia, int contaBancaria, double saldo, Titular titular) {
        this.agencia = agencia;
        this.contaBancaria = contaBancaria;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(int contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
