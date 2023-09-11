import java.util.LinkedList;

public class ListaInversa {
    public static void main(String[] args) {
        LinkedList<Character> originalList = new LinkedList<>();
        LinkedList<Character> reverseList = new LinkedList<>();

        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('A');
        originalList.add('b');

        for (Character character : originalList) {
            reverseList.addFirst(character);
            
        }

        System.out.println("Lista Original: ");
        for (Character character : originalList) {
            System.out.print(character + " ");
            
        }

        System.out.println("\nLista Reversa: ");
        for (Character character : reverseList) {
            System.out.print(character + " ");
            
        }


        
    }
}
