package Evento;

public class EventoAcademico {
   private String nomeDoEvento;
   private String localDoEvento;
   private int numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento; 
        this.numeroDeParticipantes = numeroDeParticipantes;
        this.mostraEvento();
    }

    private void mostraEvento(){
        System.out.println("nome " + nomeDoEvento );
        System.out.println("local " + localDoEvento );
        System.out.println("numero " + numeroDeParticipantes);

    }
    
    
}
