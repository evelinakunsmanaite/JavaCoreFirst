package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSVFile {

    private static List<Shoes> readFile() {
        List<Shoes> shoesList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("file.csv"))) {
            String liens = "";
            boolean isFirstLine = true;

            while ((liens = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String[] line = liens.split(";");

                String name = line[0];
                int size = Integer.parseInt(line[1]);
                int quantity = Integer.parseInt(line[2]);

                if (quantity == 0) {
                    Shoes shoes = new Shoes(name, size, quantity);
                    shoesList.add(shoes);
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка");
        }
        return shoesList;
    }

    public static void putToCSVFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("shoesFile"))) {
            writer.write("Название;Размер;Количество");
            writer.newLine();
            List<Shoes> shoesList = readFile();
            for (Shoes shoes : shoesList) {
                writer.write(shoes.getName() + ";" + shoes.getSize() + ";" + shoes.getQuality());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
