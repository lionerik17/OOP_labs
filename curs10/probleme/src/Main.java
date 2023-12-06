import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("J.K. Rowling", 1);
        Persoana p2 = new Persoana("Rick Riordan", 2);
        Carte c1 = new Carte(p1, 1997, "Egmond", "Harry Potter si Piatra Filozofala");
        Carte c2 = new Carte(p1, 1998, "Egmond", "Harry Potter si Camera Secretelor");
        Carte c3 = new Carte(p1, 1999, "Egmond", "Harry Potter si Prisonierul din Azkaban");
        Carte c4 = new Carte(p1, 2000, "Egmond", "Harry Potter si Pocalul de Foc");

        Carte c5 = new Carte(p2, 2022, "Arthur", "Percy Jackson si Olimpienii #1");
        Carte c6 = new Carte(p2, 2023, "Arthur", "Percy Jackson si Olimpienii #4");

//        ArrayList<Carte> list = new ArrayList<>();
//
//        list.add(c1);
//        list.add(c2);
//        list.add(c3);
//        list.add(c4);
//        list.add(c5);
//        list.add(c6);
//
//        for(Carte c: list)
//        {
//            System.out.println(c);
//        }
//
//        System.out.println("Sortam lista ...");
//        Collections.sort(list);
//
//        for(Carte c: list)
//        {
//            System.out.println(c);
//        }
//        LinkedList<Carte> linkedList = new LinkedList<>();

//        linkedList.add(c1);
//        linkedList.add(c1);
//        linkedList.add(c2);
//        linkedList.add(c3);
//        linkedList.add(c4);
//        linkedList.add(c5);
//        linkedList.add(c5);
//
//        for(Carte c: linkedList)
//        {
//            System.out.println(c);
//        }
//
//        System.out.println("Sortam lista ...");
//        Collections.sort(linkedList);
//
//        for(Carte c: linkedList)
//        {
//            System.out.println(c);
//        }
//  nu se pastreaza ordinea, nu permite dupes
//        HashSet<Carte> hashSet = new HashSet<>();
//
//        hashSet.add(c1);
//        hashSet.add(c1);
//        hashSet.add(c2);
//        hashSet.add(c3);
//        hashSet.add(c4);
//        hashSet.add(c5);
//        hashSet.add(c5);
//
//        for(Carte c: hashSet)
//        {
//            System.out.println(c);
//        }
//        System.out.println("Sortam hash set-ul ...");
//        for(Carte c: hashSet)
//        {
//            System.out.println(c);
//        }
//  se pastreaza ordinea, nu permite dupes
//        LinkedHashSet<Carte> linkedHashSet = new LinkedHashSet<>();
//
//        linkedHashSet.add(c1);
//        linkedHashSet.add(c1);
//        linkedHashSet.add(c2);
//        linkedHashSet.add(c3);
//        linkedHashSet.add(c4);
//        linkedHashSet.add(c5);
//        linkedHashSet.add(c5);
//
//        for(Carte c: linkedHashSet)
//        {
//            System.out.println(c);
//        }
//        System.out.println("Sortam hash set-ul ...");
//        for(Carte c: linkedHashSet)
//        {
//            System.out.println(c);
//        }
// NU ESTE NEVOIE DE SORTARE, nu permite dupes
// daca modificam anul, avem duplicat -> nu se mai insereaza
        TreeSet<Carte> treeSet = new TreeSet<>();

        treeSet.add(c1);
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);
        treeSet.add(c5);
        treeSet.add(c5);

        for(Carte c: treeSet)
        {
            System.out.println(c);
        }
    }
}