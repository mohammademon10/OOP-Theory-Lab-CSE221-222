public class Circle {
    double radius;
    Rectangle rectangle;

    public Circle(double radius, Rectangle rectangle) {
        this.radius = radius;
        this.rectangle = rectangle;
    }
    public void display() {
        System.out.println("Thrones: "+this.rectangle.star.throne);
        System.out.println("Degree: "+this.rectangle.star.degree);
        System.out.println("Length: "+this.rectangle.star.len);
        System.out.println("Height: "+this.rectangle.height);
        System.out.println("Width: "+this.rectangle.width);
        System.out.println("Radius "+this.radius);
    }
}