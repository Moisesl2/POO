package Pessoa;

public class Pessoa {
    private String nome;
    private float altura;


    public Pessoa(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public void setNome(String nome){
        if(!nome.isEmpty()) {
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return "Nome: " + nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura > 0){
          this.altura = altura;
        }else{
            System.out.println("Altura invalida!!");
        }
        
    }
    
}
