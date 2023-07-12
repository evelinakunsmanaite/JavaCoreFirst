package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException, IllegalLength {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] peoples = scanner.nextLine().split(" ");
            String name = null;
            int year = 0;

            for (int i = 0; i < peoples.length; i++) {
                if (i % 2 == 0) {
                    name = peoples[i];
                } else {
                    year = Integer.parseInt(peoples[i]);
                }
            }
            if (year < 0) {
                throw new IllegalLength();
            } else {
                persons.add(new Person(name, year));
            }
        }
        return persons;
    }
}
