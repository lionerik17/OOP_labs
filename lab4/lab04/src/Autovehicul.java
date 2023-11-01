import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private float vitezaCurenta, vitezaMaxima;
    private int treaptaVitezaCurenta, numarTrepte;

    private Sofer sofer;

    public Autovehicul(String marca, Color culoare, float vitezaCurenta, float vitezaMaxima, int treaptaVitezaCurenta, int numarTrepte)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
        this.numarTrepte = numarTrepte;
        this.sofer = sofer;
    }

    public String toString()
    {
        return "Marca " + this.marca + " are viteza curenta de " + vitezaCurenta + " in treapta de viteza " + treaptaVitezaCurenta;
    }

    public Color getCuloare() {
        return culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(float vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public float getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(float vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getTreaptaVitezaCurenta() {
        return treaptaVitezaCurenta;
    }

    public void setTreaptaVitezaCurenta(int treaptaVitezaCurenta) {
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
    }

    public int getNumarTrepte() {
        return numarTrepte;
    }

    public void setNumarTrepte(int numarTrepte) {
        this.numarTrepte = numarTrepte;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public void accelerare(float delta)
    {
        if(this.vitezaCurenta + delta <= this.vitezaMaxima)
        {
            this.vitezaCurenta += delta;
        }
        else
        {
            System.out.println("A fost atinsa viteza maxima!");
        }
    }

    public void decelerare(float delta)
    {
        if(this.vitezaCurenta - delta >= 0)
        {
            this.vitezaCurenta -= delta;
        }
        else
        {
            System.out.println("Viteza nu poate fi negativa!");
        }
    }

    public void opreste()
    {
        this.vitezaCurenta = 0;
        System.out.println("Vehiculul de marca " + this.marca + " a fost oprit");
    }

    public void changeTreapta(int delta)
    {
        if(delta <= this.numarTrepte)
        {
            this.treaptaVitezaCurenta = delta;
        }
        else
        {
            System.out.println("A fost atins numarul maxim de trepte!");
        }
    }
}
