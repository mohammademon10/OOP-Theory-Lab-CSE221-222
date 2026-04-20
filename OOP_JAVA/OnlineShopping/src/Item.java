public class Item {
    private String itemid;
    private String name;
    private double price;
    public Item(String itemid, String name, double price){
        this.itemid = itemid;
        this.name = name;
        this.price = price;
    }
    public void display(){
        System.out.println("Item:");
        System.out.println("name: "+name);
        System.out.println("Id  : "+itemid);
        System.out.println("price: "+price);
    }
    public double getPrice(){
        return price;
    }
}
