package az.coders.ada_students.lessons.lesson_27.file;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        File file = FileDefinition.getFile();
        List<String> text =
                Arrays.asList("Nadir", "Toghrul", "Nabat", "Khayal");
        FileWriterEx.write(file, text);
        FileReaderEx.read(file);

    }
}
