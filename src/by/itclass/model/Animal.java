package by.itclass.model;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.StringJoiner;

@AllArgsConstructor
public abstract class Animal  implements Comparable<Animal>{
    private  final long chipNumber;
    private final Genus genus;
    private final String name;
    private final LocalDate birthdate;
    private final String breed;
    private final String email;

    @Override
    public String toString() {
        return new StringJoiner(", ", genus.getValue() + "[", "]")
                .add("chipNumber=" + chipNumber)
                .add("name='" + name + "'")
                .add("birthdate=" + birthdate)
                .add("breed='" + breed + "'")
                .add("email='" + email + "'")
                .toString();
    }

    @Override
    public int compareTo(Animal animal) {
        return birthdate.compareTo(animal.birthdate);
    }
}
