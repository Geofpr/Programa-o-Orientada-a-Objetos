import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do contribuinte: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a renda anual: ");
        double renda = scanner.nextDouble();

        Contribuinte contribuinte = new Contribuinte(nome, renda);

        System.out.println("Contribuinte: " + contribuinte.getNome());
        System.out.println("Imposto a pagar: R$ " + contribuinte.calcularImposto());

        scanner.close();
    }
}