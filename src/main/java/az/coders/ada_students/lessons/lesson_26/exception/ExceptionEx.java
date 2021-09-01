package az.coders.ada_students.lessons.lesson_26.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx {

    public static void main(String[] args) {

        int f = 2, s = 0;

        int r = f / s;

        System.out.println(r);


    }

    private static int checkedException() throws
            FileNotFoundException,
            NullPointerException,
            RuntimeException {

        File file = new File("file.txt");

//        try {

        FileReader reader = new FileReader(file);
        System.out.println(reader);

        throw new FileNotFoundException();

//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        } catch (NullPointerException ex) {
//            ex.printStackTrace();
//        } catch (ArithmeticException ex) {
//            ex.printStackTrace();
//        }
    }
}
