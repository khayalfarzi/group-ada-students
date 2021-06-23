package az.coders.ada_students.lessons.lesson_8.grade;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThreadExample {

    // This Class working with one main thread and count all Azerbaijan regions
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\ideaproject\\spring-boot-jwt-without-JPA\\ada-students\\src\\main\\java\\az\\coders\\ada_students\\lessons\\lesson_8\\grade\\world-cities_csv (1).csv");
        Scanner scanner = new Scanner(file);
        List<CsvModel> list = new ArrayList<>();

        LocalDateTime first = LocalDateTime.now();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.split(",")[1].equals("Azerbaijan")) {
                list.add(new CsvModel(
                        line.split(",")[0],
                        line.split(",")[1]));
            }
        }
        LocalDateTime second = LocalDateTime.now();

        System.out.printf("=> Time difference : %s \n", (second.getNano() - first.getNano()));
        System.out.printf("=> Count of Azerbaijan regions : %s", list.size());
        System.out.println();
        System.out.print("=> List of Azerbaijan regions : \n");
        list.forEach(System.out::println);
        System.out.println("==================================== END OF LIST ===============================");
    }
}
