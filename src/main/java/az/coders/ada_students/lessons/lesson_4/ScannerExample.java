package az.coders.ada_students.lessons.lesson_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\ideaproject\\spring-boot-jwt-without-JPA\\ada-students\\src\\main\\java\\az\\coders\\ada_students\\lessons\\lesson_4\\assignment\\shapes.txt"));
        while (scanner.hasNext())
            System.out.printf("=> %s \n", scanner.nextLine());
    }
}