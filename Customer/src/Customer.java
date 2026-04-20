
class Customer {
    private int custid;
    private String name;
    private static String category;

    public Customer(int custid, String name) {
        this.custid = custid;
        this.name = name;
        this.category=category;
    }

    public static void setCat(String category) {
        Customer.category = category;
    }

    public static String getCat() {
        return category;
    }

    public void display() {
        System.out.println("Customer ID: " + custid);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
    }

    public static void main(String[] args) {
        Customer c = new Customer(101, "Emon");
        c.setCat("Regular");
        c.display();
    }
}