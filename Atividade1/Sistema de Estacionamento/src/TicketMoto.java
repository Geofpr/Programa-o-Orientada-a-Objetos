public class TicketMoto extends TicketEstacionamento {
    public TicketMoto(int horasEstacionadas) {
        super(horasEstacionadas);
    }

    @Override
    public double calcularTarifa() {
        return horasEstacionadas * 3.0;
    }
}