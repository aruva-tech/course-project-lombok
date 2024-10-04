package tech.aruva;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Publication {

    private String publisher;

    public Publication(String publisher) {
        this.publisher = publisher;
    }
}
