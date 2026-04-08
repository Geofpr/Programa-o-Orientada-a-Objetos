public class Principal {
    public static void main(String[] args) {
        Transacao t1 = new Transacao("TX001", 500);
        t1.processarPagamento(700);

        System.out.println("ID: " + t1.getIdTransacao());
        System.out.println("Valor: R$ " + t1.getValor());
        System.out.println("Status: " + t1.getStatus());

        System.out.println();

        Transacao t2 = new Transacao("TX002", -50);
        t2.processarPagamento(100);

        System.out.println("ID: " + t2.getIdTransacao());
        System.out.println("Valor: R$ " + t2.getValor());
        System.out.println("Status: " + t2.getStatus());
    }
}