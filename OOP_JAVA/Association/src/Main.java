public class Main {
    public static void main(String[] args) {
        Star star = new Star(5,70,8);
        Rectangle rectangle = new Rectangle(7, 8, star);
        Circle circle = new Circle(5.64563, rectangle);
        Rombus rombus = new Rombus(13, 18, circle);
        Square square = new Square(14, rombus);
        square.display();
    }
}
