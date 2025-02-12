package FunctionalInterfaces_LambdaExpressions;

public class ObjectClassTwo {
    public static void main(String[] args) {

        sum add = (int a , int b) -> {
            int addition = a + b;
            System.out.println("Functional interface with parameters");
            return addition;
        };

        System.out.println(add.addNumber(10,20));

        // we can also create one more lambda expression for the same interface

        sum add2 = (a , b) -> { // you do not need to add the data types (its optional)
            int addition = a + b;
            System.out.println("Other lambda expression for the same interface");
            return addition;
        };

        int result = add2.addNumber(20,80);

        System.out.println(result);

        // if there is only one line of code we do not need to add the {}
        sum add3 = (a,b) -> a*b;

        int result3 = add3.addNumber(5,6);

        System.out.println(result3);
    }
}
