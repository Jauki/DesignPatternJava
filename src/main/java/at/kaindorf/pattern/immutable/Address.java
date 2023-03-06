package at.kaindorf.pattern.immutable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String streetName;
    private int streetNumber;


}
