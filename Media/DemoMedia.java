package Media;

public class DemoMedia {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("2020022439", "Moises", 7, 7, 7);
    
        mostraAluno(aluno);
    
    }

    public static void mostraAluno(Aluno aluno){
        System.out.printf("Nome: %s", aluno.getNome());
        System.out.printf("Matricula: %s", aluno.getMat());
        System.out.printf(" Primeira nota: %.2f", aluno.getNota1());
        System.out.printf(" Segunda nota: %.2f", aluno.getNota2());
        System.out.printf("Nota do Trabalho: %.2f", aluno.getNotaT());
        System.out.printf("Media: %.2f", aluno.media(aluno.getNota1(), aluno.getNota2(), aluno.getNotaT()));
        System.out.printf("Voce vai precisar de: %.2f na prova final", aluno.mediaF(aluno.getNota1(), aluno.getNota2(), aluno.getNotaT()));
    }
}
