package tech.aruva;

import lombok.*;

@EqualsAndHashCode
@ToString
// note: Constructors can be classified with Access levels as fields
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
public class Publication {

    // note: Generating a no-args constructor for classes with final fields requires the use of force = true
    @NonNull
    private final String publisher;

    public Publication(@NonNull String publisher) {
        this.publisher = publisher;
    }
}
