import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Сейчас: " + localDateTime.format(formatter));
        System.out.println("");

        SystemInformation.getSystemInformation();

        System.out.println("Конечная стоимость топлива " + FillingStation.countPrice());
    }
}
