public class Medicamento {
    private String nome;
    private double preco;
    private boolean exigeReceita;

    public Medicamento(String nome, double preco, boolean exigeReceita) {
        this.nome = nome;
        this.preco = preco;
        this.exigeReceita = exigeReceita;
    }

    public void vender(boolean clienteTemReceita) {
        if (!exigeReceita || clienteTemReceita) {
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Venda não permitida. Receita obrigatória.");
        }
    }

    public void exibirDados() {
        System.out.println("Medicamento: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Exige receita: " + exigeReceita);
    }
}