package Q47;

public class DemoFun {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Moises", 1200);
        Administrativo A = new Administrativo("Moises", 1200, 1);
        Tecnico t = new Tecnico("Moises", 1200, 1500);

        
        f.aumentaSalario(2000);
        System.out.println(f.toString());
        System.out.println(A.ganhoAnual());
        //System.out.println(A.toString());
        //System.out.println(t.toString());
       // System.out.println(f.getSalario());
    }
}
