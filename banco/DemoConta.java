package banco;

public class DemoConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("joao");
        System.out.println(c1);

        ContaBancaria c2 = new ContaBancaria("joao", 200.58F, true);
        System.out.println(c2);
    }
}
