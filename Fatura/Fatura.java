package Fatura;

public class Fatura {
    public int cod;
    public String nome;
    private int quant;
    private double preco;

    public Fatura() {
    }

    public Fatura(int cod, String nome, int quant, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if (quant > 0) {
            this.quant = quant;
        } else {
           this.quant = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            preco = 0.0;
        }
    }
    
    public double calculaTotal(){
        return quant * preco;
    }

    @Override
    public String toString() {
        return "Fatura [cod: " + cod + ", nome: " + nome + ", quant: " + quant + ", preco: " + preco + " valor total: " + calculaTotal() + "]";
    }


    
}
