public class TicketCaminhonete extends TicketEstacionamento {
    public TicketCaminhonete(int horasEstacionadas) {
        super(horasEstacionadas);
    }

    @Override
    public double calcularTarifa() {
        return horasEstacionadas * 10.0;
    }
}