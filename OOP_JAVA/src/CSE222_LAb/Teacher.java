package CSE222_LAb;
//232-15-818
//problem no: 03
import java.util.Scanner;
public class Teacher {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your ID: ");
        String id= sc.nextLine();
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Your Designation: ");
        String designation=sc.nextLine();
        infoteacher T1= new infoteacher(id,name,designation);

        T1.Display();
        System.out.println("Designation: "+T1.getdesignation());

    }


}
class infoteacher
{
    private String id;
    private String name;
    private String desgination;

    public infoteacher(String id, String name,String desgination)
    {
        this.id=id;
        this.name=name;
        this. desgination=desgination;
    }

    public void Display()
    {
        System.out.println("Your Name : "+name);
        System.out.println("Your ID : "+id);
        System.out.println("Your Designation : "+desgination);

    }
    public String getdesignation()
    {
        return desgination;
    }


}
