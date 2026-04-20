class ClassDemo {
    int a = 10;
    String b = "Emon";

    void shoew() {
        System.out.println(a + " " + b);
    }

    
}
public class objTest {
    public static void main(String[] args) {
        ClassDemo obj = new ClassDemo();
        obj.shoew();
    }
}
