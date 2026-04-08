public class ClienteVIP extends ClienteFidelidade {
    @Override
    public void adicionarPontos(double valorGasto) {
        pontos += ((int) valorGasto * 2) + 50;
    }
}