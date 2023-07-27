import java.util.Scanner;


public class Graus {
    public static void main(String[] args) {
        double celcius, fahrenheit;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe a temperatura: ");
        celcius = ent.nextDouble();

        fahrenheit = (celcius * 9/5) + 32;

        System.out.println("A temperatura apos a conversao eh: " + fahrenheit);

        ent.close();

    }
}
