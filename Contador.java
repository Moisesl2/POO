import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Contador {
    public static void main(String[] args) {
        String entrada = "HELLO THERE";

        entrada = entrada.replaceAll(" ", " ").toUpperCase();

        Map<Character,Integer> lettercount = new HashMap<>();

        for (char c : entrada.toCharArray()) {
            if (Character.isLetter(c)) {
                lettercount.put(c, lettercount.getOrDefault(c, 0) + 1);
            }
            
        }

        Map<Character, Integer> ordernarMap = new TreeMap<>(lettercount);

        for (Map.Entry<Character, Integer> entry : ordernarMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
