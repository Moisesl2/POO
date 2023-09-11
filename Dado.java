import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencia = new int[13];

        int numLancamentos = 36000000;

        for (int i = 0; i < numLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;
            frequencia[soma]++;
        }

        System.out.println("Resultado Dos Lancamentos: ");
        System.out.println("Soma\tFrequencia");

        for (int soma = 2; soma <= 12; soma++) {
            System.out.println(soma + "\t" + frequencia[soma]);     
        }
    }
}
