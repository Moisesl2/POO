import java.util.Scanner;

public class Mdc {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, m;

        System.out.println("Inaira o valor de M: ");
        m = ent.nextInt();
        System.out.println("Insira o valor de N: ");
        n = ent.nextInt();

        System.out.printf("%n%n O MDC de %d e %d eh: %d" , m, n, mdc(m, n));

        ent.close();
    }

    public static int mdc (int m,int n){
        if(n == 0){
            return m;

        }else if (n > m) {
            return mdc(m, n);
        }
        else{
            return mdc(m, (n % m));
        }

    }
}
