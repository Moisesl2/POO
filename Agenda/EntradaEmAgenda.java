package Agenda;

public class EntradaEmAgenda {
    private String hora;
    private String dia;
    private String mes;
    private String ano;
    private String assunto;

    

    public EntradaEmAgenda(String hora, String dia, String mes, String ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }



    public EntradaEmAgenda() {
        this.hora = " ";
        this.dia = " ";
        this.mes = " ";
        this.ano = " ";
        this.assunto = " ";
    }



    public String getHora() {
        return hora;
    }



    public void setHora(String hora) {
        this.hora = hora;
    }



    public String getDia() {
        return dia;
    }



    public void setDia(String dia) {
        this.dia = dia;
    }



    public String getMes() {
        return mes;
    }



    public void setMes(String mes) {
        this.mes = mes;
    }



    public String getAno() {
        return ano;
    }



    public void setAno(String ano) {
        this.ano = ano;
    }



    public String getAssunto() {
        return assunto;
    }



    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }


    public boolean ehnoDia(String dia, String mes, String ano){
        return this.dia == dia && this.mes == mes && this.ano == ano;

    }



    @Override
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ",   assunto=" + assunto + "]";
    }
    
}
