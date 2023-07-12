package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException, IllegalLength {
        List<String> peopleList = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {

            String[] peoples = scanner.nextLine().split("\n");
            for (String people : peoples) {
                if (people.contains("-")) {
                    throw new IllegalLength();
                } else {
                    peopleList.add(people);
                }
            }
        }
        return peopleList;
    }
}
