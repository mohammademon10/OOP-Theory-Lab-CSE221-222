public class Rombus {
    int side;
    int middle;
    Circle circle;

    public Rombus(int side, int middle, Circle circle) {
        this.side = side;
        this.middle = middle;
        this.circle = circle;
    }
    public void display() {
        System.out.println("Thrones: "+this.circle.rectangle.star.throne);
        System.out.println("Degree: "+this.circle.rectangle.star.degree);
        System.out.println("Length: "+this.circle.rectangle.star.len);
        System.out.println("Height: "+this.circle.rectangle.height);
        System.out.println("Width: "+this.circle.rectangle.width);
        System.out.println("Radius: "+this.circle.radius);
        System.out.println("Side: "+this.side);
        System.out.println("Middle: "+this.middle);
    }
}