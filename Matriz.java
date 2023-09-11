public class Matriz {
    private float[][] matriz;

    public Matriz(float a, float b, float c, float d) {
        matriz = new float[2][2];
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
        
    }

    public float calculaDeterminante(){
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public void imprimirMatriz() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz m = new Matriz(1F, 2F, 3F, 4f);

        System.out.println("Matriz: ");
        m.imprimirMatriz();

        System.out.println("Determinante");
        System.out.println(m.calculaDeterminante());
    }

    
}
