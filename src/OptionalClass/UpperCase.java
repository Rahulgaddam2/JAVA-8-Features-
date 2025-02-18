package OptionalClass;

import java.util.Optional;

public class UpperCase {
    public static void main(String[] args) {
          Optional<String> nameContiner =  getName();

          if(nameContiner.isPresent()){
              String result = nameContiner.get();
              result = result.toUpperCase();
              System.out.println(result);
          }else {
              System.out.println("Value is not available");
          }
    }

    public static Optional<String> getName(){

        String name = "Rahul";

        Optional<String> value = null;
        if(name == null){
            value = Optional.empty();
        }else{
            value = Optional.of(name);
        }

        return value;
    }
}
