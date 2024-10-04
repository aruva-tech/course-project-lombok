package tech.aruva;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Book {

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String author;

    @Getter @Setter
    private String publisher;

    @Getter @Setter
    private String isbn;
}
