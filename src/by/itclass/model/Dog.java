package by.itclass.model;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(long chipNumber, Genus genus, String name, LocalDate birthdate, String breed, String email) {
        super(chipNumber, genus, name, birthdate, breed, email);
    }
}
