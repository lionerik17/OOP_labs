public class Sofer {
    private String nume;
    private String prenume;
    private int varsta;
    private String numarPermisDeConducere;

    public Sofer(String nume, String prenume, int varsta, String numarPermisDeConducere)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.numarPermisDeConducere = numarPermisDeConducere;
    }

    public String toString()
    {
        return nume + ", varsta: " + varsta + " e un sofer";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
