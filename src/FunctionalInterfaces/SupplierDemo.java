package FunctionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        //get date and time always
        Supplier<LocalDateTime> dateTime = LocalDateTime::now; // here it is not taking any arguments

        System.out.println(dateTime.get());

        System.out.println(dateTime.get());
    }
}
