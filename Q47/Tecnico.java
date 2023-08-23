package Q47;

public class Tecnico extends Funcionario {
    private double bonus;

    public Tecnico(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double ganhoAnual(){
        double valor;
        System.out.println("Valor acumulado dos 12 meses juntamente com o 13°: " );
        valor = 13 * getSalario() + bonus ;
        System.out.print(valor);
        return valor;
         
    }

    @Override
    public String toString() {
        return "Tecnico -> "+ getNome() + " salario: " + getSalario() +  " recebeu durante o ano: " + ganhoAnual();
    }



    

}
