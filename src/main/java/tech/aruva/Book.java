package tech.aruva;

import lombok.Builder;
import lombok.Value;
import lombok.Singular;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import com.google.common.collect.ImmutableList;
import java.util.List;

@Value
@Builder
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
}