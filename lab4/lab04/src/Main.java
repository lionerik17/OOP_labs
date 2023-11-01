import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Autovehicul a1 = new Autovehicul("Audi", Color.WHITE, 50, 240, 4, 6);
        System.out.println(a1);

        a1.accelerare(10);
        a1.changeTreapta(5);
        System.out.println(a1);
        a1.decelerare(40);
        System.out.println(a1);
        a1.opreste();
        System.out.println(a1);
    }
}