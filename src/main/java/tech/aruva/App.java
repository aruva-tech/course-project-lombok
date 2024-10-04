package tech.aruva;

public class App
{
    public static void main( String[] args )
    {
       // note: as constructors are PRIVATE this will fail
       // Book book = new Book("Simple Title", "Author", "324-347854394");

        Book standardBook = Book.of("standard Title",150,"standard author", "123-4567890");

        Book availableBook = Book.availableBook("available Title",260,"available author", "123-4567890");

        Book defaultBook = Book.defaultBook("default Title","default author");

        System.out.println(standardBook);
        System.out.println(availableBook);
        System.out.println(defaultBook);

    }
}
