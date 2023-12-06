package Orcamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private String cliente;
    private LocalDate data;
    private List<Item> itens;

    Orcamento(String cliente, LocalDate data){
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void inserirItem(Item item){
        itens.add(item);
    }

    public double getTotal(){
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
