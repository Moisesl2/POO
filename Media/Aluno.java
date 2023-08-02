package Media;

public class Aluno {
    private String mat;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaT;


    public Aluno(String mat, String nome, double nota1, double nota2, double notaT) {
        this.mat = mat;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaT = notaT;
    }


    public String getMat() {
        return mat;
    }


    public void setMat(String mat) {
        this.mat = mat;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getNota1() {
        return nota1;
    }


    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public double getNota2() {
        return nota2;
    }


    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public double getNotaT() {
        return notaT;
    }


    public void setNotaT(double notaT) {
        this.notaT = notaT;
    }

    public double media(double nota1, double nota2, double notaT){
        double media = ((this.nota1 * 2.5) + (this.nota2 * 2.5) + (this.notaT * 2)) / (2.5 + 2.0);
        System.out.println("Sua media é: " + media);
        return media; 
        
    }

    public double mediaF(double nota1, double nota2, double notaT){
        double media, mediaFinal;

        media = ((this.nota1 * 2.5) + (this.nota2 * 2.5) + (this.notaT * 2)) / (2.5 + 2.0);
        mediaFinal = 7.0 - media;

        if (mediaFinal > 0.0) {
            System.out.println("voce precisa de: ");
            return mediaFinal;
        } else {
            return 0;
        }

    }


    

    
}
