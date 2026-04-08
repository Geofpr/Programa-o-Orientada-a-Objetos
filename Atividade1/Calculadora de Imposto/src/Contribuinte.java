public class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        if (rendaAnual <= 30000) {
            return 0;
        } else if (rendaAnual <= 80000) {
            return rendaAnual * 0.15;
        } else {
            return rendaAnual * 0.25;
        }
    }

    public String getNome() {
        return nome;
    }
}