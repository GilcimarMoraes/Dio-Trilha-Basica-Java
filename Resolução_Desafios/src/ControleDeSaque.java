import java.util.Scanner;

public class ControleDeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o limite diário ao usuário
        System.out.print("Digite o limite diário: ");
        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0;

        // Utiliza um loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();

            // Verifica se o usuário deseja encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verifica se o saque ultrapassa o limite diário
            if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            // Realiza o saque e atualiza o total sacado
            totalSacado += valorSaque;
            System.out.println("Saque realizado. Limite restante: " + (limiteDiario - totalSacado));
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
