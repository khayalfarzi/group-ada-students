package az.coders.ada_students.lessons.lesson_27.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderEx {

    public static void read(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert scanner != null;
        show(scanner);
    }

    private static void show(Scanner scanner) {
        while (scanner.hasNext())
            System.out.println(scanner.nextLine());
    }
}
