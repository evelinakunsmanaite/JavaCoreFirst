package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {

public static void printResult(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    String[] stringNumbers = scanner.nextLine().split(" ");
    int sum = 0;
    for (String stringNumber : stringNumbers) {
        sum += Integer.parseInt(stringNumber);
    }
    double avg = (double) sum/stringNumbers.length;

    System.out.println("Числа в txt файле: "+ Arrays.toString(stringNumbers));
    System.out.println("Ответ: " + avg + " --> " +  String.format("%.3f", avg));
}
}
