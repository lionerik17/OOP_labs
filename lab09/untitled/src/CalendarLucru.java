public class CalendarLucru {
    Zi[] zi = new Zi[7];
    public CalendarLucru(String[] numeZile)
    {
        for(int i = 0; i < 7; ++i)
        {
            zi[i] = new Zi();
            if(i < 5)
            {
                zi[i].setNume(numeZile[i]);
                zi[i].setLucratoare(true);
            }
            else
            {
                zi[i].setNume(numeZile[i]);
                zi[i].setLucratoare(false);
            }
        }
    }
}
