public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Disponível? " + livro.isDisponivel());

        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.devolver();
    }
}