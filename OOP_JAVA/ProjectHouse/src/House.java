import java.util.Scanner;
public class House {
    private final String location;
    private final String village;
    private Door door;

    private final Window [] window=new Window[2];

    public House(String location,String village)
    {
        this.location=location;
        this.village=village;
    }

    public void setDoor(Door door)
    {
        this.door=door;
    }

    public void setWindow(int no, Window window ){
        this.window[no]=window;
    }
    public  void display()
    {
        System.out.println("Village: "+village);
        System.out.println(("location:"+location));
        door.display();

        /*for (Window value : window) {
            value.display();
        }*/
        for (int i = 0; i < window.length; i++) {
            window[i].display();
        }

    }


    public static void main(String[] a)
    {
        int h,w;
        String v,l;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter House Village: ");
        v= sc.nextLine();
        System.out.print("Enter House Location: ");
        l= sc.nextLine();
        House ho=new House(v,l);

        System.out.print("Enter Door Height: ");
        h=sc.nextInt();
        System.out.print("Enter Door Width: ");
        w=sc.nextInt();
        Door d=new Door(h,w);
        ho.setDoor(d);

        System.out.print("Enter Window 1 Height: ");
        h=sc.nextInt();
        System.out.print("Enter Window 1 Width:  ");
        w=sc.nextInt();
        Window wo=new Window(h,w);
        ho.setWindow(0,wo);

        System.out.print("Enter Window 2 Height: ");
        h=sc.nextInt();
        System.out.print("Enter Window 2 Width:  ");
        w=sc.nextInt();
        wo=new Window(h,w);
        ho.setWindow(1,wo);

        ho.display();
    }


}
