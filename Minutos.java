import java.util.Scanner;
public class Minutos {
    public static void main(String[] args) {
        int min, dia, hora;
        Scanner ent = new Scanner(System.in);

        System.out.println("informe o intervalo: ");
        int inter = ent.nextInt();

        dia = (inter / 60) / 24;
        inter =  inter - ((dia * 24) * 60);
        hora = inter / 60;
        min = inter - (hora * 60) ;

        System.out.println(dia + " dias " + hora + " horas " + min + " minutos "  );



        ent.close();
    }
}
