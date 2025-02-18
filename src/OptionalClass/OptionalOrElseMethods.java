package OptionalClass;

import java.util.Optional;

public class OptionalOrElseMethods {
    public static void main(String[] args) {

        Optional<String> result = getName();

        //or()

        String results = result.or(
                () -> {
                    return Optional.of("Rahul (Optional value)");
                }

                ).get();

        System.out.println(results);

    }

    public static Optional<String> getName(){

        String name = "Rahul";

        Optional<String> value;

        if(name == null){
            value = Optional.empty();
        }else{
            value = Optional.of(name);
        }

        return value;
    }
}
