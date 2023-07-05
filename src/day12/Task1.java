package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private static List<String> auto = new ArrayList<>();

    public static void autoList() {
        auto.add("Porsche");
        auto.add("Aston Martin");
        auto.add("Bugatti");
        auto.add("BMW");
        auto.add("Range Rover");

        System.out.println("Машины:\n");
        for (String automobile : auto) {
            System.out.println(automobile);
        }

        int index = auto.size() / 2;
        auto.add(index, "Ferrari");

        auto.remove(0);

        System.out.println("\nПосле добавления и удаления:\n");
        for (String automobile : auto) {
            System.out.println(automobile);
        }
    }
}
