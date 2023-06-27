import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Сейчас: " + localDateTime.format(formatter) + "\n");

        SystemInformation.getSystemInformation();

        System.out.println("Конечная стоимость топлива " + FillingStation.countPrice() + "\n");

        Tasks.firstTask();

        Tasks.secondTask();

        Tasks.thirdTask();

        System.out.println("\nВведите число от 0 до 9");
        int number = scanner.nextInt();
        Tasks.fourthTask(number);

        System.out.println("\nВведите номер этажа");
        int floorNumber = scanner.nextInt();
        Tasks.fifthTask(floorNumber);

        System.out.println("\nВведите диапазон от а до b");
        System.out.println("\nВведите а");
        int a = scanner.nextInt();
        System.out.println("\nВведите b");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Данные введены некорректно");
        } else {
            Tasks.sixth(a, b);
        }


    }
}
