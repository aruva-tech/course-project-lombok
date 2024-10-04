package tech.aruva;

public class App
{
    public static void main( String[] args )
    {
        Book book = new Book("Constructor Publisher")
                .setIsbn("isbn1001")
                .setAuthor("Author")
                .setTitle("Title")
                .setNoOfPages(200)
                .setAvailable(false);



        System.out.println("Book Details: " + book);
        System.out.println("No Of Pages: " + book.getNoOfPages());

        // note: when lombok.getter.noIsPrefix = true -> use getAvailable()
        System.out.println( book.getAvailable() ? "Available" : "Not Available" );

        // note: default: use isAvailable()
        //System.out.println( book.isAvailable() ? "Available" : "Not Available" );

    }
}
