package DefaultStaticMethodsinInterfaces.DefaultMethods;

public interface DefaultInterface {

    void printNames();  // these are abstract methods
    int getPhoneNumbers();

    // To create a default method we should use default keyword

    default void defaultMethod(){
        System.out.println("default method is created");
    }

    default int addNumbers(){
        int a = 10;
        int b = 20;
        return a + b;
    }

    default void methodthree(){
        System.out.println("i am method 3 in interface one");
    }

}
