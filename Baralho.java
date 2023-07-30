import java.util.Scanner;
public class Baralho{
public static void main(String[] args) {
    Scanner ent = new Scanner (System.in);
    System.out.print("informe o valor da carta: ");
    int valor = ent.nextInt();
    System.out.print("Informe o naipe: ");
    int naipe = ent.nextInt();

    switch (valor) {
        case 1:
            System.out.println("Ás de ");
            break;
        case 2:
            System.out.println("dois de ");
            break;
        case 3:
            System.out.println("tres de ");
            break;
        case 4:
            System.out.println("quatro de ");
            break;
        case 5:
            System.out.println("cinco de ");
            break;        
        case 6:
            System.out.println("seis de ");
            break;
        case 7:
            System.out.println("sete de ");
            break;
        case 8:
            System.out.println("oito de ");
            break;
        case 9:
            System.out.println("nove de ");
            break;
        case 10:
            System.out.println("dez de ");
            break;    
        case 11:
            System.out.println("valete de ");
            break;
        case 12:
            System.out.println("rainha de ");
            break;
        case 13:
            System.out.println("rei de ");
            break;    
         default:
            System.out.println("Entrada invalida!");
            break;
    }

    switch (naipe) {
        case 1:
            System.out.println("paus");  
            break;
        case 2:
            System.out.println("ouro");  
            break;
        case 3:
            System.out.println("espada");  
            break;
        case 4:
            System.out.println("copas");  
            break;
        default:
            System.out.println("entrada invalida!");
            break;
    }

    ent.close();
    }
}