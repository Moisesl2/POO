package Q52;

public class LivroDaBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String localizacao;


    public LivroDaBiblioteca(String titulo, String autor, int numPag, int anoDeEdicao,
            String localizacao) {
        super(titulo, autor, numPag, anoDeEdicao);
        this.localizacao = localizacao;
    }


    @Override
    public boolean EstaEmprestado() {
        if (emprestado == true) {
            System.out.println("O Livro foi emprestado! ");
            return emprestado;
            
        }else{
            System.out.println("O livro esta disponivel!");
            return emprestado;
        }
    }


    @Override
    public void empresta() {
        System.out.println("O Livro nao esta disponivel! ");
        emprestado = true;
    }


    @Override
    public void devolve() {
        System.out.println("O livro foi devolvido!");
        emprestado = false;
    }


    @Override
    public String localizacao() {
       return localizacao;
    }


    @Override
    public String descricao() {
        return "Livro: " + super.qualTitulo() + " - Autor: " + super.qualAutor();
    }


    

    

    
}
