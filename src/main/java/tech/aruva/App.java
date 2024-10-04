package tech.aruva;

public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book()
                .isbn("isbn0001")
                .author("Fluent Author")
                //note: not accessible as setter is PRIVATE
                //.publisher("Fluent Publisher")
                .title("Fluent Title");

        //note: using book.title() instead of book.getTitle()
        System.out.println( book.title() );

        System.out.println( book );

    }
}
