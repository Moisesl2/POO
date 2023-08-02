import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        int passa = 2;
        System.out.println("Informe o numero: ");
        num = ent.nextInt();
        ent.close();

        primo  (num, passa);

    }

    public static int primo (int num, int passa){
        if (num % passa == 0 && passa != num) {
            System.out.println(num + " nao eh primo");
            return 0;
            
        } else if (passa == num) {
            System.out.println(num + " eh primo");
            return 0;
        }else {
            return primo(num, passa + 1);
        }
    }
}
