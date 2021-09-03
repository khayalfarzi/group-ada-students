package az.coders.ada_students.lessons.lesson_27.file;

import java.io.File;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        String fileName = "/Applications/idea/group-ada-students/src/main/java/az/coders/ada_students/lessons/lesson_27/file/main.txt";


        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("File can not created");
            }
        }


    }
}
