package day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterCSV {

    private static String filePath = "file.csv";

    public static void createCSVFile() {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Запись заголовка
            writer.write("Название;Размер;Кол-во");
            writer.newLine();

            // Запись данных
            writer.write("Ботинки HS РАН-Р 400 чер. ЗП;45;4");
            writer.newLine();
            writer.write("Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.;37;1");
            writer.newLine();
            writer.write("Туфли XYZ модель;39;2");
            writer.newLine();
            writer.write("Кроссовки ABC;42;10");
            writer.newLine();
            writer.write("Сапоги DEF;38;5");
            writer.newLine();
            writer.write("Ботильоны GHI;36;3");
            writer.newLine();
            writer.write("Тапочки JKL;41;7");
            writer.newLine();
            writer.write("Кеды MNO;40;9");
            writer.newLine();
            writer.write("Сандалии PQR;37;0");
            writer.newLine();
            writer.write("Балетки STU;38;4");
            writer.newLine();
            writer.write("Ботинки VWX;43;2");
            writer.newLine();
            writer.write("Туфли YZ;39;8");
            writer.newLine();
            writer.write("Кроссовки 123;42;11");
            writer.newLine();
            writer.write("Сапоги 456;39;0");
            writer.newLine();
            writer.write("Ботильоны 789;37;0");
            writer.newLine();
            writer.write("Тапочки 012;38;9");
            writer.newLine();
            writer.write("Кеды 345;41;12");
            writer.newLine();
            writer.write("Сандалии 678;37;7");
            writer.newLine();
            writer.write("Балетки 901;36;0");
            writer.newLine();

            System.out.println("CSV-файл успешно создан и заполнен данными.");
        } catch (
                IOException e) {
            System.out.println("Ошибка при создании и заполнении CSV-файла: " + e.getMessage());
        }
    }
}
