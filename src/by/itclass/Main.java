package by.itclass;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import by.itclass.model.Genus;
import by.itclass.utils.CompetitionUtils;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var cats = new ArrayList<Cat>();
        var dogs = new ArrayList<Dog>();
        var errors = new HashMap<String, String>();

        CompetitionUtils.parseFile(cats, dogs, errors);
    }
}
