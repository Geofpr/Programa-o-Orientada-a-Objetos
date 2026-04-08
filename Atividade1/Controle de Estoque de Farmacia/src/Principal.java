import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do medicamento: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do medicamento: ");
        double preco = scanner.nextDouble();

        Medicamento medicamento = new Medicamento(nome, preco, true);

        System.out.print("O cliente possui receita? (true/false): ");
        boolean clienteTemReceita = scanner.nextBoolean();

        medicamento.exibirDados();
        medicamento.vender(clienteTemReceita);

        scanner.close();
    }
}