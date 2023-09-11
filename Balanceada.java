import java.util.Stack;

public class Balanceada {
    public static void main(String[] args) {
        String entrada1 = "((()))";
        String entrada2 = "(()())";
        String entrada3 = "())(";

        System.out.println("Entrada 1 está balanceada? " + verificar(entrada1));
        System.out.println("Entrada 2 está balanceada? " + verificar(entrada2));
        System.out.println("Entrada 3 está balanceada? " + verificar(entrada3));
        
    }

    public static boolean verificar(String entrada){
        Stack<Character> pilha = new Stack<>();

        for(char caractere : entrada.toCharArray()) {
            if (caractere == '(') {
                pilha.push(caractere);

            } else if (caractere == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }else{
                    pilha.pop();
                }
            }
            
        }
        return pilha.isEmpty();

    }
}
