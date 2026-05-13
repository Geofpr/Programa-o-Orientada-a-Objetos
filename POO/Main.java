import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Computador computador = new Computador("Ryzen 7", "16 GB");

        Desenvolvedor dev = new Desenvolvedor("Carlos", 4500.0, computador);

        GerenteTecnico gerente = new GerenteTecnico("Ana", 8000.0);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(dev);
        funcionarios.add(gerente);

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
        }

        dev.programar();
        gerente.programar();
        gerente.liderarEquipe();
    }
}