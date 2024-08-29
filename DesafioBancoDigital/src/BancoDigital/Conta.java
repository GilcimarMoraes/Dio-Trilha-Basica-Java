package BancoDigital;

import java.util.ArrayList;

public class Conta {

    protected String nomeTitular;
    protected int numeroConta;
    protected static String agencia = "0001";
    protected Double saldo;
    protected ArrayList<String> extrato;
    protected static int contadorConta = 1;

    public Conta(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = contadorConta++;
        this.saldo = saldo;
        this.extrato = new ArrayList<>();
        this.extrato.add("Conta aberta com sucesso, saldo R$: " + this.saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public static String getAgencia() {
        return agencia;
    }

    public static void setAgencia(String agencia) {
        Conta.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }

    public static int getContadorConta() {
        return contadorConta;
    }

    public static void setContadorConta(int contadorConta) {
        Conta.contadorConta = contadorConta;
    }

    public String transferir(Conta contaDestino, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            this.extrato.add("Transferência de R$ " + valor + " para a conta " + contaDestino.getNumeroConta());
            contaDestino.getExtrato().add("Recebimento de R$ " + valor + " da conta " + this.numeroConta);
            return "Transferência de R$ " + valor + " para a conta " + contaDestino.getNumeroConta() + " foi realizada com sucesso.";
        } else {
            return "Saldo insuficiente para a transferência no valor de R$ " + valor;
        }
    }

    public String sacar (double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            this.extrato.add("Saque de R$ " + valor + " realizado com sucesso.");
            return "Saque de R$ " + valor + " realizado com sucesso.";
        } else {
            return "Saldo Insuficiente.";
        }
    }

    public String depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add("Deposito no valor de R$ " + valor + " realizado com sucesso.");
            return "Deposito realizado com sucesso.";
        } else {
            return "Valor de depósito inválido.";
        }
    }


    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", extrato=" + extrato +
                '}';
    }
}

