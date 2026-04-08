public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso("Java Básico", 5);

        curso.assistirAula();
        curso.assistirAula();
        curso.assistirAula();

        curso.exibirDados();
    }
}