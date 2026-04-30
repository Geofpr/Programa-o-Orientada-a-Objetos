public class Principal {
    public static void main(String[] args) {
        CalculoGeometrico sala = new CalculadoraSalaRetangular();
        double area = sala.calcularArea(5, 4);
        double perimetro = sala.calcularPerimetro(5, 4);
        System.out.println("Area:" + area);
        System.out.println("Perimetro:" + perimetro);
    }
}
