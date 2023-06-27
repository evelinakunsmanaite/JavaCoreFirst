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

    public static void fourthTask(int number) {
        int result;
        for (int i = 0; i <= 9; i++) {
            result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }

    public static void fifthTask(int floorNumber) {
        if (floorNumber >= 1 && floorNumber <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorNumber >= 5 && floorNumber <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorNumber >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Данного этажа не существует, проверьте корректность введённой информации");
        }
    }

    public static void sixth(int a, int b) {
        for (int i = a; i <= b; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.println(i);
            }
        }
    }
}