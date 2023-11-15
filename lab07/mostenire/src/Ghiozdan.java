public class Ghiozdan {
    Rechizita[] rechizite = new Rechizita[10];
    public void add(Caiet caiet)
    {
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] == null)
            {
                rechizite[i] = caiet;
                break;
            }
        }
    }
    public void add(Manual manual)
    {
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] == null)
            {
                rechizite[i] = manual;
                break;
            }
        }
    }
    public void listItems()
    {
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] != null)
            {
                System.out.println(rechizite[i].eticheta);
            }
        }
    }
    public void listManual()
    {
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] != null && rechizite[i] instanceof Manual)
            {
                System.out.println(rechizite[i].eticheta);
            }
        }
    }
    public void listCaiet()
    {
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] != null && rechizite[i] instanceof Caiet)
            {
                System.out.println(rechizite[i].eticheta);
            }
        }
    }
    public int getNrManual()
    {
        int nrManual = 0;
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] != null && rechizite[i] instanceof Manual)
            {
                ++nrManual;
            }
        }
        return nrManual;
    }
    public int getNrCaiet()
    {
        int nrCaiet = 0;
        for(int i = 0; i < 10; ++i)
        {
            if(rechizite[i] != null && rechizite[i] instanceof Caiet)
            {
                ++nrCaiet;
            }
        }
        return nrCaiet;
    }
}
