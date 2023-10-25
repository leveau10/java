package Agenda;
import java.util.Date;
public class Compromisso {
    private String assunto, local;
    private Date data;
    public Compromisso(){
        this.assunto = "";
        this.local = "";
    }
    public Compromisso(String assunto, String local, Date data){
        this.assunto = assunto;
        this.local = local;
        this.data = data;
    }
    public String getAssunto(){
        return this.assunto;
    }
    public String getLocal(){
        return this.local;
    }
    public Date getData(){
        return this.data;
    }
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public void setData(Date data){
        this.data = data;
    }
}
