public class Transacao {
    private String idTransacao;
    private double valor;
    private String status;

    public Transacao(String idTransacao, double valor) {
        this.idTransacao = idTransacao;

        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
            System.out.println("Erro: o valor da transação deve ser maior que zero.");
        }

        this.status = "Pendente";
    }

    public void processarPagamento(double limiteDisponivel) {
        if (valor <= limiteDisponivel) {
            status = "Aprovada";
        } else {
            status = "Recusada";
        }
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }
}