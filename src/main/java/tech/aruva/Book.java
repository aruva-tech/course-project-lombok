package tech.aruva;

import lombok.Builder;
import lombok.Value;
import lombok.Singular;
import lombok.With;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import com.google.common.collect.ImmutableList;
import java.util.List;

@Value
@Builder
@With
//@Slf4j
@Log4j2
@JsonDeserialize(builder = Book.CustomBookBuilder.class)
public class Book {
    @NotNull
    @JsonProperty("title")
    String title;

    @NotNull
    @JsonProperty("author")
    String author;

    boolean bestseller;

    @NotNull
    @JsonProperty("isbn")
    String isbn;

    @Singular
    @JsonProperty("genres")
    ImmutableList<String> genres;

    @JsonPOJOBuilder(withPrefix = "")
    public static class CustomBookBuilder {
        // Lombok generates this class using Guava's ImmutableList.Builder
    }

    public void logBookDetails() {
        logger.info("Book Details: {}", this);
    }
}