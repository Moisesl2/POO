package faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigo;
    private float percentualDeCobranca;

    public void inicializaRegistro(String n, String mat, int cod, float perc){
        nome = n;
        matricula = mat;
        codigo = cod;
        percentualDeCobranca = perc;
    }

    public void mostraRegistro(){
        System.out.println("nome " + nome );
        System.out.println("Matricula " + matricula );
        System.out.println("Codigo " + codigo);
        System.out.println("Percentual " + percentualDeCobranca);

    }

    

}
