import java.util.Scanner;;
public class Buy {
    private String date;
    private int quantity;
    private Customer customer;
    private Item item;
    public Buy(String date, int quantity, Customer customer, Item item){
        this.date = date;
        this.quantity = quantity;
        this.customer = customer;
        this.item = item;
    }
    public void display(){
        customer.display();
        System.out.println();
        item.display();
        System.out.println();
        System.out.println("Buy:");
        System.out.println("Date:"+date);
        System.out.println("Quantity:"+quantity);
    }
    public void totalBuy(){
        System.out.println("Total: "+ quantity*item.getPrice());
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String custName,custid,cell,itemName,itemid, date;
        double price;
        int quantity;

        System.out.print("Enter customer name: ");
        custName = sc.nextLine();
        System.out.print("Enter customer ID: ");
        custid = sc.nextLine();
        System.out.print("Enter customer cell: ");
        cell = sc.nextLine();
        Customer customer = new Customer(custid, custName, cell);

        System.out.print("Enter item name: ");
        itemName = sc.nextLine();
        System.out.print("Enter item ID: ");
        itemid = sc.nextLine();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
        Item item = new Item(itemid, itemName, price);

        sc.nextLine();
        System.out.print("Enter buying date: ");
        date = sc.nextLine();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        Buy buy = new Buy(date, quantity, customer, item);

        buy.display();
        buy.totalBuy();
        sc.close();
    }
}
