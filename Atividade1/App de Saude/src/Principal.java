public class Principal {
    public static void main(String[] args) {
        AtividadeFisica caminhada = new AtividadeFisica(30, 2);
        Corrida corrida = new Corrida(30, 2, 5);

        System.out.println("Calorias da atividade física: " + caminhada.calcularCalorias());
        System.out.println("Calorias da corrida: " + corrida.calcularCalorias());
    }
}