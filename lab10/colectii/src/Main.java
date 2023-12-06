import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> fructe = new ArrayList<>();
//        fructe.add("Apple");
//        String apple = fructe.get(0);
//        fructe.addFirst("Banana");
//
//        ListIterator<String> iterator = fructe.listIterator();
//        while(iterator.hasNext())
//        {
//            String f = iterator.next();
//            if(f.compareTo("Apple") == 0)
//            {
//                iterator.set("Orange");
//                break;
//            }
//        }
//        System.out.println(fructe);
//        // Creaza tablourile de intregi m1, m2
//        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
//        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
//        // Creaza o instanta de IntegerMatrix
//        IntegerMatrix integerMatrix = new IntegerMatrix();
//        System.out.println("\nm1 + m2 is ");
//        GenericMatrix.printResult(
//                m1, m2, integerMatrix.addMatrix(m1, m2), '+');
//        System.out.println("\nm1 * m2 is ");
//        GenericMatrix.printResult(
//                m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
        String text = "Ceau ce faci. Ceau bine tu. Si eu bine. ceau. Ceau";
        String[] words = text.split("[ \n\t\r.,;:!?(){}]");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word : words)
        {
            String key = word.toLowerCase();
            if(key.length() > 0)
            {
                if(!hashMap.containsKey(key))
                {
                    hashMap.put(key, 1);
                }
                else
                {
                    hashMap.put(key, hashMap.get(key) + 1);
                }
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet)
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}