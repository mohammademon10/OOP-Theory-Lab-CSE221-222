package lab_04;

import java.util.*;

public class Cube {
    private int x;
    private double y;
    public Cube(int x, double y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("X = " + x + "; Y = " + y);
    }
    public Cube add(Cube b){
        return new Cube(x+b.x, y+b.y);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        Cube a = new Cube(x, y);

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextDouble();
        Cube b = new Cube(x, y);

      Cube c = a.add(b);

        c.display();

    }
}