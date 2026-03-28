public class Corrida extends AtividadeFisica {
    private double distanciaKm;

    public Corrida(int duracaoMinutos, int intensidade, double distanciaKm) {
        super(duracaoMinutos, intensidade);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularCalorias() {
        return (duracaoMinutos * intensidade * 5) + (distanciaKm * 10);
    }
}