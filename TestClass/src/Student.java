public class Student {
    private String sName;
    private int sId;
    private String dept;

    public Student(String sName, int sId, String dept) {
        this.sName = sName;
        this.sId = sId;
        this.dept = dept;
    }

    public String getName() {
        return sName;
    }

    public int getId() {
        return sId;
    }

    public String getDept() {
        return dept;
    }
}