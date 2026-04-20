import java.util.Scanner;

public class Register {
    private String semester;
    private int year;
    private Student student;
    private Course course;

    public Register(String semester,int year,Student student,Course course){
        this.semester=semester;
        this.year=year;
        this.student=student;
        this.course=course;

    }
    public void display()
    {
        student.display();
        System.out.println("Semester :"+semester+",year :"+year);
        course.display();
    }

    public static void main(String[] a)
    {
        String studid,name,code,title,semester;
        double cgpa,credit;
        int year;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your ID: ");
        studid=sc.nextLine();
        System.out.print("Enter Your Name: ");
        name=sc.nextLine();
        System.out.print("Enter Your CGPA: ");
        cgpa=sc.nextDouble();

        Student s =new Student(studid,name,cgpa);

        System.out.print("Enter Your Code: ");
        code=sc.nextLine();
        System.out.print("Enter Your Title: ");
        title=sc.nextLine();
        System.out.print("Enter Your Credit: ");
        credit = sc.nextDouble();

        Course c=new Course(code,title,credit);

        System.out.print("Enter Your Semester: ");
        semester=sc.nextLine();
        System.out.print("Enter Your Year: ");
        year= sc.nextInt();
        Register r=new Register(semester,year,s,c);

        r.display();





    }

}
