package tech.aruva;

public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book();
        book.setAuthor("Author Name");
        book.setTitle("Title");
        book.setPublisher("Publishing House");
        book.setIsbn("1234567890");

        System.out.println( book );

    }
}
