package lab_04;

/*Data object has data variable. It's a integer variable. We have functionality to addition and display the data.
For addition we will add 2 data.*/


import java.util.*;
public class Data {
    private int data;
    public Data(int data){
        this.data = data;
    }
    public Data addition(Data a){
        return new Data(data + a.data);
    }
    public void display(){
        System.out.println("Data :" + data);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        Data a = new Data(sc.nextInt());

        System.out.print("Enter b: ");
        Data b = new Data(sc.nextInt());

        Data c = a.addition(b);
        c.display();
        sc.close();
    }
}
