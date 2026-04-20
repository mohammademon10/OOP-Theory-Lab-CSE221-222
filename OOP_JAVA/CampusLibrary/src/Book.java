public class Book {
    private String isbn;
    private String title;
    private String author;
    public Book(String isbn,String title,String author)
    {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    public void displayInfo()
    {
        System.out.println("isbn: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);

    }

    public String getTitle()
    {
        return title;
    }

}
