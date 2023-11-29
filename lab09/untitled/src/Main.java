import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        boolean flag = false;
//        do {
//            try
//            {
//                int pin = keyboard.nextInt();
//                float hash = 1 / pin;
//                System.out.println("PIN-ul tau este " + pin);
//                flag = true;
//            }
//            catch(InputMismatchException e)
//            {
//                System.out.println("Nu ai introdus un intreg!");
//                keyboard.next();
//            }
//            catch(ArithmeticException e)
//            {
//                System.out.println("Divison by 0!");
//            }
//        }while(!flag);
        String[] numeZile = new String[] {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
        CalendarLucru calendarLucru = new CalendarLucru(numeZile);
        Lucrator lucrator = new Lucrator("Tyler", calendarLucru);
        String[] tests = {"Luni", "Marte", "Duminica"};
        for(int i = 0; i < 3; ++i)
        {
            try
            {
                lucrator.lucreaza(tests[i]);
            }
            catch(ExceptieNume e)
            {
                System.out.println(e.getMessage());
            }
            catch(ExceptieZiNelucratoare e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}