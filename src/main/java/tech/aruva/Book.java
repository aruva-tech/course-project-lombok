package tech.aruva;

import lombok.*;


@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = false)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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

    public static Book of(String title, int noOfPages, String author, String isbn){
        return new Book(title, noOfPages, author, isbn, true);
    }

    public static Book availableBook(String title, int noOfPages, String author, String isbn){
        return new Book(title, noOfPages, author, isbn, false);
    }

    public static Book defaultBook(String title, String author){
        return new Book(title, 500, author, "000-0000000000", true);
    }

}
