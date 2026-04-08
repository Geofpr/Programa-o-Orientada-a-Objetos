public class ClienteFidelidade {
    protected int pontos;

    public ClienteFidelidade() {
        this.pontos = 0;
    }

    public void adicionarPontos(double valorGasto) {
        pontos += (int) valorGasto;
    }

    public int getPontos() {
        return pontos;
    }
}