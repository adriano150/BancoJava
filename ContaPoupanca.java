package entities;

public class ContaPoupanca extends Conta {
    private static final double LIMITE_EMPRESTIMO = 500;

    public ContaPoupanca(String nomeTitular) {
        super(nomeTitular);
    }

    public void depositar(double valor) {
        depositar(valor);
        System.out.println("Você possui um limite de empréstimo de: " + LIMITE_EMPRESTIMO);
    }
}

