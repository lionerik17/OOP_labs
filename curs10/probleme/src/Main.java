import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carte> list = new ArrayList<>();
        Persoana p1 = new Persoana("J.K. Rowling", 1);
        Persoana p2 = new Persoana("Rick Riordan", 2);
        Carte c1 = new Carte(p1, 1997, "Egmond", "Harry Potter si Piatra Filozofala");
        Carte c2 = new Carte(p1, 1998, "Egmond", "Harry Potter si Camera Secretelor");
        Carte c3 = new Carte(p1, 1999, "Egmond", "Harry Potter si Prisonierul din Azkaban");
        Carte c4 = new Carte(p1, 2000, "Egmond", "Harry Potter si Pocalul de Foc");

        Carte c5 = new Carte(p2, 2022, "Arthur", "Percy Jackson si Olimpienii #1");
        Carte c6 = new Carte(p2, 2023, "Arthur", "Percy Jackson si Olimpienii #4");

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);

        for(Carte c: list)
        {
            System.out.println(c);
        }

        System.out.println("Sortam lista ...");
        Collections.sort(list);

        for(Carte c: list)
        {
            System.out.println(c);
        }
    }
}