package DefaultStaticMethodsinInterfaces.StaticMethods;

public interface InterfaceOne {
    void printNames(); // Abstract method

    static String staticMethodOne(){
        return "Hi i am  method one";
    }

    static void staticMethodTwo(){
        System.out.println("Hi i am method two");
    }

}
