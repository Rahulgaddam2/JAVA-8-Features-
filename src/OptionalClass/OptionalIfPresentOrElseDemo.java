package OptionalClass;

import java.util.Optional;

public class OptionalIfPresentOrElseDemo {
    public static void main(String[] args) {

        //ifPresent()
        Optional<String> result = getName();

        result.ifPresent(val -> System.out.println(val.toUpperCase()));

        //ifPresentOr()

        result.ifPresentOrElse(

                // if value is present
                val -> System.out.println(val.toUpperCase()),

                // if value is not present
                () -> System.out.println("value not available")
        );


    }

    public static Optional<String> getName(){

        String name = null;

        Optional<String> value;

        if(name == null){
            value = Optional.empty();
        }else{
            value = Optional.of(name);
        }

        return value;
    }
}
