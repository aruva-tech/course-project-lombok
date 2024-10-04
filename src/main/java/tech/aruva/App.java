package tech.aruva;

public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book("Constructor Publishing House");
        book.setAuthor("Author Name");
        book.setTitle("Title");
        // book.setPublisher("Publishing House");
        book.setIsbn("1234567890");

        // note: the getAuthor() method is not available
        //System.out.println(book.getAuthor());

        // note: the ToString() has access to private variables directly
        System.out.println( book );

    }
}
