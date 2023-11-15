public class Main {
    public static void main(String[] args) {
        Autovehicul a1 = new Autobuz(100); // exemplu polimorfism

        Ghiozdan g = new Ghiozdan();
        Caiet caiet1 = new Caiet("a");
        Caiet caiet2 = new Caiet("b");
        Caiet caiet3 = new Caiet("c");
        g.add(caiet1);
        g.add(caiet2);
        g.add(caiet3);

        Manual manual1 = new Manual("d");
        Manual manual2 = new Manual("e");

        g.add(manual1);
        g.add(manual2);

        System.out.println(g.getNrCaiet());
        System.out.println(g.getNrManual());
        g.listItems();
        g.listManual();
        g.listCaiet();
    }
}