import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        System.out.println("Сейчас: " + localDateTime.format(formatter) + "\n");
//
//        SystemInformation.getSystemInformation();
//
//        System.out.println("Конечная стоимость топлива " + FillingStation.countPrice() + "\n");
//
//        Tasks.firstTask();
//
//        Tasks.secondTask();
//
//        Tasks.thirdTask();
//
//        System.out.println("\nВведите число от 0 до 9");
//        int number = scanner.nextInt();
//        Tasks.fourthTask(number);
//
//        System.out.println("\nВведите номер этажа");
//        int floorNumber = scanner.nextInt();
//        Tasks.fifthTask(floorNumber);
//
//        System.out.println("\nВведите диапазон от а до b");
//        System.out.println("\nВведите а");
//        int a = scanner.nextInt();
//        System.out.println("\nВведите b");
//        int b = scanner.nextInt();
//
//        if (a >= b) {
//            System.out.println("Данные введены некорректно");
//        } else {
//            Tasks.sixthTask(a, b);
//        }
//
//        System.out.println("\nВведите x");
//        double x = scanner.nextDouble();
//        Tasks.seventhTask(x);
//
//        while (true) {
//            System.out.println("\nВведите страну");
//            String cityName = scanner.next();
//            if (!cityName.equals("stop")) {
//                Tasks.getCapitalByCity(cityName);
//            } else {
//                System.out.println("Завершение программы");
//                break;
//            }
//        }
//
//        while (true) {
//            System.out.println("\nВведите делимое");
//            double dividend = scanner.nextDouble();
//            System.out.println("\nВведите делитель");
//            double divisor = scanner.nextDouble();
//            if (divisor != 0) {
//                Tasks.dividedBy(dividend, divisor);
//            } else {
//                System.out.println("Завершение программы");
//                break;
//            }
//        }
//
//        int i = 0;
//        while (i != 5) {
//            System.out.println("\nВведите делимое");
//            double dividend = scanner.nextDouble();
//            System.out.println("\nВведите делитель");
//            double divisor = scanner.nextDouble();
//            if (divisor == 0) {
//                System.out.println("Деление на 0");
//            } else {
//                Tasks.dividedBy(dividend, divisor);
//            }
//            i++;
//        }
//
//        System.out.println("Введите размер массива: ");
//        int arrayLength = scanner.nextInt();
//        SecondTask.createArrayAndGetInfo(arrayLength);
//
//        SecondTask.getArrayInfo();
//
//        SecondTask.multiDimensionalArrays();
//
//        SecondTask.getMaxSum();

//        Car car = new Car();
//        car.info();
//        car.setYear(2017);
//        car.setColor("black");
//        car.setModel("Porsche Panamera E-Hybrid");
//
//        System.out.println("Год выпуска: " + car.getYear());
//        System.out.println("Цвет: " + car.getColor());
//        System.out.println("Модель: " + car.getModel());
//
//        Car secondCar = new Car();
//        secondCar.setYear(2019);
//        secondCar.setColor("white");
//        secondCar.setModel("Ford Focus");
//
//        System.out.println("\nВведите год: ");
//        int year = scanner.nextInt();
//        System.out.println("Разница: " + secondCar.yearDifference(year));
//
//        System.out.println(secondCar);
//
//        Motorbike motorbike = new Motorbike(2011, "black", "Honda CB1300");
//        motorbike.info();
//        System.out.println(motorbike);
//        System.out.println("\nВведите год: ");
//        int yearMotorbike = scanner.nextInt();
//        System.out.println("Разница: " + motorbike.yearDifference(yearMotorbike));

        Airplane airplane = new Airplane("Japan", 2022, 951.55, 85.96);
        airplane.setYear(2023);
        airplane.setLength(1226.52);
        airplane.fillUp(26.652);
        airplane.fillUp(22.35);
        airplane.info();
    }
}
