package az.coders.ada_students.lessons.lesson_22.market_app.util;

import az.coders.ada_students.lessons.lesson_22.market_app.model.Customer;
import az.coders.ada_students.lessons.lesson_22.market_app.model.Person;
import com.sun.tools.javac.util.StringUtils;

public class CustomerHelper {

    public static Customer initiateCustomer(String info) {

        String[] arr = info.split(",");

        Customer customer = new Customer();
        customer.setName(arr[0]);
        customer.setSurname(arr[1]);
        customer.setAge(Integer.parseInt(arr[2]));

        if (arr[3].equalsIgnoreCase("male"))
            customer.setGender(Person.Gender.MALE);
        else customer.setGender(Person.Gender.FEMALE);


        // Generate randomly and check it is unique or not
        // customer.setId();
        // customer.setCustomerNo();


        return customer;
    }
}
