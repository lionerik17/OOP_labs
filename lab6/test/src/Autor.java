public class Autor {
    private String nume;
    private String prenume;
    private int varsta;
    public Autor(String nume, String prenume, int varsta)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public Autor()
    {
        this.nume = null;
        this.prenume = null;
        this.varsta = -1;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String toString()
    {
        return "Autorul " + this.nume + " " + this.prenume + " are varsta de " + this.varsta;
    }
}
