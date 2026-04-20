// Student.java
class Student {
    private String name;
    private int age;
    private double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    // Getters (no access to Teacher's salary in this class)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}
