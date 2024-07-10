import java.util.Scanner;

public class VerificacaoDeChequeEspecial {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        double saldoTotal = saldo + limiteChequeEspecial;

        //Verifica se o saque ultrapassa o saldo disponivel
        if(saque <= saldo){
            System.out.println("Transação realizada com sucesso");
        }

        else if(saque > saldoTotal){
            System.out.println("Transação não realizada. Limite do cheque especial excedido");
        }

        else{
            System.out.println("Transação realizada com sucesso utilizando o cheque especial");
        }

        scanner.close();
    }
}
