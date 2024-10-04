package tech.aruva;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
@Accessors(fluent = true, chain = true)
public class Book {

    @Getter @Setter
    private String title;

    @Getter(AccessLevel.NONE) @Setter
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
