public class Autovehicul {
    Sofer sofer;
    double vitezaCurenta, vitezaMaxima;
    public Autovehicul(Sofer sofer)
    {
        this.sofer = sofer;
    }
    void accelereaza(double delta)
    {
        this.vitezaCurenta += delta;
    }
}
