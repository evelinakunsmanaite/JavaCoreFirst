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
            peopleList.addAll(Arrays.asList(peoples));
        }

        return peopleList;
    }
}
