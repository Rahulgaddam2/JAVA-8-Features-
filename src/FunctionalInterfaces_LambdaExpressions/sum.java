package FunctionalInterfaces_LambdaExpressions;

@FunctionalInterface
public interface sum {

    int addNumber(int a , int b); // With Parameters

    default void info(){
        System.out.println("this is default method");
    }

    static void info2(){
        System.out.println("this is static method");
    }

}
