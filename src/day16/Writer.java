package day16;

import java.io.*;

public class Writer {

    public static File firstFileWriter() throws IOException {
        File file = new File("day16file1.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        int count = 0;
        while (count <= 1000) {
            writer.write((int) (Math.random() * 100) + " ");
            count++;
        }
        writer.close();
        return file;
    }

    public static File secondFileWriter() throws IOException {
        File file = new File("day16file2.txt");
        BufferedReader reader = new BufferedReader(new FileReader(firstFileWriter()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String[] stringNumbers = reader.readLine().split(" ");
        double avg;
        int sum = 0;
        int count = 20;
        for (int i = 0; i < stringNumbers.length; i++) {
            if (i < count) {
                sum += Integer.parseInt(stringNumbers[i]);
            } else {
                count += 20;
                avg = (double) sum / 20;
                writer.write(String.format("%.2f", avg) + " ");
                sum = 0;
            }
        }
        writer.close();
        reader.close();
        return file;
    }

    public static void secondFileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(secondFileWriter()));
        String[] numbers = reader.readLine().replaceAll(",", ".").split(" ");
        double sum = 0;
        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }
        double avg = sum / numbers.length;
        System.out.println("Сумма: " + avg + " --> " + Math.round(avg));
    }
}
