package Elevador;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador e = new Elevador(0, 0, 10, 20);
        e.sobe(0, 10);
        e.entra(5, 10);
        e.desce(2, 10);
        e.sai(3, 20);
        e.sobe(10, 10);
        e.desce(10, 10);
        System.out.println(e.getAndarAtual());
   }
}
