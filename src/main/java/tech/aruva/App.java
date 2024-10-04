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

        Book book2 = new Book("Addison-Wesley")
                .title("Effective Java")
                .author("Joshua Bloch")
                .available(false)
                .isbn("978-0134685991");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("book1 equals book2? " + book1.equals(book2));




    }
}
