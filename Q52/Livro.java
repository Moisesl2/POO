package Q52;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;
    private int anoDeEdicao;


    public Livro(String titulo, String autor, int numPag, int anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.anoDeEdicao = anoDeEdicao;
    };

    public String qualTitulo(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + ", anoDeEdicao=" + anoDeEdicao
                + "]";
    }

    
    
    
    
}
