import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int cod;
        double valor;
        //String nome;

        System.out.println("Informe o codigo do setor: ");
        cod = ent.nextInt();
        System.out.println("Informe o valor do produto: ");
        valor = ent.nextDouble();

        if (cod == 222 && valor > 500) {
            valor =  valor - (valor * 0.1);
            System.out.println("Setor: Eletro " + "codigo: " + cod + " valor com desconto: " + valor );
            
        } else if (cod == 222 && valor < 500) {
            System.out.println("Setor: Eletro " + "Codigo: " + cod + " Valor sem desconto: " + valor);
            
        } else if (cod == 111 && valor > 100){
            valor = valor - (valor * 0.4);
            System.out.println("Setor: Cama, Mesa e Banho ");
            System.out.println("Codigo: " + cod + " valor com desconto: " + valor );
            
        }else if (cod == 111 && valor <= 100 && valor >= 50){
            valor = valor - (valor * 0.2);
            System.out.println("Setor: Cama, Mesa e Banho ");
            System.out.println("Codigo: " + cod + " valor com desconto: " + valor );
            
        }else if (cod == 111 && valor < 50){
            valor = valor - (valor * 0.1);
            System.out.println("Setor: Cama, Mesa e Banho ");
            System.out.println("Codigo: " + cod + " valor com desconto: " + valor );
            
        }else{
            System.out.println("Setor invalido");
        }


        ent.close();
    }
}
