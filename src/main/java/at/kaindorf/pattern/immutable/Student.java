package at.kaindorf.pattern.immutable;

import java.time.LocalDate;

// final class cannot be inherited

public final class Student {
    private final int id;
    private final String name;
    private final LocalDate dateOfBirth;

    // make Address Class Immutable or Clone the Object in the getter
    private final Address address;

    public Student(int id, String name, LocalDate dateOfBirth, Address address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        // cloned the incoming Address
        this.address = new Address(address.getStreetName(), address.getStreetNumber());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Address getAddress() {
        // clone Object
        return  new Address(address.getStreetName(), address.getStreetNumber());
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
