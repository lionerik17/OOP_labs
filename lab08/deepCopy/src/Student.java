public class Student {
    public String nume;
    public Masina masina;
    public Student(String nume, Masina masina)
    {
        this.nume = nume;
        this.masina = masina;
    }
    // shallow
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    // deep
    public Student clone()
    {
        try
        {
            Masina copieMasina = this.masina.clone();
            Student copieStudent = new Student(this.nume, copieMasina);
            return copieStudent;
        }
        catch(Exception e)
        {
            System.out.println("Not cloneable");
        }
        return null;
    }
}
