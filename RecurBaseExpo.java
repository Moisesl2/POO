import java.util.Scanner;

public class RecurBaseExpo {
    public static void main(String[] args) {
        Scanner ent  = new Scanner(System.in);
        System.out.println("insira a base: ");
        double base = ent.nextDouble();
        System.out.println("Insira o expoente: ");
        double expo = ent.nextDouble();

        double valorF = potencia (base, expo);

        System.out.println(valorF);

        ent.close();
    }

    public static double potencia (double base, double expo){
        if (expo > 2){
            return base * potencia(base, expo - 1);
        }else if (expo == 2) {
            return base = base * base;        
        }else if (expo == 1 ) {
            return base;    
        }else{
            return 1;
        }
    }
}
