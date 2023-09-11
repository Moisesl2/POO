package Agenda;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> Entrada = new ArrayList<>();

    public Agenda() {
        Entrada = new ArrayList<>();
    }

    public ArrayList<EntradaEmAgenda> getEntrada() {
        return Entrada;
    }

    public void setEntrada(ArrayList<EntradaEmAgenda> entrada) {
        Entrada = entrada;
    }

    public void addCompromisso(EntradaEmAgenda entrada){
        Entrada.add(entrada);
    }

    public void listaDia(String dia, String mes, String ano){
        System.out.println("Compromissos do dia: " + dia + " no mes: " + mes + " do ano: " + ano);
        for (EntradaEmAgenda compromissos : Entrada) {
            if (compromissos.ehnoDia(dia, mes, ano)) {
                System.out.println("Compromissos: " + Entrada);   
            } 
        }
    }
}


