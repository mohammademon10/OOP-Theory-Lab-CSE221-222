//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1=new Book ("818547","IkiGaie","JohBik Man");
        Book book2=new Book ("818545","The Alchemist","Polo");
        Book book3=new Book ("818549","AtomicHabit","JohanKari");
        book1.displayInfo();
        Library Diu=new Library("232-15-818","YKSG_01");
        Diu.addBook(book1);
        Diu.addBook(book2);
        Diu.addBook(book3);
        Diu.ListBook();
        System.out.println(Diu);

        }
    }
