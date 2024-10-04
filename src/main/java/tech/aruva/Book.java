package tech.aruva;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Book {

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String author;

    @Getter @Setter(AccessLevel.PRIVATE)
    private String publisher;

    @Getter(AccessLevel.PROTECTED) @Setter
    private String isbn;

    public Book(String publisher) {
        this.publisher = publisher;
    }

    public Book() {}
}
