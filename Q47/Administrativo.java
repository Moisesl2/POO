package Q47;

public class Administrativo extends Funcionario {
    private int horario;

    public Administrativo(String nome, double salario, int horario ) {
        super(nome, salario);
        this.horario = horario;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    

    public double ganhoAnual(){
        double valor;
        if (horario == 1) {
            System.out.println("Valor acumulado dos 12 meses juntamente com o 13°: " );
            valor =  13 * getSalario() ;
            //System.out.println(valor);
            return valor;
            
        } else if (horario == 0) {
            System.out.println("Valor acumulado dos 12 meses juntamente com o 13° e adicional: ");
            valor = (12 * getSalario() + 2500) + getSalario();
            //System.out.println(valor);
            return valor;
        }else{
            System.out.println("Entrada invalida!");
            return 0;
        }
        


         
    }

    @Override
    public String toString() {
        return " Administrativo -> " + getNome() + " salario: " + getSalario() +  " recebeu durante o ano: " + ganhoAnual();
    }

    

    
    
}
