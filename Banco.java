package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar conta");
            System.out.println("2. Excluir conta");
            System.out.println("3. Sacar");
            System.out.println("4. Depositar");
            System.out.println("5. Solicitar empréstimo");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    cadastrarConta();
                    break;
                case 2:
                    excluirConta();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    depositar();
                    break;
                case 5:
                    solicitarEmprestimo();
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    scanner.close();
            }
        }
    }

    private void cadastrarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de conta (PF, PJ, Poupança): ");
        String tipoConta = scanner.nextLine();

        System.out.println("Informe o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Deseja realizar um depósito inicial? (S/N): ");
        char depositoInicial = scanner.next().charAt(0);
        scanner.close();

        Conta novaConta;
        if ("PF".equalsIgnoreCase(tipoConta)) {
            novaConta = new Conta(nomeTitular);
        } else if ("PJ".equalsIgnoreCase(tipoConta)) {
            novaConta = new ContaCorrente(nomeTitular);
        } else if ("Poupança".equalsIgnoreCase(tipoConta)) {
            novaConta = new ContaPoupanca(nomeTitular);
        } else {
            System.out.println("Tipo de conta inválido.");
            return;
        }

        if (depositoInicial == 'S' || depositoInicial == 's') {
            System.out.println("Informe o valor do depósito inicial: ");
            double valorInicial = scanner.nextDouble();
            novaConta.depositar(valorInicial);
        }

        contas.add(novaConta);
        System.out.println("Conta cadastrada com sucesso!");
    }
    
    private void excluirConta() {
    }

    private void sacar() {
    }

    private void depositar() {
    }

    private void solicitarEmprestimo() {
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.menu();
    }
}


