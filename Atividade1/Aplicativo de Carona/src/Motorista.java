public class Motorista {
    private String nome;
    private double notaAvaliacao;
    private double taxaBase;

    public Motorista(String nome, double notaAvaliacao, double taxaBase) {
        this.nome = nome;
        this.notaAvaliacao = notaAvaliacao;
        this.taxaBase = taxaBase;
    }

    public double calcularValorCorrida(double km) {
        double valor = (km * 2.0) + taxaBase;

        if (notaAvaliacao > 4.8) {
            valor += valor * 0.10;
        }

        return valor;
    }

    public String getNome() {
        return nome;
    }
}