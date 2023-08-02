import java.util.Scanner;

public class NumPerf {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Defina até qual número deseja buscar os números perfeitos: ");
        int num = sc.nextInt();
        int ver; 
        for (int i = 2; i <= num; i++) {
            ver = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    ver += j;
                }
            }
            if (ver == i) {
                ver = 0;
                System.out.print(i + " = ");
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        ver += j;
                        System.out.print(j + " + ");
                    }
                }
                System.out.print("\n");
            }
        }
        sc.close();
    }
    
}
