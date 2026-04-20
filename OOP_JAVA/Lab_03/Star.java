public class Star {
    int throne;
    double degree;
    double len;

    public Star(int throne, double degree, double len) {
        this.throne = throne;
        this.degree = degree;
        this.len = len;
    }

    public void display() {
        System.out.println("Thrones: "+this.throne);
        System.out.println("Degree: "+this.degree);
        System.out.println("Length: "+this.len);
    }
}
