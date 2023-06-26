import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Сейчас: " + localDateTime.format(formatter));
        System.out.println("");

        SystemInformation.getSystemInformation();

        System.out.println("Конечная стоимость топлива " + FillingStation.countPrice());
        System.out.println("");

        Tasks.firstTask();

        Tasks.secondTask();

        Tasks.thirdTask();

        System.out.println("\nВведите число от 0 до 9");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Tasks.fourthTask(number);
    }
}
