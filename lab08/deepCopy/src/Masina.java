public class Masina {
    public String marca;
    public String culoare;
    public Masina(String marca, String culoare)
    {
        this.marca = marca;
        this.culoare = culoare;
    }
    public void revopseste(String culoare)
    {
        this.culoare = culoare;
    }

    public Masina clone()
    {
        return new Masina(this.marca, this.culoare);
    }
}
