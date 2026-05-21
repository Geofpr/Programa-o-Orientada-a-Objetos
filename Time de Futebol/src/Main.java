public class Main {
   public static void main(String[] args){
       Time Brasil = new Time("Brasil");
       Jogador j1 = new Jogador("Pelé", "atacante");
       Jogador j2 = new Jogador("Neymar", "Meia");
       Jogador j3 = new Jogador("Ronaldinho Gaucho", "atacante");

       Brasil.adicionarJogador(j1);
       Brasil.adicionarJogador(j2);
       Brasil.adicionarJogador(j3);

       Brasil.exibirElenco();

    }
}
