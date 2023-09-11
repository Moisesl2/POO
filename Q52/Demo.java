package Q52;

public class Demo {
    public static void main(String[] args) {
        LivroDaBiblioteca l = new LivroDaBiblioteca("Peter Pan", "Moises", 200, 2020, "Segundo corredor Coluna P");

        System.out.println("O livro esta emprestado? " + l.EstaEmprestado());

        l.empresta();
        System.out.println("O livro esta emprestado? " + l.EstaEmprestado());

        l.devolve();
        System.out.println("O livro esta emprestado? " + l.EstaEmprestado());

        System.out.println("informacoes do livro: ");
        System.out.println(l);



    }
}
