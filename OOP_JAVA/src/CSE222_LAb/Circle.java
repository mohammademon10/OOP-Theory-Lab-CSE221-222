//232-15-818
package CSE222_LAb;
import java.util.Scanner;
public class Circle{
    public static void main(String[] a)
    {


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius=sc.nextInt();

        MakeShape r = new MakeShape(radius);
        r.display();
        System.out.println("Area= "+r.getArea());
        System.out.println("Circumrference= "+r.getcircuference());


    }
}

class MakeShape {
  private double radius;

    public  MakeShape(double radius)
    {
        this.radius=radius;

    }
    public void display()
    {
        System.out.println(radius);
    }

    public double getArea()
    {
        return 3.1415*radius*radius;

    }
    public double getcircuference()
    {
        return 2*3.1415*radius;

    }

}
