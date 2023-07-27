package banco;

public class ContaBancaria {
    private String nome;
    private float saldo;
    private boolean ehEspecial;


    public ContaBancaria(String nome, float saldo, boolean ehEspecial) {
        this.nome = nome;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
    }

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0F;
        this.ehEspecial = false;
    }

    @Override
    public String toString() {
     return "ContaBancaria [nome = " + nome + ", saldo = " + saldo + ", ehEspecial = " + (ehEspecial ? 
        "sim" : "nao") + "]";
    }




    
}
