package Q52;

public interface ItemDeBiblioteca {
    int maxDia = 14;

    boolean EstaEmprestado();
    void empresta();
    void devolve();
    String localizacao();
    String descricao();
    
}
