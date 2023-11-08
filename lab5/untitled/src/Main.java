public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(2, 3);
        System.out.println(c1);
        System.out.println(c2);
        Complex c3 = c1.adunare(c2);
        System.out.println(c3);
        Complex c4 = c1.scadere(c2);
        System.out.println(c4);
        Complex c5 = c1.inmultireCuScalar(4);
        System.out.println(c5);

        int[] arr = new int[]{1, 2, 3}; // shallow copy, deep copy ii cu System.arraycopy
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
        int st = 0, dr = arr.length - 1;
        while(st < dr)
        {
            int aux = arr[st];
            arr[st] = arr[dr];
            arr[dr] = aux;
            ++st;
            --dr;
        }
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
        String s = new String("mama");
        char[] s1 = s.toCharArray();
        st = 0;
        dr = s.length() - 1;
        while(st < dr)
        {
            char aux = s1[st];
            s1[st] = s1[dr];
            s1[dr] = aux;
            ++st;
            --dr;
        }
        System.out.println(s1);
        Complex[][] a = new Complex[5][5];
        for(int i = 0; i < a.length; ++i)
        {
            for(int j = 0; j < a[0].length; ++j)
            {
                Complex p = new Complex(i, j);
                a[i][j] = p;
            }
        }
        MatriceComplex mat = new MatriceComplex(a);
        System.out.println(mat);
        MatriceComplex mat2 = mat.adunare(a);
        System.out.println(mat2);
//        int[] b = arr;
//        b[1] = 500;
//        System.out.println(arr[1]);
    }
}