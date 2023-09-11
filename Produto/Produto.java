package Produto;

public class Produto {
    public static void main(String[] args) {

        int resultado1 = produto(2, 3, 4);
        int resultado2 = produto(5, 6);
        int resultado3 = produto(7, 8, 9, 10);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        
    }

    public static int produto(int... numero){
        int result = 1;

        for (int i : numero) {
            result *= i;
        }
        return result;
    }
}
