package tech.aruva;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {

    private String title;
    private String author;
    private String publisher;
    private String isbn;
}
