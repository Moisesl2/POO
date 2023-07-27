import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args) {
        double lado, area;
       Scanner ent = new Scanner(System.in); 
       System.out.println("Informe o valor dos lados: ");
       lado = ent.nextDouble();
       area = lado*lado;

       System.out.println("O resultado é: "+ area);

     ent.close();   
    }

}
    
