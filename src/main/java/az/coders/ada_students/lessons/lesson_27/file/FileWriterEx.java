package az.coders.ada_students.lessons.lesson_27.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterEx {

    public static void write(File file, List<String> text) {
        try {
            FileWriter writer = new FileWriter(file);
            text.forEach(
                    txt -> {
                        try {
                            writer.write(txt + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            );

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
