package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static List<Integer> list = new ArrayList<>();

    public static void intList() {
        for (int i = 0; i <= 350; i++) {
            if ((i % 2 == 0) && (i <= 30 || i >= 300)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
