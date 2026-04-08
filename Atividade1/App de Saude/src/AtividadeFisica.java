public class AtividadeFisica {
    protected int duracaoMinutos;
    protected int intensidade;
    
    public AtividadeFisica(int duracaoMinutos, int intensidade) {
        this.duracaoMinutos = duracaoMinutos;
        this.intensidade = intensidade;
    }

    public double calcularCalorias(){
        return duracaoMinutos * intensidade * 5;
    }
}
