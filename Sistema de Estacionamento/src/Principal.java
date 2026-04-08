public class Principal {
    public static void main(String[] args) {
        TicketEstacionamento carro = new TicketEstacionamento(4);
        TicketMoto moto = new TicketMoto(4);
        TicketCaminhonete caminhonete = new TicketCaminhonete(4);

        System.out.println("Tarifa do carro: R$ " + carro.calcularTarifa());
        System.out.println("Tarifa da moto: R$ " + moto.calcularTarifa());
        System.out.println("Tarifa da caminhonete: R$ " + caminhonete.calcularTarifa());
    }
}