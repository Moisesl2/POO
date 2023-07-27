import java.util.Scanner;

public class Radiano {
    public static void main(String[] args) {
        double angulo, rad;
        Scanner ent = new Scanner(System.in); 
        System.out.println("informe o angulo: ");
        angulo = ent.nextDouble();
        rad = (angulo/180)*Math.PI;

        //CONVERSÃO
        System.out.printf("O Radiano de: %.2f é %.2f " ,angulo, Math.toRadians(angulo));
        System.out.printf("\nO Seno de: %.2f é %.2f" ,angulo, Math.sin(rad));
        System.out.printf("\nO Cosseno de: %.2f é %.2f" ,angulo, Math.cos(rad));
        System.out.printf("\nA Tangente de: %.2f é %.2f" ,angulo, Math.tan(rad));
        System.out.printf("\nA Secante de: %.2f é %.2f" ,angulo, 1/Math.cos(rad));
        System.out.printf("\nA Consecante de: %.2f é %.2f" ,angulo, 1/Math.sin(rad));
        System.out.printf("\nA cotangente de: %.2f é %.2f" ,angulo, Math.sin(rad)/Math.cos(rad));

        ent.close();
    }
}
