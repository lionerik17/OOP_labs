public class Main {
    public static void main(String[] args) {
        Carte[] carte = new Carte[5];
        Autor a1 = new Autor("a", "f", 12);
        Autor a2 = new Autor("b", "g", 13);
        Autor a3 = new Autor("c", "h", 14);
        Autor a4 = new Autor("d", "i", 15);
        Autor a5 = new Autor("e", "j", 16);

        Carte c1 = new Carte("m", a1, 1, 5);
        Carte c2 = new Carte("a", a2, 2, 6);
        Carte c3 = new Carte("m", a3, 3, 7);
        Carte c4 = new Carte("a", a4, 4, 8);
        Carte c5 = new Carte("!", a5, 5, 9);

        Biblioteca biblioteca = new Biblioteca(carte);
        biblioteca.adaugaCarte(carte, c1, 0);
        biblioteca.adaugaCarte(carte, c2, 1);
        biblioteca.adaugaCarte(carte, c3, 2);
        biblioteca.adaugaCarte(carte, c4, 3);
        biblioteca.adaugaCarte(carte, c5, 4);
        biblioteca.listeazaCarti(carte);

        String titlu = "!";
        Carte q = biblioteca.gasesteCarteDupaTitlu(carte, titlu);
        if(q != null) System.out.println("Exista cartea cu titlul " + q.getTitlu());
    }
}