package FunctionalInterfaces_LambdaExpressions;

@FunctionalInterface // Annotation for functional interface
public interface Calculate {

    void printName(); // we need to have only one abstract method
                      // abstract method with zero parameters

    // But we can have n number of default methods and static methods

    default void methodOne(){
        System.out.println("default method one");
    }

    static void methodTwo(){
        System.out.println("static method two");
    }

}
