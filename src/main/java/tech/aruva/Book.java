package tech.aruva;

import lombok.Builder;
import lombok.Singular;
import lombok.Data;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@JsonDeserialize(builder = Book.BookBuilder.class)
public class Book {
    @NotNull
    @JsonProperty("title")
    private String title;

    @NotNull
    @JsonProperty("author")
    private String author;

    private boolean bestseller;

    @NotNull
    @JsonProperty("isbn")
    private String isbn;

    @Singular
    private List<String> genres;

    @JsonPOJOBuilder(withPrefix = "")
    public static class BookBuilder {
        // Lombok generates this class
    }
}