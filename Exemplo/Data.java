public class Data {
    private int dia;
    private int mes;
    private int ano;
    

   public void incializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

   public void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

   public boolean dataEhValida(){
        return (dia>=1 && dia<=30 && mes>=1 && mes<=12 && ano>=0);
    }

    















}
