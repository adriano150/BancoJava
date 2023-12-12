package entities;

public class ContaCorrente extends Conta {
    private static final double LIMITE_CREDITO = 1000;

    public ContaCorrente(String nomeTitular) {
        super(nomeTitular);
    }

    public void depositar(double valor) {
        depositar(valor);
        System.out.println("Você possui um limite de crédito de: " + LIMITE_CREDITO);
    }
}
