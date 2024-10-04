package tech.aruva;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = false)
public class Book extends Publication{

    private String title;
    private int noOfPages;
    private String author;
    private String isbn;

    @EqualsAndHashCode.Exclude
    boolean available;

    public Book(String publisher) {
        super(publisher);
    }
}
