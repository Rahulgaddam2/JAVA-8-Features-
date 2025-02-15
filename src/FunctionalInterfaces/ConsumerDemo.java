package FunctionalInterfaces;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        // list of value : names are - "rahul" , "vishnu" , "yashwant"
        // print all in upper cases

        List<String> names = Arrays.asList("rahul" , "vishnu" , "yashwant");

        Consumer<String> toUpperCase = name -> System.out.print(name.toUpperCase() + " ");

        names.forEach(toUpperCase);


    }
}
