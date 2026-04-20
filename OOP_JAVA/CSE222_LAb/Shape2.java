//232-15-818

package CSE222_LAb;
import java.util.Scanner;
public class Shape2{
    public static void main(String[] a)
    {


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x: ");
        int height=sc.nextInt();
        System.out.print("Enter y: ");
        int width=sc.nextInt();
        Rectangular r= new Rectangular(height,width);
        r.display();
        System.out.println("Area= "+r.getArea());
        System.out.println("Circumference= "+r.getcircumference());


    }
}

class Rectangular {
    private int height;
    private int width;
    public  Rectangular(int height,int width)
    {
        this.height=height;
        this.width=width;
    }
    public void display()
    {

        System.out.println(height+" "+width);
    }

    public int getArea()
    {
        return height*width;

    }
    public int getcircumference()
    {
        return 2*(height+width);

    }

}
