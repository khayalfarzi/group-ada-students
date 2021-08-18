package az.coders.ada_students.lessons.lesson_22.market_app.util;

import az.coders.ada_students.lessons.lesson_22.market_app.model.Product;

import static az.coders.ada_students.lessons.lesson_22.market_app.util.Printer.print;

public class ProductLoader {

    public static Product[] loadProduct() {

        Product[] products = new Product[10];

        Product product = new Product(1, "A", 10.1);
        products[0] = product;

        product = new Product(2, "A", 10.1);
        products[0] = product;

        product = new Product(3, "B", 10.1);
        products[0] = product;

        product = new Product(4, "C", 10.1);
        products[0] = product;

        product = new Product(5, "D", 17.1);
        products[0] = product;

        product = new Product(6, "E", 14.1);
        products[0] = product;

        return products;
    }

    public static void showProduct(Product[] products) {
        for (Product product : products) {
            print(product);
        }
    }
}