import java.util.Scanner;


public class UCD {
    public static void main(String[] args) {
        int u, c, d, num;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe o numero: ");
        num = ent.nextInt();

        c = num / 100;
        d = (num % 100) / 10;
        u = num % 10;

        num = u * 100 + c * 10 + d * 1;

        System.out.println("O resultado eh: " + num);








        ent.close();

        
    }
}
