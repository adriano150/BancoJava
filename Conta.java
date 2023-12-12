package entities;

public class Conta {
    protected int numero;
    protected String nomeTitular;
    protected double saldo;

    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
