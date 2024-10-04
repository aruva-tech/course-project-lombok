package tech.aruva;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
//@ToString(callSuper = true)
@ToString(onlyExplicitlyIncluded = true)
public class Book extends Publication{

    @ToString.Include
    private String title;

    private int noOfPages;

    @ToString.Include
    private String author;
    private String isbn;
    boolean available;

    public Book(String publisher) {
        super(publisher);
    }
}
