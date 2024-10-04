package tech.aruva;

import lombok.*;


@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = false)
public class Book extends Publication{

    @NonNull
    private String title;
    private int noOfPages;

    @NonNull
    private String author;

    @NonNull
    private String isbn;

    @EqualsAndHashCode.Exclude
    boolean available;

    public Book(@NonNull String publisher) {
        super(publisher);
    }

    public void updateIsbn(@NonNull String isbn){
        this.isbn = isbn;
    }


}
