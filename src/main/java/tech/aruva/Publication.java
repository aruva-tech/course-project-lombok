package tech.aruva;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Publication {

    @NonNull
    private String publisher;

    public Publication(@NonNull String publisher) {
        this.publisher = publisher;
    }
}
