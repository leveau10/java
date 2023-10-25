package Agenda;

import java.util.Date;

public class Agenda {
    Compromisso[] comps;
    int capacidade, quantidade;

    private void aumentarCapacidade(){
        Compromisso[] compsTemp = new Compromisso[this.quantidade+100];
        this.quantidade+=100;
        for (int index = 0; index < comps.length; index++) {
            compsTemp[index] = comps[index];
        }
        comps = compsTemp;
        compsTemp = null;
    }
    public Agenda(){
        this.comps = new Compromisso[10];
        this.capacidade = 10;
        this.quantidade = 0;
    }
    public void inserir(Compromisso c){
        if (this.quantidade == this.capacidade) {
            this.aumentarCapacidade();
        }
        comps[quantidade] = c;
        this.quantidade++;
    }
    public void inserir(String assunto, String local, Date data){
        Compromisso c  = new Compromisso(assunto, local, data);
        inserir(c);
    }
    public void remover(Compromisso c){
        for (int i = 0; i < this.quantidade; i++) {
            if (c == comps[i]) {
                this.quantidade -=1;
                comps[i] = comps[this.quantidade-1];
                comps[this.quantidade-1] = null;
            }
        }
    }

}
