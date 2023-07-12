package video;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void getFile(){
        String separator = File.separator;
        String path = separator + "D:"+separator+"javaa"+separator+"file.txt";
        File file = new File(path);
        Scanner scanner;
        try {
             scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
