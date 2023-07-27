import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("informe o primeiro numero: ");
        num1 = ent.nextDouble();
        System.out.println("informe o segundo numero: ");
        num2 = ent.nextDouble();
        System.out.println("informe o terceiro numero: ");
        num3 = ent.nextDouble();

        if (num1 < num2 && num1 < num3) {

            System.out.println("O menor numero eh: " + num1);
            
        }else if (num2 < num1 && num2 < num3) {

            System.out.println("O menor numero eh: " + num2);
            
        } else {

            System.out.println("O menor numero eh: " + num3);
            
        }
        




        ent.close();

    }
}
