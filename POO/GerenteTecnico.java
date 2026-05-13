public class GerenteTecnico extends Funcionario implements Programador, Lider {

    public GerenteTecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void programar() {
        System.out.println(getNome() + " está programando em Java.");
    }

    @Override
    public void liderarEquipe() {
        System.out.println(getNome() + " está liderando a equipe de desenvolvimento.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalarioBase());
    }
}