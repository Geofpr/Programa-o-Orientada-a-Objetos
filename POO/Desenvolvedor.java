public class Desenvolvedor extends Funcionario implements Programador {

    private Computador computador;

    public Desenvolvedor(String nome, double salarioBase, Computador computador) {
        super(nome, salarioBase);
        this.computador = computador;
    }

    @Override
    public void programar() {
        System.out.println(getNome() + " está programando em Java.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalarioBase());
        computador.exibirConfiguracao();
        System.out.println("------------------------");
    }
}