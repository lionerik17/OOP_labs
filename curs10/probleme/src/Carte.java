public class Carte implements Comparable<Carte>{
    Persoana autor;
    int anAparitie;
    String editura;
    String titlu;

    public Carte(Persoana autor, int anAparitie, String editura, String titlu) {
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.editura = editura;
        this.titlu = titlu;
    }

    public Persoana getAutor() {
        return autor;
    }

    public void setAutor(Persoana autor) {
        this.autor = autor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int compareTo(Carte o)
    {
        return this.getEditura().compareTo(o.getEditura());
    }

    public String toString()
    {
        return this.getAutor() + " " + this.getAnAparitie() + " " + this.getEditura() + " " + this.getTitlu();
    }
}
