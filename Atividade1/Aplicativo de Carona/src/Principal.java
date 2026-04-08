public class Principal {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Carlos", 4.5, 8.0);
        Motorista motorista2 = new Motorista("Fernanda", 4.9, 8.0);

        double km = 15;

        System.out.printf("Valor da corrida com %s: R$ %.2f%n",
                motorista1.getNome(), motorista1.calcularValorCorrida(km));

        System.out.printf("Valor da corrida com %s: R$ %.2f%n",
                motorista2.getNome(), motorista2.calcularValorCorrida(km));
    }
}