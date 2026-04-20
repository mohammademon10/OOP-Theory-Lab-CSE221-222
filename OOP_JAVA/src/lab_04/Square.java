package lab_04;

import java.util.Scanner;

public class Square {
    private int height;
    private int width;
    public Square(int height, int width){
        this.height = height;
        this.width = width;
    }
    public void display(){
        System.out.println("Total: height = "+height+", width = "+width);
    }
    public Square add(Square a){
        return new Square(height+a.height,width+a.width);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int height, width;
        System.out.print("Enter height = ");
        height = sc.nextInt();
        System.out.print("Enter width = ");
        width = sc.nextInt();
        Square a = new Square(height, width);
        System.out.println("Object a is created");

        System.out.print("Enter height = ");
        height = sc.nextInt();
        System.out.print("Enter width = ");
        width = sc.nextInt();
        Square b = new Square(height, width);
        System.out.println("Object b is created");

        Square c = a.add(b);
        c.display();
    }
}
