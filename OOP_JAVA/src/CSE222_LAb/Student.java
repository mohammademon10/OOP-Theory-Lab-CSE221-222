package CSE222_LAb;
//232-15-818
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your ID: ");
        String id= sc.nextLine();
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Your CGPA: ");
        double cgpa=sc.nextDouble();
        info S1= new info(id,name,cgpa);
        System.out.println("CGPA: "+S1.getCgpa());
        S1.Display();

    }


}
class info
{
   private String id;
   private String name;
   private double cgpa;

   public info(String id, String name,double cgpa)
   {
       this.id=id;
       this.name=name;
       this.cgpa=cgpa;
   }
   public double getCgpa()
   {
       return cgpa;
   }
   public void Display()
   {
       System.out.println("Your Name : "+name);
       System.out.println("Your ID : "+id);
       System.out.println("Your CGPA : "+cgpa);

   }


}
