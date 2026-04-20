public class Main {
    public static void main(String[] args) {
        Student st = new Student("Akash", 130, "CSE");

        System.out.println("Name: " + st.getName());
        System.out.println("ID: " + st.getId());
        System.out.println("Department: " + st.getDept());
    }
}