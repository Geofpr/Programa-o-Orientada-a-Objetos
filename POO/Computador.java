public class Computador {

    private String processador;
    private String memoriaRAM;

    public Computador(String processador, String memoriaRAM) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void exibirConfiguracao() {
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM);
    }
}