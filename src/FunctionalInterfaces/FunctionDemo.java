package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // requirement : Find half value from a given value

        // Here are we are taking Function functional interface which contains one abstract method called apply
        Function<Integer , Double> halfValue = a -> a/2.0; // here i used lambda expression

        Double result = halfValue.apply(10); // here apply is a predefined functional interface

        System.out.println(result);

        Function<String , String> upperCase = String::toUpperCase; // here I used method references

        Function<String , String> lowerCase = String::toLowerCase;

        System.out.println(upperCase.apply("rahul"));


        // null check
        // andThan method (default method in function functional interface)

        Function<String , String> fuction1 = a -> a == null ? "enter valid String " : a;

        String nullCheck = fuction1.andThen(upperCase).apply("test");

        System.out.println(nullCheck);

        String nullCheck2 = fuction1.andThen(upperCase).apply(null);

        System.out.println(nullCheck2);

        // compose method (default method in function functional interface)

        String nullcheck3 = fuction1.compose(lowerCase).apply("compose");

        System.out.println(nullcheck3);

        // identity method (default method in function functional interface)
        // here input and output data type should be same
        Function<Integer , Integer> identity = Function.identity();
        System.out.println(identity.apply(100));


        Function<Integer , Integer> example = a -> a*a;

        int value = example.apply(15);

        System.out.println(value);

    }
}
