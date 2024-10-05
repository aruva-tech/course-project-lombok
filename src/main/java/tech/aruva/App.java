package tech.aruva;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class App {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        // Building a Book instance using Lombok's Builder
        Book book = Book.builder()
                .title("Effective Java")
                .author("Joshua Bloch")
                .bestseller(true)
                .isbn("978-0134685991")
                .genre("Programming")
                .genre("Java")
                .build();

        // Logging book details
        book.logBookDetails();

        Book book2 = book.withTitle("Java Lombok").withAuthor("Aruva Tech");

        book2.logBookDetails();

        try {
            // Serializing Book to JSON
            String jsonString = mapper.writeValueAsString(book);
            System.out.println("Serialized JSON:\n" + jsonString);

            // Deserializing JSON back to Book
            Book deserializedBook = mapper.readValue(jsonString, Book.class);
            System.out.println("\nDeserialized Book:\n" + deserializedBook);

            // Logging deserialized book details
            deserializedBook.logBookDetails();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // Attempting to build a Book with a null title (should throw exception)
        try {
            Book invalidBook = Book.builder()
                    .author("Unknown Author")
                    .isbn("000-0000000000")
                    .build();
        } catch (NullPointerException e) {
            System.out.println("\nCaught exception while building invalid book: " + e.getMessage());
        }
    }
}