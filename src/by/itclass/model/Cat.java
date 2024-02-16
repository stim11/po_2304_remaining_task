package by.itclass.model;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(long chipNumber, Genus genus, String name, LocalDate birthdate, String breed, String email) {
        super(chipNumber, genus, name, birthdate, breed, email);
    }
}
