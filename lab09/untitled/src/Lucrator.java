public class Lucrator {
    String nume;
    CalendarLucru calendarLucru;
    public Lucrator(String nume, CalendarLucru calendarLucru)
    {
        this.nume = nume;
        this.calendarLucru = calendarLucru;
    }
    public void lucreaza(String zi) throws ExceptieNume, ExceptieZiNelucratoare
    {
        int pos = -1;
        for(int i = 0; i < 7; ++i)
        {
            if(calendarLucru.zi[i].getNume().equals(zi))
            {
                pos = i;
                break;
            }
        }
        if(pos == -1)
        {
            throw new ExceptieNume(zi + " nu este zi a saptamanii!");
        }
        if(!calendarLucru.zi[pos].esteLucratoare()) // tratam exceptia zi nelucratoare
        {
            if(calendarLucru.zi[pos].getNume().equals("Sambata") || calendarLucru.zi[pos].getNume().equals("Duminica"))
            {
                throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        }
        System.out.println("Lucratorul " + this.nume + " lucreaza " + zi);
    }
}
