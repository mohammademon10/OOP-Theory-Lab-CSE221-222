public class Circle{
    private double radius;
    private Square2 square2;
    public Circle(double radius, Square2 square2){
        this.radius = radius;
        this.square2 = square2;
    }
    public void display(){
        square2.display();
        System.out.println("Circle: radius = "+radius);
    }
}
