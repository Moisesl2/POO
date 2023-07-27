package Exemplo2;

public class Triangulo {
   private float l1;
   private float l2;
   private float l3;
   private String desc;

    public void inicializa(float lado1, float lado2, float lado3, String descricao){
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    @Override
    public String toString() {
        return "Triangulo [l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", desc=" + desc + "]";
    }


    

}       


