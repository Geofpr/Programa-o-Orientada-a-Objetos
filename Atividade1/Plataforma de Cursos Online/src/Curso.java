public class Curso {
    private String nomeCurso;
    private int totalAulas;
    private int aulasConcluidas;

    public Curso(String nomeCurso, int totalAulas) {
        this.nomeCurso = nomeCurso;
        this.totalAulas = totalAulas;
        this.aulasConcluidas = 0;
    }

    public void assistirAula() {
        if (aulasConcluidas < totalAulas) {
            aulasConcluidas++;
            System.out.println("Aula assistida com sucesso.");
        } else {
            System.out.println("Todas as aulas já foram concluídas.");
        }
    }

    public double calcularProgresso() {
        return ((double) aulasConcluidas / totalAulas) * 100;
    }

    public void exibirDados() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Aulas concluídas: " + aulasConcluidas + "/" + totalAulas);
        System.out.printf("Progresso: %.2f%%%n", calcularProgresso());
    }
}