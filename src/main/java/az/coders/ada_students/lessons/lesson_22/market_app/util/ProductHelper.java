package az.coders.ada_students.lessons.lesson_22.market_app.util;

import az.coders.ada_students.lessons.lesson_22.market_app.db.DB;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Customer;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductHelper {

    public static void initiateProduct(String info, Customer customer, Product[] arrP) {

        String[] arr = info.split(" ");
        Product[] products = new Product[10];

        for (int i = 0; i < arr.length; i++) {

            String id = arr[i].split(",")[0];
            String count = arr[i].split(",")[1];

            for (int j = 0; j < arrP.length; j++) {
//                if (arrP[i].getId().equals(id))
            }
        }

        customer.setProducts(products);
    }
}