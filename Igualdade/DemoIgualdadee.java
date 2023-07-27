package Igualdade;

public class DemoIgualdadee {
    public static void main(String[] args) {
        System.out.println(Igualdade.ehigual(1, 2.0F));
        System.out.println(Igualdade.ehigual(1, 2.0));
        System.out.println(Igualdade.ehigual(1, 2));
        System.out.println(Igualdade.ehigual(1.0F, 2.0F));
        System.out.println(Igualdade.ehigual(1.0, 2.0));

        Integer x = 2;
        Integer y = 1;
        System.out.println("x == y ? " + (Igualdade.ehigual(x, y) ? "sim" : "nao"));


        
    }
}
