import java.util.Scanner;

public class FatorialRecu {
    public static void main(String[] args) {
        Scanner ent = new Scanner( System.in);
        int num;
        System.out.println("Insira o numero para ser fatorado: ");
        num = ent.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println("\t".repeat(i) + i + "!: " + fatorial(i));            
        }
        ent.close();
    }

    public static int fatorial(int num){
        if (num > 1 ) {
            return num * fatorial(num - 1);
        }
        else{
           return 1; 
        }
    }
}
