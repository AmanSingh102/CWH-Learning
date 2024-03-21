import java.util.ArrayList;
class Book
{
    public String name, author;

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Book" +
                "{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}' ;
    }
}

class MyLibrary
{
    public ArrayList<Book> books;

    public MyLibrary( ArrayList<Book> books )
    {
        this.books = books;
    }

    public void addBook( Book book )
    {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }

    public void issuedBook( Book book, String issued_to )
    {
        System.out.println("The book has been issued form the Library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook( Book b )
    {
        System.out.println("The book has been Returned");
        this.books.add(b);
    }
}
public class java_103_Library_Management_System
{
    public static void main(String[] args)
    {
        ArrayList<Book> bk  = new ArrayList<>();

        Book b1 = new Book("Algorithms1","CLRS1");
        bk.add(b1);
        Book b2 = new Book("Algorithms2","CLRS2");
        bk.add(b2);
        Book b3 = new Book("Algorithms3","CLRS3");
        bk.add(b3);
        Book b4 = new Book("Algorithms4","CLRS4");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);

        l.addBook( new Book("Algo4","MyAuthor"));
        System.out.println(l.books);

        l.issuedBook(b1,"Aman");
        System.out.println(l.books);

        l.returnBook(b1);
        System.out.println(l.books);
    }
}
