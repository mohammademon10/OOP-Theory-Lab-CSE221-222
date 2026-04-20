
// Teacher.java
class Teacher {
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void viewStudentInfo(Student student) {
        System.out.println("Student Info Viewed by Teacher:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("CGPA: " + student.getCgpa());
    }

    public void displayInfo() {
        System.out.println("Teacher Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
