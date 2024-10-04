package tech.aruva;

import lombok.ToString;

@ToString
public class Publication {

    private String publisher;

    public Publication(String publisher) {
        this.publisher = publisher;
    }
}
