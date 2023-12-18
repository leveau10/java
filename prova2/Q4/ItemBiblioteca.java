package prova2.Q4;

public abstract class ItemBiblioteca {
    protected int id;
    protected String titulo;

    ItemBiblioteca(int id, String titulo){
        this.id = id;
        this.titulo = titulo;
    }

    public abstract int getId();
    
    public abstract String getTitulo();
}
