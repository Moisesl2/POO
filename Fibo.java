import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        int valor = ent.nextInt();
        
        int primeiro = 0, segundo = 1, resultado;

        for (int i = 0; i < valor; i++) {
            resultado = primeiro + segundo;
            System.out.println(primeiro + " + " + segundo + " = " + resultado);
            primeiro = segundo;
            segundo = resultado;       
        }

        ent.close();
    }
    
}
