package OptionalClass;

import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email = "rahul@gmail.com";
        // of , empty , ofNullable - these are the 3 static methods

//        Optional<Objects> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.ofNullable(email);
        System.out.println(emailOptional2);

        // now to get the value from the Optional container we use get() method

        System.out.println(emailOptional2.get());

        // isPresent

        String name = null;

        Optional<String> value = Optional.ofNullable(name);

        if(value.isPresent()){
            System.out.println(value.get());
        }else {
            System.out.println("value not present");
        }

        // orElse() method

        String surname = null;

        Optional<String> sureName = Optional.ofNullable(surname);

        String defaultOptional = sureName.orElse("default value");

        System.out.println(defaultOptional);

        // orElseGet() method

        String firstName = null;

        Optional<String> result = Optional.ofNullable(firstName);

        String result2 = result.orElseGet(() -> "value not present");

        System.out.println(result2);

        // orElseThrow() method

        String lastName = null;

        Optional<String> result3 = Optional.ofNullable(lastName);

        String result4 = result3.orElseThrow(() -> new IllegalArgumentException());
    }
}
