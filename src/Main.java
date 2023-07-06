import Task3D12.Task3;
import Task5D12.Task5;
import day12.Task1;
import day12.Task2;
import day13.BinaryTree;
import day13.Node;
import first.Courier;
import first.Picker;
import first.Warehouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        System.out.println("Сейчас: " + localDateTime.format(formatter) + "\n");
//
//        first.SystemInformation.getSystemInformation();
//
//        System.out.println("Конечная стоимость топлива " + first.FillingStation.countPrice() + "\n");
//
//        first.Tasks.firstTask();
//
//        first.Tasks.secondTask();
//
//        first.Tasks.thirdTask();
//
//        System.out.println("\nВведите число от 0 до 9");
//        int number = scanner.nextInt();
//        first.Tasks.fourthTask(number);
//
//        System.out.println("\nВведите номер этажа");
//        int floorNumber = scanner.nextInt();
//        first.Tasks.fifthTask(floorNumber);
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
//            first.Tasks.sixthTask(a, b);
//        }
//
//        System.out.println("\nВведите x");
//        double x = scanner.nextDouble();
//        first.Tasks.seventhTask(x);
//
//        while (true) {
//            System.out.println("\nВведите страну");
//            String cityName = scanner.next();
//            if (!cityName.equals("stop")) {
//                first.Tasks.getCapitalByCity(cityName);
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
//                first.Tasks.dividedBy(dividend, divisor);
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
//                first.Tasks.dividedBy(dividend, divisor);
//            }
//            i++;
//        }
//
//        System.out.println("Введите размер массива: ");
//        int arrayLength = scanner.nextInt();
//        first.SecondTask.createArrayAndGetInfo(arrayLength);
//
//        first.SecondTask.getArrayInfo();
//
//        first.SecondTask.multiDimensionalArrays();
//
//        first.SecondTask.getMaxSum();

//        first.Car car = new first.Car();
//        car.info();
//        car.setYear(2017);
//        car.setColor("black");
//        car.setModel("Porsche Panamera E-Hybrid");
//
//        System.out.println("Год выпуска: " + car.getYear());
//        System.out.println("Цвет: " + car.getColor());
//        System.out.println("Модель: " + car.getModel());
//
//        first.Car secondCar = new first.Car();
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
//        first.Motorbike motorbike = new first.Motorbike(2011, "black", "Honda CB1300");
//        motorbike.info();
//        System.out.println(motorbike);
//        System.out.println("\nВведите год: ");
//        int yearMotorbike = scanner.nextInt();
//        System.out.println("Разница: " + motorbike.yearDifference(yearMotorbike));

//        first.Airplane airplane = new first.Airplane("Japan", 2022, 951.55, 85.96);
//        first.Airplane airplane1 = new first.Airplane("China", 2022, 125.12, 56.63);
//
//        airplane.setYear(2023);
//        airplane.setLength(1226.52);
//        airplane.fillUp(26.652);
//        airplane.fillUp(22.35);
//        airplane.info();
//
//        airplane1.info();
//
//        first.Airplane.compareAirplanes(airplane, airplane1);

//        first.Teacher teacher = new first.Teacher("Lina", "math");
//        first.Student student = new first.Student("Jon");
//        teacher.evaluate(student);
//        first.Player player1 = new first.Player();
//        first.Player player2 = new first.Player();
//        first.Player player3 = new first.Player();
//        first.Player player4 = new first.Player();
//        first.Player player5 = new first.Player();
//        first.Player player6 = new first.Player();
//
//        first.Player.info();
//
//        System.out.println("Выносливость 1: " + player1.getStamina());
//        System.out.println("Выносливость 2: " + player2.getStamina());
//        System.out.println("Выносливость 3: " + player3.getStamina());
//        System.out.println("Выносливость 4: " + player4.getStamina());
//        System.out.println("Выносливость 5: " + player5.getStamina());
//        System.out.println("Выносливость 6: " + player6.getStamina());
//
//        for (int i = 0; i < 95; i++) {
//            player1.run();
//            player2.run();
//            player3.run();
//            player4.run();
//            player5.run();
//            player6.run();
//        }
//
//        first.Player.info();
//
//        System.out.println("Выносливость 1: " + player1.getStamina());
//        System.out.println("Выносливость 2: " + player2.getStamina());
//        System.out.println("Выносливость 3: " + player3.getStamina());
//        System.out.println("Выносливость 4: " + player4.getStamina());
//        System.out.println("Выносливость 5: " + player5.getStamina());
//        System.out.println("Выносливость 6: " + player6.getStamina());

//        first.TaskStrBuilder.getStr();
//        first.Airplane airplane = new first.Airplane("Japan", 2022, 951.55, 85.96);
//        System.out.println(airplane);

//first.Task1.main();

//       first.TestFigures.main();


//        Warehouse warehouse = new Warehouse();
//
//        Picker picker = new Picker(warehouse);
//        Courier courier = new Courier(warehouse);
//
//        picker.doWork();
//        courier.doWork();
//
//        System.out.println(warehouse);

//        Task1.autoList();

//        Task2.intList();

//        Task3.getMusicBands();
//        Task5.band();

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(20);
        binaryTree.addNode(14);
        binaryTree.addNode(11);
        binaryTree.addNode(5);
        binaryTree.addNode(8);
        binaryTree.addNode(16);
        binaryTree.addNode(15);
        binaryTree.addNode(18);
        binaryTree.addNode(22);
        binaryTree.addNode(23);
        binaryTree.addNode(27);
        binaryTree.addNode(24);
        binaryTree.addNode(150);
        binaryTree.inOrderTraversal(binaryTree.getRoot());
    }
}
