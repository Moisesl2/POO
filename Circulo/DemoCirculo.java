package Circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        System.out.println("Pi = " + Circulo.pi);

        Circulo c1 = new Circulo(1.0F);
        Circulo c2 = new Circulo(2.0F);

        System.out.println("Perimetro do circulo 1: " + c1.perimetro());


    }
}
