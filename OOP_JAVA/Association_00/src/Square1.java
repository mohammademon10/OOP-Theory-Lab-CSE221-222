import java.util.Scanner;

public class Square1 {
    private int height;
    private int width;
    private Circle circle;
    public Square1(int height, int width, Circle circle){
        this.height = height;
        this.width = width;
        this.circle = circle;
    }
    public void display(){
        circle.display();
        System.out.println("Square1: height = "+height+", width = "+width);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h, w, height, width;
        double radius;
        System.out.print("Enter h for square2: ");
        h = sc.nextInt();
        System.out.print("Enter w for square2: ");
        w = sc.nextInt();
        Square2 square2 = new Square2(h, w);

        System.out.print("Enter radius for circle: ");
        radius = sc.nextDouble();
        Circle circle = new Circle(radius, square2);

        System.out.print("Enter height for square1: ");
        height = sc.nextInt();
        System.out.print("Enter width for square1: ");
        width = sc.nextInt();
        Square1 square1 = new Square1(height, width, circle);

        square1.display();
        sc.close();
    }
}
