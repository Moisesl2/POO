package Elevador;

public class Elevador {
    private int andarAtual = 0;
    private int quantPessoa = 0;
    public int quantAndar;
    public int capacidade;

   

    public Elevador(int andarAtual, int quantPessoa, int quantAndar, int capacidade) {
        this.quantAndar = quantAndar;
        this.capacidade = capacidade;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQuantPessoa() {
        return quantPessoa;
    }

    public void setQuantPessoa(int quantPessoa) {
        this.quantPessoa = quantPessoa;
    }

    public int getQuantAndar() {
        return quantAndar;
    }

    public void setQuantAndar(int quantAndar) {
        this.quantAndar = quantAndar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int entra(int quantPessoa, int capacidade){
        if (this.quantPessoa < this.capacidade) {
            System.out.println("Entrando...");
            return this.quantPessoa++;
            
        } else {
            System.out.println("Limite atingido!");
            return this.quantPessoa;
        }
    }

    public int sai (int quantPessoa, int capacidadeDoElevador){
        if (this.quantPessoa > 0) {
            System.out.println("Saindo...");
            return this.quantPessoa--;
        } else {
            System.out.println("Nao tem ninguem no elevador!");
            return this.quantPessoa;
            
        }

    } 

    public int sobe(int andarAtual, int quantAndar){
        if (this.andarAtual == this.quantAndar) {
            System.out.println("Ultimo andar!");
            return this.andarAtual;
        } else {
            System.out.println("Subindo...");
            return this.andarAtual++;
        }
    }

    public int desce(int andarAtual, int quantAndar){
        if (this.andarAtual <= this.quantAndar ) {
            System.out.println("Descendo");
            return this.andarAtual--;
        } else{
            System.out.println("Terreo");
            return this.andarAtual;
        } 
            
        
    }



















}
