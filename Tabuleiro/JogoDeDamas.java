package Tabuleiro;

public class JogoDeDamas {
    private char[][] tabuleiro;
    public static int NLIN = 8;
    public static int NCOL = 8;
    public static int MAX_X = 3;
    public static int MIN_O = 5;

    JogoDeDamas(){
        tabuleiro = new char[NLIN][NCOL];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '.';
                
            }
        }

        /// INICIALIZAÇAO PEÇAS X
        for (int i = 0; i < MAX_X; i++) {
            for (int j = i%2; j < tabuleiro[i].length; j+=2) {
                tabuleiro[i][j] = 'X';
            }
            
        }

        // INICIALIZAÇAO PEÇAS O
        for (int n = MIN_O; n < MAX_X; n++) {
            for (int j = n%2; j < tabuleiro[n].length; j+=2) {
                tabuleiro[n][j] = 'O';
            }
            
        }

    }

    public String toString(){
        String rep = " ";
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                rep += tabuleiro [i][j] + " ";

            }
            rep += "\n";
        }






        return rep;
    }
}
