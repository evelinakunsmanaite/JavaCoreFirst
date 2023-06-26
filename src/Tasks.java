import java.time.LocalDate;

public class Tasks {

    public static void firstTask() {
        System.out.println("В строчку через while");
        int i = 1;
        while (i <= 10) {
            System.out.print("JAVA ");
            i++;
        }

        System.out.println("");
        System.out.println("\nВ строчку через for");
        for (int j = 0; j < 10; j++) {
            System.out.print("JAVA ");
        }

        System.out.println("");
        System.out.println("\nВ столбик через while");
        int g = 1;
        while (g <= 10) {
            System.out.println("JAVA ");
            g++;
        }

        System.out.println("\nВ столбик через for");
        for (int j = 0; j < 10; j++) {
            System.out.println("JAVA ");
        }
    }

    public static void secondTask() {
        int year = 1980;
        int limit = LocalDate.now().getYear();

        System.out.println("\nЧерез while");
        while (year <= limit) {
            System.out.println("Олимпиада: " + year + " года");
            year = year + 4;
        }
    }

    public static void thirdTask() {
        int year = 1980;
        int limit = LocalDate.now().getYear();

        System.out.println("\nЧерез for");
        for (int i = year; i < limit; i = i + 4) {
            System.out.println("Олимпиада: " + i + " года");
        }
    }
}
