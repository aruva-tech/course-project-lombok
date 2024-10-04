package tech.aruva;

public class App
{
    public static void main( String[] args )
    {
        Book book1 = new Book("Addison-Wesley")
                .title("Effective Java")
                .author("Joshua Bloch")
                .available(true)
                .isbn("978-0134685991");

        try {
            Book book2 = new Book(null); //deliberately triggering an error
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            book1.updateIsbn(null);
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println(book1);
    }
}
