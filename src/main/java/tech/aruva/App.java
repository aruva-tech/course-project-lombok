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

        try {
            // Serializing Book to JSON
            String jsonString = mapper.writeValueAsString(book);
            System.out.println("Serialized JSON:\n" + jsonString);

            // Deserializing JSON back to Book
            Book deserializedBook = mapper.readValue(jsonString, Book.class);
            System.out.println("\nDeserialized Book:\n" + deserializedBook);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}