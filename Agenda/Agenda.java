package Agenda;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> Entrada = new ArrayList<>();

    public Agenda(ArrayList<EntradaEmAgenda> entrada) {
        Entrada = entrada;
    }

    public Agenda(EntradaEmAgenda ent) {
    }

    public ArrayList<EntradaEmAgenda> getEntrada() {
        return Entrada;
    }

    public void setEntrada(ArrayList<EntradaEmAgenda> entrada) {
        Entrada = entrada;
    }

    public void listaDia(String dia, String mes, String ano){
        for (EntradaEmAgenda Entrada : Entrada) {
            System.out.println("Compromissos: " + Entrada);
        }

    }


    


}


