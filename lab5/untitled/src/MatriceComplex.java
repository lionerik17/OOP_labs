public class MatriceComplex {
    private Complex[][] a;
    public MatriceComplex(Complex[][] a)
    {
        this.a = a;
    }
    public MatriceComplex adunare(Complex[][] b)
    {
        MatriceComplex res = new MatriceComplex(b);
        for(int i = 0; i < b.length; ++i)
        {
            for(int j = 0; j < b[0].length; ++j)
            {
                res.a[i][j] = res.a[i][j].adunare(b[i][j]);
            }
        }
        return res;
    }

    public MatriceComplex inmultire(Complex[][] b)
    {
        MatriceComplex res = new MatriceComplex(b);
        for(int i = 0; i < b.length; ++i)
        {
            for(int j = 0; j < b[0].length; ++j)
            {
                for(int k = 0; k < b[0].length; ++k)
                {
                    res.a[i][j] = res.a[i][k].inmultire(b[k][j]);
                }
            }
        }
        return res;
    }

    public String toString()
    {
        String s = "";
        for(int i = 0 ; i < 5; ++i)
        {
            for(int j = 0; j < 5; ++j)
            {
                s += a[i][j].toString() + " ";
            }
            s += '\n';
        }
        return s;
    }
}
