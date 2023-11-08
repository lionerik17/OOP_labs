public class Biblioteca {
    private Carte[] carte; // 5 carti max
    public Biblioteca(Carte[] carte)
    {
        this.carte = carte;
    }
    public void adaugaCarte(Carte[] carte, Carte x, int pos)
    {
        if(x.getCopiiDisponibile() <= 0)
        {
            System.out.println("Nu se poate adauga cartea deoarece nu sunt copii");
            return;
        }
        for(int i = 0; i < 5; ++i)
        {
            if(carte[i] != null && carte[i].getId() == x.getId())
            {
                System.out.println("Nu se poate inserta deoarece mai exista o carte cu acel id");
                return;
            }
        }
        carte[pos] = x;
    }
    public void listeazaCarti(Carte[] carte)
    {
        for(int i = 0; i < 5; ++i)
        {
            System.out.println(carte[i]);
        }
    }
    public Carte gasesteCarteDupaTitlu(Carte[] carte, String titlu)
    {
        for(int i = 0; i < 5; ++i)
        {
            if(carte[i].getTitlu().equals(titlu))
            {
                return carte[i];
            }
        }
        System.out.println("Cartea cu titlul " + titlu + " nu exista");
        return null;
    }
}
