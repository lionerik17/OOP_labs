public class Carte {
    private String titlu;
    private Autor autor;
    private int id;
    private int copiiDisponibile;
    public Carte(String titlu, Autor autor, int id, int copiiDisponibile)
    {
        this.titlu = titlu;
        this.autor = autor;
        this.id = id;
        this.copiiDisponibile = copiiDisponibile;
    }
    public Carte()
    {
        this.titlu = null;
        this.autor = null;
        this.id = -1;
        this.copiiDisponibile = -1;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }

    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }

    public String toString()
    {
        return "Cartea cu titlul " + this.titlu + " scrisa de " + this.autor.getNume() + " are id-ul " + this.id + " si sunt " + this.copiiDisponibile + " copii disponibile";
    }
}
