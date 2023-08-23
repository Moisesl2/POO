package Q31;

public class Computador extends Equipamento{
    private String marca;
    private String tipo;

    public Computador(String nome, double valor,String marca, String tipo) {
        super(nome, valor);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador " + super.toString() + marca + ", tipo=" + tipo + "]";
    }

    
    
}
