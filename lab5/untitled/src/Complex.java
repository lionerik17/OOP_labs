public class Complex {
    private int re;
    private int im;
    public Complex(int re, int im)
    {
        this.re = re;
        this.im = im;
    }
    public Complex adunare(Complex c2)
    {
        Complex res = new Complex(0, 0);
        res.re = this.re + c2.re;
        res.im = this.im + c2.im;
        return res;
    }
    public Complex scadere(Complex c2)
    {
        return new Complex(this.re - c2.re, this.im - c2.im);
    }
    public Complex inmultireCuScalar(int alfa)
    {
        return new Complex(alfa * this.re, alfa * this.im);
    }
    public Complex inmultire(Complex c2)
    {
        return new Complex(this.re * c2.re - this.im * c2.im, this.re * c2.im + this.im * c2.re);
    }
    public String toString()
    {
        if(this.im < 0) return this.re + "" + this.im + "j";
        else if(this.re == 0 && this.im == 0) return "0";
        return this.re + "+" + this.im + "j";
    }
}
