import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String stuid, name;
    private double cgpa;

    public Student(String stuid, String name, double cgpa) {
        this.stuid = stuid;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("ID: " + stuid + ", Name: " + name + ", CGPA: " + cgpa);
    }

    public static void main(String[] x) {
        int no;
        String stuid, name;
        double cgpa;
        Student s;

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> st = new ArrayList<Student>();
        System.out.print("Enter the number of students: ");
        no = sc.nextInt();

        for (int i = 0; i < no; i++) {
            System.out.println("Enter ID: ");
            stuid = sc.next();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter CGPA: ");
            cgpa = sc.nextDouble();

            s = new Student(stuid, name, cgpa);
            st.add(s);
        }

        for (Student student : st) {
            student.display();
        }

        sc.close();
    }
}