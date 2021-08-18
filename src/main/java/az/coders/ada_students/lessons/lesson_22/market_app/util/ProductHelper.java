package az.coders.ada_students.lessons.lesson_22.market_app.util;

import az.coders.ada_students.lessons.lesson_22.market_app.db.DB;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Customer;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductHelper {

    public static void initiateProduct(String info) {

        String[] arr = info.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String[] arrP = arr[i].split(",");

            for (Product product : DB.products) {

            }
        }
    }
}