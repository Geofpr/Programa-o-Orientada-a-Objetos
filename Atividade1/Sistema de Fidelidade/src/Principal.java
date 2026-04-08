public class Principal {
    public static void main(String[] args) {
        ClienteFidelidade clienteComum = new ClienteFidelidade();
        ClienteVIP clienteVip = new ClienteVIP();

        clienteComum.adicionarPontos(500);
        clienteVip.adicionarPontos(500);

        System.out.println("Pontos do cliente comum: " + clienteComum.getPontos());
        System.out.println("Pontos do cliente VIP: " + clienteVip.getPontos());
    }
}