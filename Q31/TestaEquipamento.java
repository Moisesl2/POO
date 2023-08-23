package Q31;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento("IdeapadS145", 3200);
        Computador c = new Computador("IdeapadS145", 3200, "Lenovo", "notebook");

        System.out.println(e.toString());
        System.out.println(c.toString());
    }
}
