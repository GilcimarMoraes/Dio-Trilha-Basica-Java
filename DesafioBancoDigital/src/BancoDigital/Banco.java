package BancoDigital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banco {
    private HashMap<Integer, Conta> contaMap;
    private static int proximoNumeroConta = 1;

    public Banco() {
        this.contaMap = new HashMap<>();
    }

    // Abrir conta
    public void abrirConta (String tipoConta, String nomeTitular, double saldo) {
        Conta conta = null;
        switch (tipoConta.toLowerCase()) {
            case "corrente":
                conta = new ContaCorrente(nomeTitular, saldo, 500.00); // limite de cheque especial foi definido como R$ 500,00
                break;

            case "poupanca":
                conta = new ContaPoupanca(nomeTitular, saldo);
                break;

            default:
                System.out.println("Tipo de conta inválido.");
                return;

        }
        conta.setNumeroConta(proximoNumeroConta++);
        contaMap.put(conta.getNumeroConta(), conta);
        System.out.println("Conta " + tipoConta + " aberta com sucesso. Numero da conta: " + conta.getNumeroConta());
    }

    private Conta encontrarConta (int numeroConta) {
        return contaMap.get(numeroConta);
    }

    public void encerrarConta (int numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        conta.setNumeroConta(numeroConta);
        contaMap.remove(numeroConta);
        System.out.println("Conta " + numeroConta + " encerrada com sucesso.");
    }

    public void depositar (int numeroConta, double valor) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println(conta.depositar(valor));
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar (int numeroConta, double valor) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println(conta.sacar(valor));
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferir (int numeroContaOrigem, int numeroContaDestino, double valor) {
        Conta contaOrigem = encontrarConta(numeroContaOrigem);
        Conta contaDestino = encontrarConta(numeroContaDestino);
        if (contaOrigem != null && contaDestino != null) {
            System.out.println(((ContaCorrente) contaOrigem).transferir(contaDestino, valor));
        } else {
            System.out.println("Contas não encontradas.");
        }
    }

    public void emitirExtrato (int numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            System.out.println("Extrato da conta: " + numeroConta + ":");
            for (String registro : conta.getExtrato()) {
                System.out.println(registro);
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void emitirRelatorio () {
        System.out.println("Relatorio de Contas: ");
        System.out.println("Número Conta:   |   Tipo Conta  |   Nome Titular    |   Saldo");

        for (Map.Entry<Integer, Conta> entry : contaMap.entrySet()) {
            Conta conta = entry.getValue();
            String tipoConta = (conta instanceof ContaCorrente) ? "Corrente" : "Poupança";
            System.out.printf(      "%d      |   %s         |   %s              |   R$ %.2f%n", conta.getNumeroConta(), tipoConta, conta.getNomeTitular(), conta.getSaldo());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Abrir conta corrente");
            System.out.println("2. Abrir conta poupança");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Emitir extrato");
            System.out.println("7. Emitir Relatório");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Titular: ");
                    String nomeTitularContaCorrente = scanner.nextLine();
                    System.out.println("Saldo inicial: ");
                    double saldoCorrente = scanner.nextDouble();
                    banco.abrirConta("corrente", nomeTitularContaCorrente, saldoCorrente);
                    break;

                case 2:
                    System.out.printf("Nome do Titular: ");
                    String nomeTitularContaPoupanca = scanner.nextLine();
                    System.out.println("Saldo inicial: ");
                    double saldoPoupanca = scanner.nextDouble();
                    banco.abrirConta("poupanca", nomeTitularContaPoupanca, saldoPoupanca);
                    break;

                case 3:
                    System.out.println("Numero da conta: ");
                    int numeroConta = scanner.nextInt();
                    System.out.println("Valor a depositar: ");
                    double valorDepositar = scanner.nextDouble();
                    banco.depositar(numeroConta, valorDepositar);
                    break;

                case 4:
                    System.out.println("Numero da conta: ");
                    int numeroContaOrigem = scanner.nextInt();
                    System.out.println("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(numeroContaOrigem, valorSaque);
                    break;

                case 5:
                    System.out.println("Número da conta de origem: ");
                    int numContaOrigem = scanner.nextInt();
                    System.out.println("Número da conta de destino: ");
                    int numContaDestino = scanner.nextInt();
                    System.out.println("Valor que deseja transferir: ");
                    double valorTransferir = scanner.nextDouble();
                    banco.transferir(numContaOrigem, numContaDestino, valorTransferir);
                    break;

                case 6:
                    System.out.printf("Numero da conta: ");
                    int numConta = scanner.nextInt();
                    banco.emitirExtrato(numConta);
                    break;

                case 7:
                    banco.emitirRelatorio();
                    break;

                case 8:
                    System.out.printf("Saindo . . . ");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção Inválida. Tente novamente");
            }
        }
    }
}
