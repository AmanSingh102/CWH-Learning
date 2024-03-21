import java.util.Objects;
import java.util.Scanner;

class Library
{
    String[] books;
    int no_of_books;
    Library()
    {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println( book + " has been added !!!" );
    }

    void showAvailableBooks()
    {
        System.out.println("Available books are : ");
        for( String book : this.books )
        {
            if( book == null ) { continue; }
            System.out.println( "* " + book );
        }
    }

    void issueBook(String book)
    {
        for( int i=0; i < this.books.length; i++ )
        {
            if( this.books[i].equals(book))
            {
                System.out.println("The book has been issued!!!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This is book does not exist");
    }

    void returnBook( String book ) { addBook(book); }

}

public class java_60_Online_Library
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

                Library centralLibrary = new Library();
                String book;

                do {
                    System.out.print("Enter the name of the Book [ Click N for Stop ] : ");
                    book = sc.nextLine();

                    if(Objects.equals(book, "N")) {   continue;   }

                    centralLibrary.addBook(book);

                } while (!Objects.equals(book, "N"));

                System.out.println();
                centralLibrary.showAvailableBooks();

                System.out.println();
                System.out.print("Enter for issued the book : ");
                book = sc.nextLine();
                centralLibrary.issueBook(book);
                System.out.println();
                centralLibrary.showAvailableBooks();

                System.out.println();
                System.out.print("Enter for Return the book : ");
                book = sc.nextLine();
                centralLibrary.returnBook(book);
                centralLibrary.showAvailableBooks();

        sc.close();
    }
}
