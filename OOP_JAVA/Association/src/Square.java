public class Square {
    int side;
    Rombus rombus;

    public Square(int side, Rombus rombus) {
        this.side = side;
        this.rombus = rombus;
    }
    public void display() {
        System.out.println("Thrones: "+this.rombus.circle.rectangle.star.throne);
        System.out.println("Degree: "+this.rombus.circle.rectangle.star.degree);
        System.out.println("Length: "+this.rombus.circle.rectangle.star.len);
        System.out.println("Height: "+this.rombus.circle.rectangle.height);
        System.out.println("Width: "+this.rombus.circle.rectangle.width);
        System.out.println("Radius: "+this.rombus.circle.radius);
        System.out.println("Side: "+this.rombus.side);
        System.out.println("Middle: "+this.rombus.middle);
        System.out.println("Square side: "+this.side);
    }
}