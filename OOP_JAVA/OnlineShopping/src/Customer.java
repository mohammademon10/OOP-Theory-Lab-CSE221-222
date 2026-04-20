public class   Customer {
    private String custid;
    private String name;
    private String cell;
    public Customer(String custid, String name, String cell){
        this.custid = custid;
        this.name = name;
        this.cell = cell;
    }
    public void display(){
        System.out.println("Customer:");
        System.out.println("name: "+name);
        System.out.println("Id  : "+custid);
        System.out.println("cell: "+cell);
    }
}
