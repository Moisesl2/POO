import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.print("Coordenada x1:");
        x1 = ent.nextInt();
        System.out.print("Coordenada x2:");
        x2 = ent.nextInt();
        System.out.print("Coordenada y1:");
        y1 = ent.nextInt();
        System.out.print("Coordenada y2:");
        y2 = ent.nextInt();

        if (x2 > x1) {
            System.out.print("O segundo ponto esta a direita do primeiro e ");
            
        } else if (x2 < x1) {
            System.out.print("O segundo ponto esta a esquerda do primeiro e ");       
        }else {
            System.out.print("O segundo ponto esta na mesma linha que o primeiro e ");
        }

        if (y2 > y1) {
            System.out.print("Acima dele");

        }else if (y2 < y1) {
            System.out.print("Abaixo dele");

        } else {
            System.out.print("Na mesma altura");         
        }
        ent.close();
    }
}
