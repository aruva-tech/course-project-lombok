package tech.aruva;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Publication {

    // note: Generating a no-args constructor for classes with final fields requires the use of force = true
    @NonNull
    private String publisher;

}
