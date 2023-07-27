import java.util.Scanner;

public class MediaA {
    public static void main(String[] args) {
        double num1, num2, num3, media;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        num1 = ent.nextDouble();
        System.out.println("Informe a segunda nota: ");
        num2 = ent.nextDouble();
        System.out.println("Informe a terceira nota: ");
        num3 = ent.nextDouble();

        media = (num1+num2+num3)/3;

        System.out.println("A media é: " + media);

        ent.close();
    }
}
