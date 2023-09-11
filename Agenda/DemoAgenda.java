package Agenda;

public class DemoAgenda {
    public static void main(String[] args) {
       Agenda agenda = new Agenda();

       agenda.addCompromisso(new EntradaEmAgenda("00:00", "06", "05", "2024", "Meu Casamento!"));
       agenda.addCompromisso(new EntradaEmAgenda("00:00", "06", "05", "2024", "MOrar Juntos!"));
       agenda.addCompromisso(new EntradaEmAgenda("00:00", "06", "05", "2024", "Aniversario da minha Amada!"));
       agenda.addCompromisso(new EntradaEmAgenda("00:00", "30", "03", "2024", "Meu Aniversario!"));

       agenda.listaDia("30", "03", "2024");
        
    }
}
