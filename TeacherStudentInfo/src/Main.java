// Main.java
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Rahim", 40, 50000);
        Student s = new Student("Emon", 20, 3.85);

        t.displayInfo();
        System.out.println();
        s.displayInfo();
        System.out.println();

        t.viewStudentInfo(s);
        // s cannot access salary of teacher here.
    }
}
