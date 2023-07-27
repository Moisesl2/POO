package Exemplo2;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.inicializa(3.0F, 4.0F, 5.0F, "Triangulo1");

        Triangulo t2 = new Triangulo();
        t2.inicializa(5.0F, 4.0F, 3.0F, "Triangulo2");

        Triangulo t3 = t1;

        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
