import java.util.ArrayList;
import java.util.List;
public class Library {
    private String LibaryId;
    private String Location;
    List<Book>BookList;
    public Library(String LibaryId, String Location)
    {
        this.LibaryId=LibaryId;
        this.Location=Location;
        this.BookList=new ArrayList<Book>();
    }
    public void addBook(Book book)
    {
        BookList.add(book);
        System.out.println("Book: "+book.getTitle()+"Added Book Sucessfully");

    }
    public void ListBook()
    {
        for(Book List:BookList )
        {
            List.displayInfo();
        }

    }

    @Override
    public String toString() {
        return "Library{" +
                "LibaryId='" + LibaryId + '\'' +
                ", Location='" + Location + '\'' +
                ", BookList=" + BookList +
                '}';
    }
}
