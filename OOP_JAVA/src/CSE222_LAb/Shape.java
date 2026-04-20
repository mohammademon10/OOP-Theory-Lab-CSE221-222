//232-15-818
package CSE222_LAb;
public class Shape{
    public static void main(String[] a)
    {
        rectangular r= new rectangular(5,2);
        r.display();
        System.out.println("Area= "+r.getArea());
        System.out.println("Circurference= "+r.getcircuference());


    }
}

 class rectangular {
    private int hight;
    private int width;
    public  rectangular(int hight,int width)
    {
        this.hight=hight;
        this.width=width;
    }
    public void display()
    {
        System.out.println(hight+" "+width);
    }

    public int getArea()
    {
        return hight*width;

    }
    public int getcircuference()
    {
      return 2*(hight+width);

    }

}
