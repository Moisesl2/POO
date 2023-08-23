package Q47;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentaSalario( double valor){
        System.out.print("Novo salario: ");
        return salario += valor;

    }

    public double ganhoAnual(){
        double valor;
        System.out.println("Valor acumulado dos 12 meses juntamente com o 13°: " );
        valor =  getSalario() * 13 ;
        System.out.print(valor);
        return valor;
         
    }

    @Override
    public String toString() {
        return "Funcionario -> nome: " + nome + ", salario: " + salario ;
    }

    

    
}
