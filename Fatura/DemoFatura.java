package Fatura;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura f = new Fatura();

        f.cod = 11;
        f.nome = "CPU";
        f.setPreco(1000);
        f.setQuant(3);

        System.out.println(f.toString());

    }
}
