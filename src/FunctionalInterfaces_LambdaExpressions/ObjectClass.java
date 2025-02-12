package FunctionalInterfaces_LambdaExpressions;

public class ObjectClass {
    public static void main(String[] args) {

        // Interface can refer implemented class instance

        Calculate one = new ClassOne();

        one.printName();

        // Lambda expression implementations

        Calculate lambda = () -> {  // zero parameters
            System.out.println("used lambda expression");
        };

        Calculate lambda2 = () -> {
            System.out.println("used lambda expression again for the same interface");
        };

        lambda.printName();
        lambda2.printName();


        one.methodOne();  // executed default methods

        Calculate.methodTwo(); // executed static methods

    }
}
