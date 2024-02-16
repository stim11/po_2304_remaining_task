package by.itclass.utils;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@UtilityClass
public class CompetitionUtils {
    private static final String PATH_TO_FILE = "src/by/itclass/resources/animals.txt";
    public static void parseFile(ArrayList<Cat> cats, ArrayList<Dog> dogs,
                                 HashMap<String, String> errors) {
        try(Scanner sc = new Scanner(new FileReader(PATH_TO_FILE))) {
            while (sc.hasNextLine()) {
                var Animal = AnimalFactory.getInstance(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File hasn't been found by path " + PATH_TO_FILE);
            System.exit(1);
        }
    }
}
