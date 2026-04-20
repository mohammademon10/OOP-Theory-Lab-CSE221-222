public class Student {
    private String Studid;
    private String name;
    private double cgpa;

    public Student(String Studid,String name,double cgpa)
    {
        this.Studid=Studid;
        this.name=name;
        this.cgpa=cgpa;
    }
    public void display()
    {
        System.out.println("Studid :"+Studid);
        System.out.println("Name :"+name);
        System.out.println("CGPA :"+cgpa);
    }

}
