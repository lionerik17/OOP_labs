public class Angajat implements Comparable{
    int varsta;
    String nume;
    public int compareTo(Object o)
    {
        Angajat other = (Angajat) o;
        return varsta - other.varsta;
        // return nume.compareTo(other.nume)
    }
}
