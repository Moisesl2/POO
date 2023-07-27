package Circulo;

public class Circulo {
    private float raio;
    public static final double pi = 3.1428;
    
    public Circulo(float raio) {
        this.raio = raio;
    }

    public double perimetro(){
        return 2*pi*raio;
    }
    
}
