public class Mega{;
public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j != 10) {
                    System.out.printf("%d%d ", i, j);
                } else {
                    System.out.printf("%d", j*(i+1));
                }
            }
            System.out.print("\n");
        }
    }
}

