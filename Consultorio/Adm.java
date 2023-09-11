package Consultorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Adm {
    public static void main(String[] args) {
        List<Paciente> prioridade = new ArrayList<>();
        List<Paciente> comum = new ArrayList<>();

        int minutos= 0;
        int totalAtendidos = 0;

        Random cont = new Random();
        int rg = cont.nextInt(1000);
        int idade = cont.nextInt(101);
        Paciente p = new Paciente(idade, rg++);

         if (idade > 60 ) {
                prioridade.add(p); 
            
            }
            else {
                comum.add(p);
            }

        
        
        while (totalAtendidos < 20) {
            minutos++;

            if (minutos % 4 == 0 ) {
                rg = cont.nextInt(1000);
                idade = cont.nextInt(101);
                Paciente novop = new Paciente(idade, rg++);

                if (idade > 60 ) {
                prioridade.add(novop); 
            
                }
                else {
                comum.add(novop);
                }
                
            }
            
            if (!prioridade.isEmpty()) {
            Paciente pacienteAtendido = prioridade.remove(0);
            System.out.println("Atendendo paciente da fila prioridade - RG:"  + pacienteAtendido.getRg() + " Idade:"  + pacienteAtendido.getIdade());
            totalAtendidos++;

        
        }else if (!comum.isEmpty()) {
            Paciente pacienteAtendido = comum.remove(0);
            System.out.println("Atendendo paciente da fila comun - RG:"  + pacienteAtendido.getRg() + " Idade:"  + pacienteAtendido.getIdade());
            totalAtendidos++;
        }
              
    }


}

}
