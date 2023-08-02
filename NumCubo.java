public class NumCubo {
    public static void main(String[] args) {
        int resto,cubo = 3;
        int primeiro, segundo, terceiro;
        for (int i = 100; i < 1000; i++) {
            resto = i;
            terceiro = resto % 10;
            resto /= 10;
            segundo = resto % 10;
            resto /= 10;
            primeiro = resto % 10;

            if (Math.pow(primeiro,cubo) + Math.pow(segundo, cubo) + Math.pow(terceiro, cubo) == i ) {
                System.out.println(i + " = " + primeiro + "³ + " + segundo + "³ + " + terceiro + "³");     
            }
            
        }
    }
}
