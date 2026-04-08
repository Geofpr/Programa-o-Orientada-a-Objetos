public class TicketEstacionamento {
    protected int horasEstacionadas;

    public TicketEstacionamento(int horasEstacionadas) {
        this.horasEstacionadas = horasEstacionadas;
    }

    public double calcularTarifa() {
        return horasEstacionadas * 5.0;
    }
}