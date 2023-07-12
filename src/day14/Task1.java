package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void printSumDigits(File file) throws FileNotFoundException, IllegalLength {
        Scanner scanner = new Scanner(file);
        String[] numbersString = scanner.nextLine().split(" ");
        int sum = 0;
        if (numbersString.length != 10) {
            throw new IllegalLength();
        } else {
            for (String s : numbersString) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }

    }
}
