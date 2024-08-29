package BancoDigital;

public class ContaPoupanca extends Conta{

    private static final double TAXA_JUROS = 0.5;

    public ContaPoupanca(String nomeTitular, Double saldo) {
        super(nomeTitular, saldo);
    }

    public void calcularJuros(){
        double juros = this.saldo * TAXA_JUROS;
        this.saldo += juros;
        this.extrato.add("Juros de R$ " + juros + " aplicado ao saldo");
    }
}
