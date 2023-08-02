import java.util.Scanner;

public class Fevereiro {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        int dia;

        System.out.println("Informe um dia entre 1 e 28");
        dia = ent.nextInt();

        switch (dia) {
            case 1:
            case 8:
            case 15:
            case 22:
                System.out.println("O dia " + dia + " sera um domingo" );    
                break;
            case 2:
            case 9:
            case 16:
            case 23:
                System.out.println("O dia " + dia + " sera uma segunda" );    
                break;    
            case 3:
            case 10:
            case 17:
            case 24:
                System.out.println("O dia " + dia + " sera uma terça" );    
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                System.out.println("O dia " + dia + " sera uma quarta" );    
                break;
            case 5:
            case 12:
            case 19:
            case 26:
                System.out.println("O dia " + dia + " sera uma quinta" );    
                break;
            case 6:
            case 13:
            case 20:
            case 27: 
                System.out.println("O dia " + dia + " sera uma sexta" );   
                break;            
            case 7:
            case 14:
            case 21:
            case 28: 
                System.out.println("O dia " + dia + " sera um sabado" );   
                break;
            default:
                System.out.println("Entrada invalida" );
                break;
        }     
        ent.close();
    }
}
