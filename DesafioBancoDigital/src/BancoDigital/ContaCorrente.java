package BancoDigital;

import java.util.ArrayList;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String nomeTitular, Double saldo, double limiteChequeEspecial) {
        super(nomeTitular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public String transferir (Conta contaDestino, double valor) {
        double saldoDisponivel = this.saldo + this.limiteChequeEspecial;
        if (valor > 0 && saldoDisponivel >= valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                double diferenca = valor - this.saldo;
                this.saldo = 0.00;
                this.limiteChequeEspecial -= diferenca;
            }
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            this.extrato.add("Transferencia do valor R$ " + valor + " para a conta " + contaDestino);
            contaDestino.getExtrato().add("Recebimento de R$ " + valor + " da conta " + this.numeroConta);
            return "Transferência realizada com sucesso.";
        } else {
            return "Saldo total insuficiente.";
        }
    }

    public String sacar (double valor) {
        double saldoDisponivel = this.saldo + this.limiteChequeEspecial;
        if (valor > 0 && saldoDisponivel >= valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                double diferenca = valor - this.saldo;
                this.saldo = 0.00;
                this.limiteChequeEspecial -= diferenca; // usar cheque especial
            }
            this.extrato.add("Saque no valor de R$ " + valor + " realizado com sucesso.");
            return "Saque realizado com sucesso.";
        } else {
            return "Saldo total insuficiente.";
        }
    }
}
