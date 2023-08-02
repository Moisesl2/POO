public class Cidade {
    public static void main(String[] args) {
        double a = 7000;
        double b = 20000;
        int anos = 0;

        for (int i = 0; a < b; i++) {
            a = a + (a * 0.035);
            b = b + (b * 0.01);
            anos = i;
        }

        System.out.printf("Apos %d anos A tera %.2f e B tera %.2f habitantes", anos, a, b);
    }
}
