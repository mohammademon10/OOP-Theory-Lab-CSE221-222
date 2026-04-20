public class Course {
    private String code;
    private  String title;
    private double credit;


    public Course(String code,String title,double credit)
    {
        this.code=code;
        this.title=title;
        this.credit=credit;

    }
    public void display()
    {
        System.out.println("Code :"+code);
        System.out.println("Title :"+title);
        System.out.println("Credit :"+credit);
    }
}
