public class Main {
    public static void main(String[] args) {
        Masina m1 = new Masina("Beamve", "negru");
        Student s1 = new Student("Ana", m1);
        Student s2 = s1.clone();
        s2.masina.revopseste("verde");
        System.out.println(s1.masina.culoare);
        System.out.println(s2.masina.culoare);
    }
}