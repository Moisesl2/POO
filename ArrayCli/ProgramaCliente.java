package ArrayCli;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaCliente { 
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Cliente> lista = new ArrayList<>();

        int id;
        String nome;
        String telefone;
        int idade;

        System.out.println("Insira os dados: ");

        while (true) {
            System.out.println("ID: ");
            id = ent.nextInt();

            if (id < 0) {
                System.out.println("ID incorreto!");
                break;
            }
            
            System.out.println("NOME: ");
            nome = ent.nextLine();

            
            System.out.println("TELEFONE: ");
            telefone = ent.nextLine();

            System.out.println("IDADE: ");
            idade = ent.nextInt();

            Cliente c = new Cliente(id, nome, telefone, idade);
            lista.add(c);

        }

        System.out.println("\n Dados inseridos: ");
        for (Cliente c : lista) {
            System.out.println("\n" + c);
            
        }
        ent.close();
    }

   
}
