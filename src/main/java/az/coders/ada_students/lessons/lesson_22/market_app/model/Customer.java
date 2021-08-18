package az.coders.ada_students.lessons.lesson_22.market_app.model;

import java.util.Arrays;
import java.util.Objects;

public class Customer extends Person{

    private String customerNo;

    private Product[] products;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return customerNo.equals(customer.customerNo) && Arrays.equals(products, customer.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), customerNo);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNo='" + customerNo + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
