public class Rectangle {
    int height;
    int width;
    Star star;

    public Rectangle(int height, int width, Star star) {
        this.height = height;
        this.width = width;
        this.star = star;
    }
    public void display() {
        System.out.println("Thrones: "+this.star.throne);
        System.out.println("Degree: "+this.star.degree);
        System.out.println("Length: "+this.star.len);
        System.out.println("Height: "+this.height);
        System.out.println("Width: "+this.width);
    }
}
