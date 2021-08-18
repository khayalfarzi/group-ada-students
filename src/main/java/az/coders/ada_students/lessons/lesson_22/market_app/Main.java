package az.coders.ada_students.lessons.lesson_22.market_app;

import az.coders.ada_students.lessons.lesson_22.market_app.db.DB;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Customer;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Person;
import az.coders.ada_students.lessons.lesson_22.market_app.util.CustomerHelper;
import az.coders.ada_students.lessons.lesson_22.market_app.util.ProductLoader;

import java.util.Scanner;

import static az.coders.ada_students.lessons.lesson_22.market_app.util.Printer.print;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        print("WELCOME TO THE APPLICATION !");

        boolean openMarket = true;

        while (openMarket) {
            print("Enter your name , surname, age and gender");
            String info = SCANNER.next();

            Customer customer = CustomerHelper.initiateCustomer(info);

            DB.products = ProductLoader.loadProduct();

            print(" =============  PRODUCTS ============");
            ProductLoader.showProduct(DB.products);
            print(" ====================================");

            print("Please enter product id and count (Ex: id,count (1,5 3,7))");
            info = "";
            info = SCANNER.next();


            openMarket = false;
        }

    }
}
